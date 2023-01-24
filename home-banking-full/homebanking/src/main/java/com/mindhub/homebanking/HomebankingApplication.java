package com.mindhub.homebanking;

import com.mindhub.homebanking.models.Cliente;
import com.mindhub.homebanking.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HomebankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomebankingApplication.class, args);



	}
	@Bean
	public CommandLineRunner initData(ClientRepository clientRepository){
		return args ->{
			Cliente cliente1 = new Cliente("Oscar", "Rubiano", "oscar@gmail.com");
			clientRepository.save(cliente1);
		};
	}
}
