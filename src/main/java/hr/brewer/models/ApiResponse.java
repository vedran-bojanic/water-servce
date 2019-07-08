package hr.brewer.models;

import lombok.Data;

public @Data class ApiResponse<T> {

    private int status;
    private String message;
    private Object result;

    public ApiResponse(int status, String message, Object result) {
        this.status = status;
        this.message = message;
        this.result = result;
    }

}
