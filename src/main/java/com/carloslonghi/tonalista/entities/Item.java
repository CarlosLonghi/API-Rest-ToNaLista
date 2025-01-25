package com.carloslonghi.tonalista.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double quantity;

    @Column(nullable = false)
    private String unit;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ItemStatus status;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ItemPriority priority;

    public enum ItemStatus {
        PENDING,
        PURCHASED
    }

    public enum ItemPriority {
        LOW,
        MEDIUM,
        HIGH
    }

    /* NO ARGS CONSTRUCTOR */
    public Item() {}

    /* ARGS CONSTRUCTOR */
    public Item(Long id, String name, Double quantity, String unit, ItemStatus status, ItemPriority priority) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.status = status;
        this.priority = priority;
    }

    /* GETTERS AND SETTERS */
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

    public ItemStatus getStatus() {
        return status;
    }

    public void setStatus(ItemStatus status) {
        this.status = status;
    }

    public ItemPriority getPriority() {
        return priority;
    }

    public void setPriority(ItemPriority priority) {
        this.priority = priority;
    }

    /* EQUALS and HASHCODE */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}