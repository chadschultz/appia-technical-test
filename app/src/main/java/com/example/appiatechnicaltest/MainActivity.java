package com.example.appiatechnicaltest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.SimpleXmlConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String API_BASE_URL = "http://ads.appia.com/";

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();

        AdService service = retrofit.create(AdService.class);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        Call<AdResponse> adResponseCall = service.adResponse("Schultz");
        adResponseCall.enqueue(new Callback<AdResponse>() {
            @Override
            public void onResponse(Response<AdResponse> response) {
                int statusCode = response.code();
                AdResponse adResponse = response.body();

                mAdapter = new AdAdapter(adResponse.getProperties());
                mRecyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Throwable t) {
                // Log error here since request failed
                Log.e("MainActivity", "onFailure: ", t);
            }
        });
    }
}
