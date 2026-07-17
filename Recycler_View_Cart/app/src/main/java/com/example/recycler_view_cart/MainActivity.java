package com.example.recycler_view_cart;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Button btnCart;

    ArrayList<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        btnCart = findViewById(R.id.btnCart);

        productList = new ArrayList<>();

        productList.add(new Product(R.drawable.laptop, "Laptop", "₹50,000"));
        productList.add(new Product(R.drawable.mobile, "Mobile", "₹20,000"));
        productList.add(new Product(R.drawable.headphones, "Headphones", "₹2,000"));
        productList.add(new Product(R.drawable.watch, "Smart Watch", "₹3,500"));

        ProductAdapter adapter = new ProductAdapter(MainActivity.this, productList);

        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setAdapter(adapter);

        btnCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, CartActivity.class);
                startActivity(intent);

            }
        });

    }
}