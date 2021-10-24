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
                String globe="0";



                double cash=Double.parseDouble(num1.getText().toString());
                double gold=116000*(Double.parseDouble(num2.getText().toString()));
                double silver=1400*(Double.parseDouble(num3.getText().toString()));
                double stock=Double.parseDouble(num4.getText().toString());

                if(gold<(116000*7.5) && silver==0 && cash==0 && stock==0)
                {

                    result.setText(globe);

                }
                else if(gold==0 && silver<(1400*52.5) && cash==0 && stock==0)
                {
                    result.setText(globe);
                }

                else if(gold==0 && silver==0 && ((cash+stock)<73500))
                {
                    result.setText(globe);
                }

                else
                {

                    double total = (cash + gold + silver + stock) / 40;

                    String sdouble = Double.toString(total);
                    result.setText(sdouble);
                }


            }
        });



    }
}