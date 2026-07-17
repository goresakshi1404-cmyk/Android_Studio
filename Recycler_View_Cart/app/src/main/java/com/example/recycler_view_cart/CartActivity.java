package com.example.recycler_view_cart;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CartActivity extends AppCompatActivity {

    RecyclerView recyclerCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        recyclerCart = findViewById(R.id.recyclerCart);

        ProductAdapter adapter = new ProductAdapter(
                CartActivity.this,
                ProductActivityDetail.cartList);

        recyclerCart.setLayoutManager(
                new LinearLayoutManager(this));

        recyclerCart.setAdapter(adapter);
    }
}