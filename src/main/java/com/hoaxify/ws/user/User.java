package com.hoaxify.ws.user;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "USERS")
public class User {
    @Id
    @NotNull(message = "{hoaxify.constraint.username.NotNull.message}")
    @UniqueUsername
    @Size(min = 4, max = 25)
    private String username;
    @NotNull
    @Size(min = 4, max = 25)
    private String displayName;
    //    @Pattern(regexp = "^(?=.*A-Z)(?=.*[a-z])(?=.*\\d).*$", message="{hoaxyfy.constrain.password.Pattern.message}") REGEX ile password kontrolü
    @NotNull
    @Size()
    private String password;
}
