package io.gabrielaloho.cars;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("accounts")
    Call<CarsResponse> getCars();
}
