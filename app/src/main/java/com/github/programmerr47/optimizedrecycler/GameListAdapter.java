package com.github.programmerr47.optimizedrecycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

/**
 * @author Michael Spitsin
 * @since 2016-09-04
 */
public class GameListAdapter extends RecyclerView.Adapter<GameListAdapter.GameViewHolder> {
    private final List<Game> games;
    private Context context;

    public GameListAdapter(Context context,List<Game> games ) {
        this.context = context;
        this.games = games;
    }

    @Override
    public GameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewGroup.LayoutParams params = new RecyclerView.LayoutParams(MATCH_PARENT, WRAP_CONTENT);
        GameItemView itemView = new GameItemView(parent.getContext());
        itemView.setLayoutParams(params);
        return new GameViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(GameViewHolder holder, int position) {
        Game game = games.get(position);
        holder.gameItemView.setGame(game);
    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    final class GameViewHolder extends RecyclerView.ViewHolder {
        public final GameItemView gameItemView;

        public GameViewHolder(GameItemView itemView) {
            super(itemView);
            this.gameItemView = itemView;
            gameItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.i("onClick", "onClick: ");
                }
            });
        }
    }
}
