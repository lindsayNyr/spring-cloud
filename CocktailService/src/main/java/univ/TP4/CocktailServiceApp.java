package univ.TP4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import univ.TP4.model.Cocktail;
import univ.TP4.repository.CocktailRespository;

import java.util.ArrayList;

@EnableDiscoveryClient
@SpringBootApplication
public class CocktailServiceApp {

	public static void main(String args[]) {
		SpringApplication.run(CocktailServiceApp.class);
	}

}
