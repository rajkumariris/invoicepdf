package dev.raj.freightfox.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    private  String name;
    private String quantity;
    private float rate;
    private float amount;
}
