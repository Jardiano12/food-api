package com.jardiano.food.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodApiApplication {

    //roy fielding rest
    //Modelo de Maturidade de Richardson (RMM)
    //Possui 3 niveis
    //O nivel 2 ja é consierado como o nivel de rest

    //Conhecendo o nível 0 do RMM (POX (Plain Old XML))
      //Possui uma unica Url
    // Conhecendo o nível 1 do RMM
      //Quando começamos a fazer requisições
    public static void main(String[] args) {
        SpringApplication.run(FoodApiApplication.class, args);
    }

}
