package com.jkl.ms_customer.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Species {

    CANINO,
    FELINO,
    AVE;

    @JsonCreator
    public Species fromString(String value) {
        return Species.valueOf(value.toUpperCase());
    }


}
