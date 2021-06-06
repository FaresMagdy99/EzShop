package com.example.ezshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ItemViewActivity extends AppCompatActivity {
    ImageView cart;
    ImageView item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_view);

        cart = (ImageView) findViewById(R.id.cartimage);
        item = (ImageView) findViewById(R.id.itemimageView);

        setSingleEvent(cart);
    }

    private void setSingleEvent(ImageView cart) {
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemViewActivity.this,dummy.class);
                startActivity(intent);
            }
        });
    }

}