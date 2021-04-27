package com.example.demo;

import com.example.demo.data.ItemRepository;
import com.example.demo.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItemserviceApplication implements CommandLineRunner {

    private ItemRepository itemRepository;

     @Autowired
    public ItemserviceApplication(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ItemserviceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

         itemRepository.save(new Item(101,"Item1",100,10));
        itemRepository.save(new Item(102,"Item2",101,30));
        itemRepository.save(new Item(103,"Item3",102,15));
    }
}
