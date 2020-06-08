package in.starbow.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
Button euro,pound,dollar,yen,dinar,bitcoin,rubel,aus_dollar,can_dollar,reset;
EditText editText;
TextView textView,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        euro =findViewById(R.id.euro);
        pound =findViewById(R.id.pound);
        dollar = findViewById(R.id.dollar);
        yen = findViewById(R.id.yen);
        dinar =findViewById(R.id.dinar);
        bitcoin= findViewById(R.id.bitcoin);
         rubel= findViewById(R.id.rubel);
        aus_dollar = findViewById(R.id.austerallian_dollar);
        can_dollar = findViewById(R.id.canadian_dollar);
        editText =findViewById(R.id.editText);
        textView=findViewById(R.id.textView);
        reset =findViewById(R.id.button);
        textView2 =findViewById(R.id.textView2);
        /////////////
        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String z =editText.getText().toString();
            // to check whether the user is submitting empty form or not
                if(TextUtils.isEmpty(z))
                {
                    editText.setError("Enter Something");
                }
                else{
                    double n,k;
                    n= Double.parseDouble(z);//converting string back to int
//                    editText.setText(null);
                   // Formatter formatter = new Formatter();//by this class we can format our class in the we we want
                    k=n*0.012;
                    //way 1
                    DecimalFormat numberFormat = new DecimalFormat("#.000");
                    textView.setText(""+numberFormat.format(k));
                    textView2.setText("€");

                    //way 2
                    //textView.setText(""+k);//as text view only accepts string so we have to concatenate number(k) with "" to make it a string
                                             //this is a easier way to do the above part but its not the ideal way as we cant set the
                                             //number of values after decimal
                }
            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z =editText.getText().toString();
                if(TextUtils.isEmpty(z))
                {
                    editText.setError("Enter Something");
                }
                else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    k = n * 0.0104;
                    DecimalFormat numberFormat = new DecimalFormat("#.000");
                    textView.setText("" + numberFormat.format(k));
                    textView2.setText("£");
                }


                }
        });


        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z =editText.getText().toString();
                if(TextUtils.isEmpty(z))
                {
                    editText.setError("Enter Something");
                }
                else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    k = n * 0.0132;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText("" + numberFormat.format(k));
                    textView2.setText("$");
                }

            }
        });


        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z =editText.getText().toString();
                if(TextUtils.isEmpty(z))
                {
                    editText.setError("Enter Something");
                }
                else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    k = n * 1.449;
                    DecimalFormat numberFormat = new DecimalFormat("#.000");
                    textView.setText("" + numberFormat.format(k));
                    textView2.setText("¥");
                }

            }
        });

        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z =editText.getText().toString();
                if(TextUtils.isEmpty(z))
                {
                    editText.setError("Enter Something");
                }
                else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    k = n * 0.0040;
                    DecimalFormat numberFormat = new DecimalFormat("#.000");
                    textView.setText("" + numberFormat.format(k));
                    textView2.setText("ع.د");
                }

            }
        });


        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z =editText.getText().toString();
                if(TextUtils.isEmpty(z))
                {
                    editText.setError("Enter Something");
                }
                else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    k = n * 0.00000136;
                    DecimalFormat numberFormat = new DecimalFormat("#.00000");
                    textView.setText("" + numberFormat.format(k));
                    textView2.setText("₿");
                }

            }
        });



        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z =editText.getText().toString();
                if(TextUtils.isEmpty(z))
                {
                    editText.setError("Enter Something");
                }
                else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    k = n * 0.9009;
                    DecimalFormat numberFormat = new DecimalFormat("#.000");
                    textView.setText("" + numberFormat.format(k));
                    textView2.setText("₽");
                }

            }
        });



        aus_dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z =editText.getText().toString();
                if(TextUtils.isEmpty(z))
                {
                    editText.setError("Enter Something");
                }
                else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    k = n * 0.0189;
                    DecimalFormat numberFormat = new DecimalFormat("#.000");
                    textView.setText("" + numberFormat.format(k));
                    textView2.setText("AUS$");
                }

            }
        });



        can_dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z =editText.getText().toString();
                if(TextUtils.isEmpty(z))
                {
                    editText.setError("Enter Something");
                }
                else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    k = n *0.0177 ;

                    DecimalFormat numberFormat = new DecimalFormat("#.000");
                    textView.setText("" + numberFormat.format(k));
                    textView2.setText("CAN$");
                }

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("0.00");
                editText.setText("₹");

            }
        });
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(null);
            }
        });
    }

}