package com.example.demo.ioEntity.baseForm;

/**
 * @Author ufo
 * @Date 2019/4/8 14:26
 **/
public class ResultOne {

    private String errorCode = "0";

    private String errorMessage = "success";

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ResultOne{");
        sb.append("errorCode='").append(errorCode).append('\'');
        sb.append(", errorMessage='").append(errorMessage).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
