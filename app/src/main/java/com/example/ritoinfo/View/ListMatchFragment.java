package com.example.ritoinfo.View;

import android.widget.ArrayAdapter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ritoinfo.Controller.Controller;
import com.example.ritoinfo.Model.Summoner;
import com.example.ritoinfo.R;

public class ListMatchFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdatper;
    private RecyclerView.LayoutManager layoutManager;
    private SearchView searchView;
    private View view;

    private Controller controller;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.matchs_fragment_layout, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_view);
        searchView = (SearchView) view.findViewById(R.id.searchView);

        controller = new Controller();

        return view;
    }

}
