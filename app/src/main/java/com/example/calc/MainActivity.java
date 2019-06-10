package com.example.calc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                EditText et1 = (EditText)findViewById(R.id.tb1);
                EditText et2 = (EditText)findViewById(R.id.tb2);

                TextView tv = (TextView)findViewById(R.id.tv3);

                int n1, n2;
                n1 = Integer.parseInt(et1.getText().toString());
                n2 = Integer.parseInt(et2.getText().toString());

                tv.setText((n1 + n2) + "");

            }
        });



    }
}
