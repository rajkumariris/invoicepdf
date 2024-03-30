package dev.raj.freightfox.Services;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.html2pdf.resolver.font.DefaultFontProvider;
import com.itextpdf.kernel.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
@Service
public class pdfGenerator {
    public String htmltopdf(String html){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try{
            PdfWriter pdfWriter = new PdfWriter(byteArrayOutputStream);
            DefaultFontProvider defaultFontProvider = new DefaultFontProvider();
            ConverterProperties converterProperties = new ConverterProperties();
            converterProperties.setFontProvider(defaultFontProvider);
            HtmlConverter.convertToPdf(html, pdfWriter, converterProperties);

            FileOutputStream fout = new FileOutputStream("C:/Users/dorka/OneDrive/Desktop/pdffolder/pdffile.pdf");
            byteArrayOutputStream.writeTo(fout);
            byteArrayOutputStream.close();
            byteArrayOutputStream.flush();
            fout.close();
            return null;
        }
        catch(Exception e){

        }
        return null;
    }
}
