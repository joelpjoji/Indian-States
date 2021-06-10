package com.joey.indianstates;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    @GET("bPSQmOcWmq")
    Call<JSONResponse> getJSON();
}
