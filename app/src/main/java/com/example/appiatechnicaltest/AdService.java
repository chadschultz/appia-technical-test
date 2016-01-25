package com.example.appiatechnicaltest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Chad Schultz on 1/24/2016.
 */
public interface AdService {
    @GET("getAds?id=236&password=OVUJ1DJN&siteId=4288&deviceId=4230&sessionId=testsession&totalCampaignsRequested=10")
    Call<AdResponse> adResponse(@Query("lname") String lname);
}
