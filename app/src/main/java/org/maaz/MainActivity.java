package org.maaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Adding reference

        EditText num1 =(EditText) findViewById(R.id.num1c);
        EditText num2=(EditText) findViewById(R.id.num2g);
        EditText num3=(EditText) findViewById(R.id.num3s);
        EditText num4=(EditText) findViewById(R.id.num4sg);

        TextView result=(TextView) findViewById(R.id.Result_view);

        Button comp=(Button) findViewById(R.id.button);



        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double cash=Double.parseDouble(num1.getText().toString());

            }
        });



    }
}