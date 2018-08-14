package com.example.david.trimkt;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class listaComprasMenuFragment extends Fragment {


    public listaComprasMenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lista_compras_menu, container, false);
    }

//    public void onClickExbirLista(View v){
//        Intent intent = new Intent(this.getApplicationContext(), principal_Activity.class);
//        startActivity(intent);
//    }
}
