package com.example.BackendDevelop.AppException;

import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.Getter;
import netscape.javascript.JSObject;

@Getter
public class AppException extends RuntimeException {

    private int status;
    private String message;

    public AppException(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
