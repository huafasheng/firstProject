package com.demo.entity;

import lombok.Data;

/**
 * @author underwood francis
 */
@Data
public class Result {

    private int code;
    public Result(int code) {
        this.code = code;
    }
}
