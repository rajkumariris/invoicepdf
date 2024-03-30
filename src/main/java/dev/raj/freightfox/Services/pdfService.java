package dev.raj.freightfox.Services;

import dev.raj.freightfox.dtos.pdftype;
import org.thymeleaf.context.Context;

import java.util.List;

public interface pdfService {

    public Context createPdf(pdftype pdfinfo);

}
