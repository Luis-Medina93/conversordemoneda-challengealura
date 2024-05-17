package com.alura.consultas.tasamoneda;

public record Record(
        String baseCode,
        String targetCode,
        Double conversionResult,
        Double conversionRate
){

}