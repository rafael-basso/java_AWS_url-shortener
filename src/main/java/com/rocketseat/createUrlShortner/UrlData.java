package com.rocketseat.createUrlShortner;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@AllArgsConstructor
@Setter
@Getter
public class UrlData {
    //importando as funcionalidades do lombok não preciso criar getter/setter/cto manualmente

    private String originalUrl;
    private long expirationTime;
}
