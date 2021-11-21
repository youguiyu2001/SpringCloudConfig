package com.you.springcloud.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommResult<T> {
    private Integer code;
    private String message;
    private T data;
}
