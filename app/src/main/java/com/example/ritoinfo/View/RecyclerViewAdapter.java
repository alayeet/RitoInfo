package com.example.ritoinfo.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.ritoinfo.Model.Match;
import com.example.ritoinfo.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<Match> values;
    private final OnItemClickListener listener;

    public interface OnItemClickListener{
        void onItemClick(Match item);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txtHeader;
        public TextView txtBody;

        public ViewHolder(View view){
            super(view);
            txtHeader = view.findViewById(R.id.textLineOne);
            txtBody = view.findViewById(R.id.textLineTwo);
        }
    }

    public void add(int position, Match item){
        values.add(position, item);
        notifyItemInserted(position);
    }

    public RecyclerViewAdapter(List<Match> myDataset, OnItemClickListener listener) {
        this.listener = listener;
        values = myDataset;
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_match_fragment_layout, parent, false);

        return new ViewHolder(v);
    }

    public void onBindViewHolder(ViewHolder holder, final int position){
        final Match currentMatch = values.get(position);
        holder.txtHeader.setText(currentMatch.getGameMode());
        holder.txtBody.setText((int) currentMatch.getGameDurationInSec());
        holder.itemView.setOnClickListener(new  View.OnClickListener(){
            @Override public void onClick(View v){
                listener.onItemClick(currentMatch);
            }
        });
    }

    @Override
    public int getItemCount(){
        return values.size();
    }

}
