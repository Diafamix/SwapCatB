package com.swapcat.swapcatback.data.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Banned_User")
public class BannedUsersModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "user_id")
    private UserModel user;
    private LocalDateTime bannedAt;
    private LocalDateTime expiresAt;

    @Builder
    public BannedUsersModel(LocalDateTime bannedAt, LocalDateTime expiresAt, UserModel user) {
        this.bannedAt = bannedAt;
        this.expiresAt = expiresAt;
        this.user = user;
    }

}
