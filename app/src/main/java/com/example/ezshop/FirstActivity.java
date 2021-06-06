package com.example.ezshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    GridLayout mainGrid;
    ImageView item1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        mainGrid = (GridLayout) findViewById(R.id.firstmainGrid);
        item1 = (ImageView)findViewById(R.id.firstitem);
        setSingleEvent(mainGrid);
        item1.setImageResource(R.drawable.cartcir);
    }

    private void setSingleEvent(GridLayout mainGrid) {
        for(int i = 0 ;i<mainGrid.getChildCount(); i++){
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(finalI == 0){
                        Intent intent = new Intent(FirstActivity.this,ItemViewActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI == 1){
                        Intent intent = new Intent(FirstActivity.this,ItemViewActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI == 2){
                        Intent intent = new Intent(FirstActivity.this,ItemViewActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI == 3){
                        Intent intent = new Intent(FirstActivity.this,ItemViewActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI == 4){
                        Intent intent = new Intent(FirstActivity.this,ItemViewActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI == 5){
                        Intent intent = new Intent(FirstActivity.this,ItemViewActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI == 6){
                        Intent intent = new Intent(FirstActivity.this,ItemViewActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI == 7){
                        Intent intent = new Intent(FirstActivity.this,ItemViewActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI == 8){
                        Intent intent = new Intent(FirstActivity.this,ItemViewActivity.class);
                        startActivity(intent);
                    }

                    else {
                        Intent intent = new Intent(FirstActivity.this,ItemViewActivity.class);
                        startActivity(intent);
                    }

                }
            });
        }
    }
}