package com.demo.entity;

import lombok.Data;

@Data
public class PayWay {
    private Integer payid;

    private String payname;

    private Double discount;

    private Integer type;
}
