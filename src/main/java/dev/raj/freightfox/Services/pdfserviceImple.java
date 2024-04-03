package dev.raj.freightfox.Services;

import dev.raj.freightfox.dtos.Item;
import dev.raj.freightfox.dtos.pdftype;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class pdfserviceImple implements pdfService{

    @Override
    public Context createPdf(pdftype pdfinfo) {

        Context context = new Context();
        Map<String,Object> map = new HashMap<>();
        map.put("users",pdfinfo);
        context.setVariables(map);
        return context;
    }
}
