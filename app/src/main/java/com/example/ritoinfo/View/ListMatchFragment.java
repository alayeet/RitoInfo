package com.example.ritoinfo.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ritoinfo.Controller.Controller;
import com.example.ritoinfo.Model.Match;
import com.example.ritoinfo.R;

import java.util.List;

public class ListMatchFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdatper;
    private RecyclerView.LayoutManager layoutManager;
    private SearchView searchView;

    private Controller controller;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.list_match_fragment_layout, container, false);

        recyclerView = view.findViewById(R.id.my_recycler_view);
        searchView = view.findViewById(R.id.searchView);

        controller = new Controller(this);
        controller.start();

        return view;
    }

    public void navToMatch(String json) {
    }

    public void showList(List<Match> matchs) {
        if(matchs != null){
            recyclerView.setHasFixedSize(true);
            layoutManager = new LinearLayoutManager(getContext());
            recyclerView.setLayoutManager(layoutManager);

            mAdatper = new MyAdapter(matchs, getContext(), getListener());
            recyclerView.setAdapter(mAdatper);
        }
    }

    private MyAdapter.OnItemClickListener getListener() {
        return new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Match item) {
                controller.onItemClick(item);
            }
        };
    }

    public void displayToast(String message){
        Toast.makeText(this.getContext(), message, Toast.LENGTH_LONG).show();
    }
}
