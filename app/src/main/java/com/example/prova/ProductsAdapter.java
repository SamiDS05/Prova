package com.example.prova;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductViewHolder> {
    private final List<Produto> produtoList;
    private List<Produto> productList;

    public ProductsAdapter(List<Produto> productList) {
        this.produtoList = productList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_produto, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Produto product = productList.get(position);
        holder.nameTextView.setText(product.getNome());
        holder.descriptionTextView.setText(product.getDescricao());
        holder.priceTextView.setText(String.valueOf(product.getPreco()));
        holder.imageView.setImageResource(product.getImageResource());
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView;
        public TextView descriptionTextView;
        public TextView priceTextView;
        public ImageView imageView;

        public ProductViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nomeTextView);
            descriptionTextView = itemView.findViewById(R.id.descricaoTextView);
            priceTextView = itemView.findViewById(R.id.precoTextView);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}