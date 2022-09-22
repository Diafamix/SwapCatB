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
@Table(name = "Staking")
public class StackingModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double id;
    @ManyToOne
    private CoinModel coin;
    @Column(name = "Create_at")
    private LocalDateTime createAt;
    @Column(name = "Days_to_expire")
    private int daysToExpire;
    private double quantity;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel user;

    @Builder
    public StackingModel(CoinModel coin, LocalDateTime createAt, int daysToExpire, double quantity, UserModel user) {
        this.coin = coin;
        this.createAt = createAt;
        this.daysToExpire = daysToExpire;
        this.quantity = quantity;
        this.user = user;
    }

}
