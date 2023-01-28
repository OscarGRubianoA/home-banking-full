package com.mindhub.homebanking;

import com.mindhub.homebanking.models.Account;
import com.mindhub.homebanking.models.Client;
import com.mindhub.homebanking.repositories.AccountRepository;
import com.mindhub.homebanking.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Instant;
import java.time.LocalDateTime;

@SpringBootApplication
public class HomebankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomebankingApplication.class, args);



	}
	@Bean
	public CommandLineRunner initData(ClientRepository clientRepository, AccountRepository accountRepository){
		return args ->{
			Client cliente1 = new Client("Oscar", "Rubiano", "oscar@gmail.com");
			clientRepository.save(cliente1);

			Account account1=new Account("Vin001", LocalDateTime.now(),256321.00);
			System.out.println(account1);
			cliente1.AddCount(account1);
			accountRepository.save(account1);

		};
	}
}
