package hr.brewer.models;

import lombok.Data;

public @Data class AuthToken {

    private String token;
    private String username;

    public AuthToken(){ }

    public AuthToken(String token, String username){
        this.token = token;
        this.username = username;
    }

    public AuthToken(String token){
        this.token = token;
    }

}
