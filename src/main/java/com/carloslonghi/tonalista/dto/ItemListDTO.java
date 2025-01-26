package com.carloslonghi.tonalista.dto;

import com.carloslonghi.tonalista.entities.ItemList;

public class ItemListDTO {
    private Long id;
    private String name;

    /* NO ARGS CONSTRUCTOR */
    public ItemListDTO() {}

    /* ARGS CONSTRUCTOR */
    public ItemListDTO(ItemList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    /* GETTERS */
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
