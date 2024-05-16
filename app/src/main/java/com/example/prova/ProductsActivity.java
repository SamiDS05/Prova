package com.example.prova;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProductsActivity extends AppCompatActivity {
    private RecyclerView productsRecyclerView;
    private Produto productsAdapter;
    private List<Produto> productList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productList = new ArrayList<>();

        productsRecyclerView = findViewById(R.id.productsRecyclerView);
        String ProdutoList = "";
        productsAdapter = new Produto(ProdutoList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        productsRecyclerView.setLayoutManager(layoutManager);
        RecyclerView.Adapter produto = null;
        productsRecyclerView.setAdapter(produto);
    }
}