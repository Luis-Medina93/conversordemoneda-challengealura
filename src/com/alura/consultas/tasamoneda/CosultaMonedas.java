package com.alura.consultas.tasamoneda;

import com.google.gson.*;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class CosultaMonedas {

    private double Coversion;

    public Record solicitarDato(String monedaBase, String monedaDestino, double cantidadConvertir){

        String creaUrl = "https://v6.exchangerate-api.com/v6/5c44b675800792932b6861db/pair/"
                +monedaBase+"/"+monedaDestino+"/"+cantidadConvertir;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(creaUrl))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String Json = response.body();

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                    .create();

            Record miRecord = gson.fromJson(Json, Record.class);

            this.Coversion = miRecord.conversionRate();
            return miRecord;
        } catch (Exception e){
            throw new RuntimeException("No se encontro datos");
        }
    }

    public Double convertir(double cantidad){
        return cantidad * this.Coversion;
    }

}

