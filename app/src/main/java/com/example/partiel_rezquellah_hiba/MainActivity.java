package com.example.partiel_rezquellah_hiba;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.partiel_rezquellah_hiba.interfaceAPI.PiloteService;
import com.example.partiel_rezquellah_hiba.model.Pilote;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {
    PiloteService piloteService;

    public MainActivity(){
        piloteService = new Retrofit.Builder()
                .baseUrl(PiloteService.ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(PiloteService.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.drawable.ic_baseline_account_box_24);



        piloteService.listPilotes().enqueue(new Callback<List<Pilote>>() {
            @Override
            public void onResponse(Call<List<Pilote>> call, Response<List<Pilote>> response) {
                afficherRepos(response.body());
            }

            @Override
            public void onFailure(Call<List<Pilote>> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });
    }
    public void afficherRepos(List<Pilote> pilotes) {
        Toast.makeText(this,"nombre de pilotes : "+pilotes.size(), Toast.LENGTH_SHORT).show();
    }
}