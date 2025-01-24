package com.carloslonghi.tonalista.dto;

import com.carloslonghi.tonalista.entities.Item;

public class ItemMinDTO {
    private Long id;
    private String name;
    private Double quantity;
    private String unit;


    /* NO ARGS CONSTRUCTOR */
    public ItemMinDTO() {}

    /* ARGS CONSTRUCTOR */
    public ItemMinDTO(Item entity) {
        id = entity.getId();
        name = entity.getName();
        quantity = entity.getQuantity();
        unit = entity.getUnit();
    }

    /* GETTERS */
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }
}
