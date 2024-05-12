package com.roxilerSystems.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Statistics {
    private int totalSaleAmount;
    private int totalSoldItems;
    private int totalNotSoldItems;
}
