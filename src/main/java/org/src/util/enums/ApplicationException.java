package org.src.util.enums;

import org.src.util.exceptions.ErrorCodeEnum;

public class ApplicationException extends Exception {

    private ErrorCodeEnum errorCodeEnum;

    public ApplicationException(ErrorCodeEnum errorCodeEnum){
        this.errorCodeEnum = errorCodeEnum;
    }

    public ErrorCodeEnum getErrorCodeEnum() {
        return errorCodeEnum;
    }
}
