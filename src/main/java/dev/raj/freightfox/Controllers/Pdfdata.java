package dev.raj.freightfox.Controllers;

import ch.qos.logback.classic.pattern.EnsureExceptionHandling;
import dev.raj.freightfox.Services.pdfGenerator;
import org.apache.coyote.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import dev.raj.freightfox.Services.pdfService;
import dev.raj.freightfox.dtos.pdftype;
import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.context.Context;
import org.thymeleaf.TemplateEngine;

import org.thymeleaf.spring6.ISpringTemplateEngine;
import org.thymeleaf.spring6.SpringTemplateEngine;

import java.util.List;

@RestController
public class Pdfdata {
    pdftype pdfcontent;

    @Autowired
    private pdfGenerator pdfGenerator;
    pdfService pdfservice;

    @Autowired
    private SpringTemplateEngine springTemplateEngine;
     Context context = new Context();
    public Pdfdata(pdfService pdfservice){
        this.pdfservice = pdfservice;
    }

    @PostMapping("/createpdf")
    public String createpdf(@RequestBody pdftype pdf )
    {
        String finalHtml = null;
        Context data=  pdfservice.createPdf(pdf);
        finalHtml = springTemplateEngine.process("home_page", data);
        pdfGenerator.htmltopdf(finalHtml);
        return "success";
    }
}
