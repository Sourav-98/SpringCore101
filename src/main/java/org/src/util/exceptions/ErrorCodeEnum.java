package org.src.util.exceptions;

public enum ErrorCodeEnum {

    ERR_10000(10000, "Default Error Code");

    private Integer errCode;
    private String errMsg;

    ErrorCodeEnum(Integer errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    @Override
    public String toString() {
        return "ErrorCodeEnum{" +
                "errCode=" + errCode +
                ", errMsg='" + errMsg + '\'' +
                '}';
    }
}
