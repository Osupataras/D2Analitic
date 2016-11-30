package com.osypchuk.taras.d2a.Interfaces;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Taras on 27.11.2016.
 */

public interface DotaAPI {
    @GET("GetMatchHistory/V001/")
    Call<com.osypchuk.taras.d2a.model.ApiModelMatchHistory.Main> getMatchHistory(@Query("key") String KEY,
                                                                                 @Query("account_id") String accountId,
                                                                                 @Query("matches_requested") int mathcesNum);

    @GET("GetMatchDetails")
    Call<com.osypchuk.taras.d2a.model.ApiModelMatchDetails.Main> getMatchDetails(@Query("key") String KEY,
                                                                                 @Query("match_id") String matchId);


}
