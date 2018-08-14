package com.example.david.trimkt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recyclerViewAdapter extends RecyclerView.Adapter<recyclerViewAdapter.MyViewHolder> {


    Context mContext;
    List<Produto> mData;

    public recyclerViewAdapter(Context mContext, List<Produto> mData){
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View v;
         v = LayoutInflater.from(mContext).inflate(R.layout.item_produto,parent,false);
         MyViewHolder vHolder = new MyViewHolder(v);

         return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_name.setText(mData.get(position).getNome());
        holder.tv_preco.setText(mData.get(position).getPreco());
        holder.img.setImageResource(mData.get(position).getImgProduto());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_name;
        private TextView tv_preco;
        private ImageView img;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = (TextView) itemView.findViewById(R.id.item_nome);
            tv_preco = (TextView) itemView.findViewById(R.id.item_preco);
            img = (ImageView) itemView.findViewById(R.id.img_produto);
        }
    }
}
