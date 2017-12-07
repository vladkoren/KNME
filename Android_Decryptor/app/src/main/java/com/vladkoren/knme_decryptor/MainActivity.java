package com.vladkoren.knme_decryptor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView outputView;
    EditText input;
    Key key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        outputView = findViewById(R.id.outputTxt);
        input = findViewById(R.id.inputTxt);
        key = new Key();
    }

    public void decrypt(View view) {
        String text = input.getText().toString().toLowerCase();
        String temp = "";
        String result = "";
        char[] symbols = new char[text.length()];
        symbols = text.toCharArray();
        for(int i = 0; i<text.length(); i++) {
            System.out.println(symbols[i]);
            if(temp == "-") {
                System.out.println("Got -");
                temp = temp + symbols[i];
                System.out.println("Temp " + temp);
                result = result + key.getValue(Integer.parseInt(temp));
                temp = "";
                System.out.println("Current result " + result);
            }
            else {



                if(temp.length()==2) {
                    System.out.println("Got 2 symbols in temp. Current temp " + temp);
                    result = result + key.getValue(Integer.parseInt(temp));
                    temp = "" + symbols[i];
                    System.out.println("Current result " + result);
                }
                else {
                    temp = temp + symbols[i];
                    System.out.println("Current temp1 " + temp);
                }
            }
        }
        result = result + key.getValue(Integer.parseInt(temp));
        outputView.setText(result);
    }
}
