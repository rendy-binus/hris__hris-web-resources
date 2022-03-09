package com.rendyezaputra.hris.hriswebresources.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;
}
