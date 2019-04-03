package hr.brewer.models;

import lombok.Data;

public @Data class User {

    private String status;

    public User(String status) {
        this.status = status;
    }
}
