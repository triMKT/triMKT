package com.example.david.trimkt;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.david.trimkt.Class.Produto;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class listaDeCompraFragment extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private List<Produto> listaProduto;


    public listaDeCompraFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_lista_de_compra, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.produto_recycleview);
        recyclerViewAdapter rvAdapter = new recyclerViewAdapter(getContext(), listaProduto);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(rvAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listaProduto = new ArrayList<>();
        listaProduto.add(new Produto("beringela","99,99",R.drawable.berinjela_capa));
        listaProduto.add(new Produto("beringela","99,99",R.drawable.berinjela_capa));
        listaProduto.add(new Produto("beringela","99,99",R.drawable.berinjela_capa));
        listaProduto.add(new Produto("beringela","99,99",R.drawable.berinjela_capa));
        listaProduto.add(new Produto("Peringela","99,99",R.drawable.berinjela_capa));
        listaProduto.add(new Produto("beringela","99,99",R.drawable.berinjela_capa));
        listaProduto.add(new Produto("beringela","99,99",R.drawable.berinjela_capa));
        listaProduto.add(new Produto("beringela","99,99",R.drawable.berinjela_capa));
        listaProduto.add(new Produto("beringela","99,99",R.drawable.berinjela_capa));
        listaProduto.add(new Produto("beringela","99,99",R.drawable.berinjela_capa));
        listaProduto.add(new Produto("beringela","99,99",R.drawable.berinjela_capa));
        listaProduto.add(new Produto("beringela","99,99",R.drawable.berinjela_capa));
        listaProduto.add(new Produto("beringela","99,99",R.drawable.berinjela_capa));
        listaProduto.add(new Produto("beringela","99,99",R.drawable.berinjela_capa));
        listaProduto.add(new Produto("beringela","99,99",R.drawable.berinjela_capa));
        listaProduto.add(new Produto("beringela","99,99",R.drawable.berinjela_capa));
        listaProduto.add(new Produto("beringela","99,99",R.drawable.berinjela_capa));

    }
}
