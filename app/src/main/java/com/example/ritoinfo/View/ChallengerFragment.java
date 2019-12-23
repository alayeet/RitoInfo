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

import com.example.ritoinfo.Controller.ChallengerController;
import com.example.ritoinfo.Model.Challenger;
import com.example.ritoinfo.R;

import java.util.List;

public class ChallengerFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter myAdatper;
    private RecyclerView.LayoutManager layoutManager;
    private SearchView searchView;

    private ChallengerController controller;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.list_match_fragment_layout, container, false);

        recyclerView = view.findViewById(R.id.my_recycler_view);
        searchView = view.findViewById(R.id.searchView);

        controller = new ChallengerController(this);
        controller.start();

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        //displayToast("Fragment crée");
    }

    public void navToMatch(String json) {
    }

    public void showChallenger(List<Challenger> challengers) {
        if(challengers != null){
            recyclerView.setHasFixedSize(true);
            layoutManager = new LinearLayoutManager(getContext());
            recyclerView.setLayoutManager(layoutManager);

            myAdatper = new RecyclerViewAdapter(challengers);
            recyclerView.setAdapter(myAdatper);
        }
    }

    //private RecyclerViewAdapter.OnItemClickListener getListener() {
    //    return new RecyclerViewAdapter.OnItemClickListener() {
    //        @Override
    //        public void onItemClick(Challenger item) {
    //            controller.onItemClick(item);
    //        }
    //    };
    //}

    public void displayToast(String message){
        Toast.makeText(this.getContext(), message, Toast.LENGTH_LONG).show();
    }
}
