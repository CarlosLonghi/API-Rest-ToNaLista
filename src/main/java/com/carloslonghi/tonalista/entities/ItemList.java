package com.carloslonghi.tonalista.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_item_list")
public class ItemList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    /* NO ARGS CONSTRUCTOR */
    public ItemList() {}

    /* ARGS CONSTRUCTOR */
    public ItemList(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    /* GETTERS and SETTERS*/
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

    /* EQUALS and HASHCODE */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemList itemList = (ItemList) o;
        return Objects.equals(id, itemList.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
