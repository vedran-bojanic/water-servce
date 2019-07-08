package hr.brewer.models;

import lombok.Data;

public @Data class AuthToken {

    private String token;
    private String username;
    private Long userId;

    public AuthToken(){ }

    public AuthToken(String token, String username, Long userId){
        this.token = token;
        this.username = username;
        this.userId = userId;
    }

    public AuthToken(String token){
        this.token = token;
    }

}
