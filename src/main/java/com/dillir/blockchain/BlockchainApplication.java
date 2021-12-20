package com.dillir.blockchain;

import com.dillir.blockchain.pojo.BtcCurrency;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BlockchainApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(BlockchainApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BlockchainApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) {
		return args -> {
			BtcCurrency currency = restTemplate.getForObject(
					"https://api.gemini.com/v1/pubticker/btcusd", BtcCurrency.class);
			LOGGER.info(currency.toString());
		};
	}
}
