package com.jkl.ms_customer.domain;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
public class Contact {
    private String mobileNumber;
    private String phone;


}
