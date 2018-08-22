package com.example.david.trimkt;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.david.trimkt.Class.Produto;

import org.w3c.dom.Text;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class recyclerViewAdapter extends RecyclerView.Adapter<recyclerViewAdapter.MyViewHolder> {


    Context mContext;
    List<Produto> mData;
    Dialog dialog;

    public recyclerViewAdapter(Context mContext, List<Produto> mData){
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View v;
         v = LayoutInflater.from(mContext).inflate(R.layout.item_produto,parent,false);
         final MyViewHolder vHolder = new MyViewHolder(v);

//       Initialize dialog
        dialog = new Dialog(mContext);
        dialog.setContentView(R.layout.details_item_dialog);



         vHolder.details_item.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast.makeText(mContext, "Numero item : "+String.valueOf(vHolder.getAdapterPosition()), Toast.LENGTH_SHORT).show();

                 TextView tvNameProductDialog = (TextView) dialog.findViewById(R.id.name_product_dialog);
                 TextView tvPriceProductDialog = (TextView) dialog.findViewById(R.id.product_price_dialog);
                 ImageView imgProductDialog = (ImageView) dialog.findViewById(R.id.img_product_dialog);

                 tvNameProductDialog.setText(mData.get(vHolder.getAdapterPosition()).getNome());
                 tvPriceProductDialog.setText(mData.get(vHolder.getAdapterPosition()).getPreco());
                 imgProductDialog.setImageResource(mData.get(vHolder.getAdapterPosition()).getImgProduto());

                 dialog.show();
             }
         });


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

        private LinearLayout details_item;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            details_item =(LinearLayout) itemView.findViewById(R.id.detailsItemDialogId);

            tv_name = (TextView) itemView.findViewById(R.id.item_nome);
            tv_preco = (TextView) itemView.findViewById(R.id.item_preco);
            img = (ImageView) itemView.findViewById(R.id.img_produto);
        }
    }
}
