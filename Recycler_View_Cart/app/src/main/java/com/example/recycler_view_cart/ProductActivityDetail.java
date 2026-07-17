package com.example.recycler_view_cart;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProductActivityDetail extends AppCompatActivity {

    ImageView imgDetail;
    TextView txtDetailName, txtDetailPrice;
    Button btnAddCart;

    // Cart list
    public static java.util.ArrayList<Product> cartList = new java.util.ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        imgDetail = findViewById(R.id.imgDetail);
        txtDetailName = findViewById(R.id.txtDetailName);
        txtDetailPrice = findViewById(R.id.txtDetailPrice);
        btnAddCart = findViewById(R.id.btnAddCart);

        int image = getIntent().getIntExtra("image", 0);
        String name = getIntent().getStringExtra("name");
        String price = getIntent().getStringExtra("price");

        imgDetail.setImageResource(image);
        txtDetailName.setText(name);
        txtDetailPrice.setText(price);

        btnAddCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cartList.add(new Product(image, name, price));

                Toast.makeText(ProductActivityDetail.this,
                        "Added to Cart",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}