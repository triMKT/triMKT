package com.example.david.trimkt.menu_fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.david.trimkt.MainActivityLogin;
import com.example.david.trimkt.R;
import com.example.david.trimkt.registrarActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class emAltaFragment extends Fragment {

    private Button button;
    public emAltaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_em_alta, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        button = (Button)view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), registrarActivity.class);
                startActivity(intent);
            }
        });
    }

//    public void onClickExbirLista(View v){
//        Intent intent = new Intent(getActivity(), MainActivityLogin.class);
//        startActivity(intent);
//    }

}
