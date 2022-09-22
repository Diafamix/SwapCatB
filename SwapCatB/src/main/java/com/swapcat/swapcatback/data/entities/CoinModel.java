package com.swapcat.swapcatback.data.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "COINS")
public class CoinModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double id;
    @Column(unique = true)
    private String coinId;
    private String name;
    @Column(unique = true)
    private String symbol;

    @Builder
    public CoinModel(String coinId, String name, String symbol) {
        this.coinId = coinId;
        this.name = name;
        this.symbol = symbol;
    }






}
