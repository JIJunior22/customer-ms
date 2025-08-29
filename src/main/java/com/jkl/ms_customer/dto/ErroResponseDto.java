package com.jkl.ms_customer.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ErroResponseDto {
    private String uriPath;
    private LocalDateTime erroTime;
    private String erroMessage;
    private String httpErrorStatus;
}
