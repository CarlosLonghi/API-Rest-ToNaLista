package com.carloslonghi.tonalista.dto;

import com.carloslonghi.tonalista.entities.Item;
import org.springframework.beans.BeanUtils;

public class ItemDTO {
    private Long id;
    private String name;
    private Double quantity;
    private String unit;
    private Item.ItemStatus status;
    private Item.ItemPriority priority;

    /* NO ARGS CONSTRUCTOR */
    public  ItemDTO() {}

    /* ARGS CONSTRUCTOR */
    public ItemDTO(Item entity) {
        BeanUtils.copyProperties(entity, this);
    }

    /* GETTERS and SETTERS */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Item.ItemStatus getStatus() {
        return status;
    }

    public void setStatus(Item.ItemStatus status) {
        this.status = status;
    }

    public Item.ItemPriority getPriority() {
        return priority;
    }

    public void setPriority(Item.ItemPriority priority) {
        this.priority = priority;
    }
}
