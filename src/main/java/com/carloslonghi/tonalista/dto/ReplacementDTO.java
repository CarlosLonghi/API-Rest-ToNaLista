package com.carloslonghi.tonalista.dto;

public class ReplacementDTO {

    private Integer sourceIndex;
    private Integer destinationIndex;

    /* GETTERS and SETTERS */
    public Integer getSourceIndex() {
        return sourceIndex;
    }

    public void setSourceIndex(Integer sourceIndex) {
        this.sourceIndex = sourceIndex;
    }

    public Integer getDestinationIndex() {
        return destinationIndex;
    }

    public void setDestinationIndex(Integer destinationIndex) {
        this.destinationIndex = destinationIndex;
    }
}
