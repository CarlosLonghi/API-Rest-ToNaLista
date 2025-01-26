package com.carloslonghi.tonalista.projections;

import jakarta.persistence.EnumType;

public interface ItemMinProjection {

    Long getId();
    String getName();
    Double getQuantity();
    String getUnit();
    EnumType getPriority();
    EnumType getStatus();
    Integer getPosition();
}
