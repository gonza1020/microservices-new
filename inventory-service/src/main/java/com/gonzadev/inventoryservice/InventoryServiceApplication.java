package com.gonzadev.inventoryservice;

import com.gonzadev.inventoryservice.model.Inventory;
import com.gonzadev.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	@Bean
	public CommandLineRunner loadData(InventoryRepository repository){
		return args -> {

			Inventory inventory = new Inventory();

			inventory.setSkuCode("iphone_14");
			inventory.setQuantity(100);

			Inventory inventory1 = new Inventory();

			inventory1.setSkuCode("iphone_15_red");
			inventory1.setQuantity(0);

			repository.save(inventory);
			repository.save(inventory1);
		};


	}
}
