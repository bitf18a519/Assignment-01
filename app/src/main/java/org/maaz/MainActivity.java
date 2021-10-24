package org.maaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 =(EditText) findViewById(R.id.num1c);
        EditText num2=(EditText) findViewById(R.id.num2g);
        EditText num3=(EditText) findViewById(R.id.num3s);
        EditText num4=(EditText) findViewById(R.id.num4sg);

    }
}