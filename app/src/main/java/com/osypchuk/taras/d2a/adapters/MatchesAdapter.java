package com.osypchuk.taras.d2a.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.osypchuk.taras.d2a.R;
import com.osypchuk.taras.d2a.model.ApiModelMatchHistory.Matches;

import java.util.List;

/**
 * Created by Taras on 27.11.2016.
 */

public class MatchesAdapter extends RecyclerView.Adapter<MatchesAdapter.MatchesViewHolder> {

    private List<Matches> matches;

    public MatchesAdapter(List<Matches> matches) {

        this.matches = matches;

    }


    @Override
    public MatchesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.match_history_item, parent, false);
        return new MatchesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MatchesViewHolder holder, int position) {
//        holder.heroImage.setImageResource(matches.get(position).);
//        holder.heroName.setText(matches.get(position).hero_name);
        holder.matchId.setText(matches.get(position).getMatchId().toString());
        holder.lobbyType.setText(matches.get(position).getLobbyType().toString());
        holder.matchTime.setText(matches.get(position).getStartTime().toString());
//        holder.win.setText(match.get(position).win);
//        if(match.get(position).win.equals("Won")){
//            holder.win.setTextColor(Color.GREEN);
//        }
//        else {holder.win.setTextColor(Color.RED);}
//        holder.cv.setCardBackgroundColor(Color.GRAY);


    }

    @Override
    public int getItemCount() {

        return matches.size();
    }


    public static class MatchesViewHolder extends RecyclerView.ViewHolder {
        //        ImageView heroImage;
//        TextView heroName;
        TextView matchId;
        TextView matchTime;
        TextView lobbyType;


        public MatchesViewHolder(View itemView) {
            super(itemView);
//            heroImage = (ImageView) itemView.findViewById(R.id.hero_image);
//            heroName = (TextView) itemView.findViewById(R.id.hero_name);
            matchId = (TextView) itemView.findViewById(R.id.match_id);
            matchTime = (TextView) itemView.findViewById(R.id.start_time);
            lobbyType = (TextView) itemView.findViewById(R.id.lobby_type);


        }
    }
}
