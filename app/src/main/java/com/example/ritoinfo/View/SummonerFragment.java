package com.example.ritoinfo.View;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.ritoinfo.Controller.SummonerController;
import com.example.ritoinfo.Model.Summoner;
import com.example.ritoinfo.R;

import android.view.LayoutInflater;
import android.view.ViewGroup;

public class SummonerFragment extends Fragment {

    private SummonerController controller;
    private View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        v = inflater.inflate(R.layout.summoner, container, false);

        controller = new SummonerController(this);
        controller.start();

        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);

    }


    public void displayToast(String message){
        Toast.makeText(this.getContext(), message, Toast.LENGTH_LONG).show();
    }

    public void showSummoner(Summoner summoner) {
        TextView sumName = v.findViewById(R.id.textSummonerName);
        TextView sumLvl = v.findViewById(R.id.textLvl);

        sumName.setText(summoner.getSummonerName());
        sumLvl.setText(Long.toString(summoner.getSummonerLevel()));
    }
}
