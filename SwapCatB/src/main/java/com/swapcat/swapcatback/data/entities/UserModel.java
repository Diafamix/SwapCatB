package com.swapcat.swapcatback.data.entities;

import com.swapcat.swapcatback.data.entities.enums.UserRole;
import com.swapcat.swapcatback.data.entities.enums.UserType;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USER")
public class UserModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double id;
    private String username;
    private String mail;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserType type;
    @Enumerated(EnumType.STRING)
    private UserRole role;

    @OneToMany(mappedBy = "user")
    private List<WalletModel> wallets = new ArrayList<>();

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<FavoritesModel> favorites = new ArrayList<>();

    @Builder
    public UserModel(String mail, String username, String password, UserRole role, UserType type) {
        this.mail = mail;
        this.username = username;
        this.password = password;
        this.role = role;
        this.type =  type;
    }

}
