package com.example.mypc.googlebook_udacitypro7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView Search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Search = (TextView) findViewById(R.id.search);
    }

    public void onClick(View view){
        if(view == Search){
            Intent intent = new Intent(this, BooksList.class);
            intent.putExtra("Search",Search.getText());
            startActivity(intent);
        }
    }
}
