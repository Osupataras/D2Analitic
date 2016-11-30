package com.osypchuk.taras.d2a.Tabs;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.osypchuk.taras.d2a.Interfaces.DotaAPI;

import com.osypchuk.taras.d2a.R;
import com.osypchuk.taras.d2a.adapters.MatchesAdapter;
import com.osypchuk.taras.d2a.db.DBHelper;
import com.osypchuk.taras.d2a.db.DBItem;
import com.osypchuk.taras.d2a.db.DBUpdeter;
import com.osypchuk.taras.d2a.model.ApiModelMatchHistory.Main;
import com.osypchuk.taras.d2a.model.ApiModelMatchHistory.Matches;
import com.osypchuk.taras.d2a.model.ApiModelMatchHistory.Result;
import com.osypchuk.taras.d2a.model.ListModel.ListItem;
import com.osypchuk.taras.d2a.rest.ApiClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Taras on 26.11.2016.
 */

public class FragmentTab2 extends android.support.v4.app.Fragment {


    private static final String TAG = FragmentTab1.class.getSimpleName();
    private final static String API_KEY = "73EE0AFD6C12F2AB4605F611C2AB86EF";
    private String account = "169660175";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        DBHelper dbHelper = new DBHelper(getActivity());
        DBUpdeter dbUpdeter = new DBUpdeter();
        dbUpdeter.Update(dbHelper);
        List<DBItem> heroes = dbHelper.getAllHeroes();

        final DotaAPI apiService =
                ApiClient.getRetrofit().create(DotaAPI.class);
        Call<Main> callMatches = apiService.getMatchHistory(API_KEY, account, 10);
        callMatches.enqueue(new Callback<Main>() {
            @Override
            public void onResponse(Call<Main> call, Response<Main> response) {
                int statusCode = response.code();
                Main main = response.body();
                Result result = main.getMain();
                List<Matches> matches = result.getMatches();
                Log.d(TAG, "Response:" + matches.toString());
                List<ListItem> listItems;
                for (int i = 0; i < matches.size(); i++) {
                    Call<com.osypchuk.taras.d2a.model.ApiModelMatchDetails.Main> callDetails
                            = apiService.getMatchDetails(API_KEY, matches.get(i).getMatchId());
                    callDetails.enqueue(new Callback<com.osypchuk.taras.d2a.model.ApiModelMatchDetails.Main>() {
                        @Override
                        public void onResponse(Call<com.osypchuk.taras.d2a.model.ApiModelMatchDetails.Main> call,
                                               Response<com.osypchuk.taras.d2a.model.ApiModelMatchDetails.Main> response) {
                            Boolean radiant_win = response.body().getResult().getRadiant_win();


                        }

                        @Override
                        public void onFailure(Call<com.osypchuk.taras.d2a.model.ApiModelMatchDetails.Main> call,
                                              Throwable t) {

                        }
                    });


                }

                RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.rv);
                recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));

                MatchesAdapter adapter = new MatchesAdapter(matches);
                recyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<Main> call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });
        return inflater.inflate(R.layout.tab_match_list, container, false);
    }
}