package com.dillir.blockchain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter @Setter @NoArgsConstructor
public class BtcCurrency {

    private String bid;
    private String ask;
    private BtcVolume volume;
    private String last;

    @Override
    public String toString() {
        return "{ \"bid\": \"" + bid
                + "\", \"ask\": \"" + ask
                + "\", \"volume\": {"
                + "\"BTC\": \"" + volume.getBtc()
                + "\", \"USD\": \"" + volume.getUsd()
                + "\", \"timestamp\": " + volume.getTimestamp()
                + "}, \"last\": \"" + last
                + "\"}";
    }
}
