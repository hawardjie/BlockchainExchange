package com.dillir.blockchain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter @Setter @NoArgsConstructor
public class BtcVolume {

    @JsonSetter("BTC")
    private String btc;

    @JsonSetter("USD")
    private String usd;
    
    private Long timestamp;
}
