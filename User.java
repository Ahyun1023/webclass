package kr.hs.dgsw.webclass01;

import lombok.*;
import org.springframework.lang.NonNull;

@data
public class User {
    private @NonNull String id;
    private @NonNull String name;
    private @NonNull String email;

    public User() {};

}