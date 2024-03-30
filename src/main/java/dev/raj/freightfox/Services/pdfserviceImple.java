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
//        pdftype pdftype1 = new pdftype();
//        pdftype1.setItems(pdfinfo.getItems());
//        pdftype1.setBuyer(pdfinfo.getBuyer());
//        pdftype1.setSeller(pdfinfo.getSeller());
//        pdftype1.setBuyerAddress(pdfinfo.getBuyerAddress());
//        pdftype1.setSellerAddress(pdfinfo.getSellerAddress());
//        pdftype1.setBuyerGstin(pdfinfo.getBuyerGstin());
//        pdftype1.setSellerGstin(pdfinfo.getSellerGstin());
////         Item item = new Item();
////     for(Item item1 : pdfinfo.getItems()){
////         pdftype1.setItems(); item1.getName();
////     };
        //pdftype1.setItems(pdfinfo.getItems());
        Context context = new Context();
        Map<String,Object> map = new HashMap<>();
        map.put("users",pdfinfo);
        context.setVariables(map);
        return context;
    }
}
