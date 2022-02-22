package com.example.partiel_rezquellah_hiba.interfaceAPI;

import com.example.partiel_rezquellah_hiba.model.Pilote;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PiloteService {

    public static final String ENDPOINT = "https://busin.fr";

    @GET("/drivers.json")
    Call<List<Pilote>> listPilotes();

}
