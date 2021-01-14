package io.gabrielaloho.cars;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CarsAdapter carsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        carsAdapter = new CarsAdapter(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
       recyclerView.setAdapter(carsAdapter);
        getCarsFromApi();
    }

    private void getCarsFromApi() {
        Call<CarsResponse> getCar = RetrofitClient.getInstance().getApi().getCars();

        getCar.enqueue(new Callback<CarsResponse>() {
            @Override
            public void onResponse(Call<CarsResponse> call, Response<CarsResponse> response) {
                carsAdapter.setCars(response.body());
                recyclerView.setAdapter(carsAdapter);
            }

            @Override
            public void onFailure(Call<CarsResponse> call, Throwable t) {

            }
        });
    }
}