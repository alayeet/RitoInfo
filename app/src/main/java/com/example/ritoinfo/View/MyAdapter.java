package com.example.ritoinfo.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.ritoinfo.Model.Match;
import com.example.ritoinfo.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private final Context context;
    private List<Match> values;
    private final OnItemClickListener listener;

    public interface OnItemClickListener{
        void onItemClick(Match item);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txtHeader;
        public TextView txtBody;
        public View layout;

        public ViewHolder(View view){
            super(view);
            layout = view;
            txtHeader = (TextView) view.findViewById(R.id.laneView);
            txtBody = (TextView) view.findViewById(R.id.gameID);
        }
    }

    public MyAdapter(List<Match> myDataset, Context context, OnItemClickListener listener) {
        this.listener = listener;
        this.context = context;
        values = myDataset;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater inflater = LayoutInflater.from(
                parent.getContext());
        View v =
                inflater.inflate(R.layout.single_match_fragment_layout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    public void onBindViewHolder(ViewHolder holder, final int position){
        final Match currentMatch = values.get(position);
        holder.txtHeader.setText(currentMatch.getGameMode());
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
