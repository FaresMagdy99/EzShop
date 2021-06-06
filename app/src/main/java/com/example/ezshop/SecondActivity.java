package com.example.ezshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mainGrid = (GridLayout) findViewById(R.id.firstmainGrid);

        setSingleEvent(mainGrid);
    }

    private void setSingleEvent(GridLayout mainGrid) {
        for(int i = 0 ;i<mainGrid.getChildCount(); i++){
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(finalI == 0){
                        Intent intent = new Intent(SecondActivity.this,ItemViewActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI == 1){
                        Intent intent = new Intent(SecondActivity.this,ItemViewActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI == 2){
                        Intent intent = new Intent(SecondActivity.this,ItemViewActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI == 3){
                        Intent intent = new Intent(SecondActivity.this,ItemViewActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI == 4){
                        Intent intent = new Intent(SecondActivity.this,ItemViewActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI == 5){
                        Intent intent = new Intent(SecondActivity.this,ItemViewActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI == 6){
                        Intent intent = new Intent(SecondActivity.this,ItemViewActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI == 7){
                        Intent intent = new Intent(SecondActivity.this,ItemViewActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI == 8){
                        Intent intent = new Intent(SecondActivity.this,ItemViewActivity.class);
                        startActivity(intent);
                    }

                    else {
                        Intent intent = new Intent(SecondActivity.this,ItemViewActivity.class);
                        startActivity(intent);
                    }

                }
            });
        }
    }
}