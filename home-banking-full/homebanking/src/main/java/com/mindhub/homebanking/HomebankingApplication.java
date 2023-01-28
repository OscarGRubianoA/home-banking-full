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
			Client cliente1 = new Client("Melba", "Morel", "melba@mindhub.com");
			clientRepository.save(cliente1);

			Account account1=new Account("VIN001", LocalDateTime.now(),5000.00);
			Account account2=new Account("VIN002", LocalDateTime.now(),7500.00);
			System.out.println(account1);
			cliente1.AddCount(account1);
			cliente1.AddCount(account2);
			accountRepository.save(account1);
			accountRepository.save(account2);

		};
	}
}
