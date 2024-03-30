package dev.raj.freightfox.dtos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;

import java.util.List;
import java.util.Locale;

@Getter
@Setter
public class pdftype  {

    private String Seller;
    private String sellerGstin;

    private String sellerAddress;

    private String buyer;

    private String buyerGstin;
    private String buyerAddress;

    private List<Item> items;


}
