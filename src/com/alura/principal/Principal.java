package com.alura.principal;

import com.alura.consultas.tasamoneda.CosultaMonedas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        CosultaMonedas cliente = new CosultaMonedas();
        Menu menu = new Menu();
        int opcion = 0;
        double cantidad;
        double resultado;

        while (opcion != 7) {
            menu.crearMenu();
            try {
                opcion = Integer.valueOf(lectura.nextInt());
                switch (opcion) {

                    case 1:
                        System.out.println("Ingrese la cantidad que desea convertir:");
                        cantidad = Double.valueOf(lectura.next());
                        cliente.solicitarDato("USD", "COP", cantidad);
                        resultado = cliente.convertir(cantidad);
                        System.out.println(String.format("El valor %.2f [USD] corresponde al valor final de ==> %.2f [COP]",
                                cantidad, resultado));
                        break;

                    case 2:
                        System.out.println("Ingrese la cantidad que desea convertir:");
                        cantidad = Double.valueOf(lectura.next());
                        cliente.solicitarDato("COP", "USD", cantidad);
                        resultado = cliente.convertir(cantidad);
                        System.out.println(String.format("El valor %.2f [COP] corresponde al valor final de ==> %.2f [USD]",
                                cantidad, resultado));
                        break;

                    case 3:
                        System.out.println("Ingrese la cantidad que desea convertir:");
                        cantidad = Double.valueOf(lectura.next());
                        cliente.solicitarDato("USD", "EUR", cantidad);
                        resultado = cliente.convertir(cantidad);
                        System.out.println(String.format("El valor %.2f [USD] corresponde al valor final de ==> %.2f [EUR]",
                                cantidad, resultado));
                        break;

                    case 4:
                        System.out.println("Ingrese la cantidad que desea convertir:");
                        cantidad = Double.valueOf(lectura.next());
                        cliente.solicitarDato("EUR", "USD", cantidad);
                        resultado = cliente.convertir(cantidad);
                        System.out.println(String.format("El valor %.2f [EUR] corresponde al valor final de ==> %.2f [USD]",
                                cantidad, resultado));
                        break;

                    case 5:
                        System.out.println("Ingrese la cantidad que desea convertir:");
                        cantidad = Double.valueOf(lectura.next());
                        cliente.solicitarDato("EUR", "COP", cantidad);
                        resultado = cliente.convertir(cantidad);
                        System.out.println(String.format("El valor %.2f [EUR] corresponde al valor final de ==> %.2f [COP]",
                                cantidad, resultado));
                        break;

                    case 6:
                        System.out.println("Ingrese la cantidad que desea convertir:");
                        cantidad = Double.valueOf(lectura.next());
                        cliente.solicitarDato("COP", "EUR", cantidad);
                        resultado = cliente.convertir(cantidad);
                        System.out.println(String.format("El valor %.2f [COP] corresponde al valor final de ==> %.2f [EUR]",
                                cantidad, resultado));
                        break;

                    case 7:
                        System.out.println("Finalizando Programa...");
                        System.out.println("Programa finalizado con exito!");
                        break;

                    default:
                        System.out.println("opcion invalida!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Formato de numero invalido " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Finalizando aplicacion, error inesperado: " + e.getMessage());
            }
        }
    }
}