package com.swapcat.swapcatback.data.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "HISTORY")
public class HistoryModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel user;
    private ZonedDateTime date;
    private String origin;
    private String destiny;
    private Double quantity;

    @Builder
    public HistoryModel(UserModel user, ZonedDateTime date, String origin, String destiny, double quantity) {
        this.user = user;
        this.date = date;
        this.origin = origin;
        this.destiny = destiny;
        this.quantity = quantity;
    }
}
