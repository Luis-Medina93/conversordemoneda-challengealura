package com.alura.principal;

import java.util.Scanner;

public class Menu {

    public void crearMenu(){
        String menu = """
                ************************************************************
                Elija una opcion:
                
                1) Dólar a Peso Colombiano
                2) Peso Colombiano a Dólar
                3) Dólar a Euros
                4) Euros a Dólar
                5) Euros a Peso Colombiano
                6) Peso Colombiano a Euros
                7) Salir
                
                *************************************************************            
                """;
        System.out.println(menu);
    }


}
