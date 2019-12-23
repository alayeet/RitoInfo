package com.example.ritoinfo.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.ritoinfo.Model.Challenger;
import com.example.ritoinfo.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<Challenger> values;
    //private final OnItemClickListener listener;

    public interface OnItemClickListener{
        void onItemClick(Challenger item);
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

    public void add(int position, Challenger item){
        values.add(position, item);
        notifyItemInserted(position);
    }

    public RecyclerViewAdapter(List<Challenger> myDataset) {
        //this.listener = listener;
        values = myDataset;
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);

        return new ViewHolder(v);
    }

    public void onBindViewHolder(ViewHolder holder, final int position){
        Challenger currentChal = values.get(position);
        holder.txtHeader.setText("Nom d'invocateur : "+currentChal.getSummonerName());
        holder.txtBody.setText(Integer.toString(currentChal.getLeaguePoints())+" League Points");
        //holder.itemView.setOnClickListener(new  View.OnClickListener(){
        //    @Override public void onClick(View v){
        //        //listener.onItemClick(currentChal);
        //    }
        //});
    }

    @Override
    public int getItemCount(){
        return values.size();
    }

}
