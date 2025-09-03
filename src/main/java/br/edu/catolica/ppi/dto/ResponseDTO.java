package br.edu.catolica.ppi.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseDTO {

    private String message;

    private Integer statusCode;
}
