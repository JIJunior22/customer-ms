package com.jkl.ms_customer.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseDto {
    private String message;
    private String statusHttp;
}
