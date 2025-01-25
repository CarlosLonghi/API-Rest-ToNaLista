package com.carloslonghi.tonalista.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPK {
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private ItemList list;

    /* NO ARGS CONSTRUCTOR */
    public BelongingPK() {}

    /* ARGS CONSTRUCTOR */
    public BelongingPK(Item item, ItemList list) {
        this.item = item;
        this.list = list;
    }

    /* GETTERS AND SETTERS */
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public ItemList getList() {
        return list;
    }

    public void setList(ItemList list) {
        this.list = list;
    }

    /* EQUALS and HASHCODE */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(item, that.item) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, list);
    }
}
