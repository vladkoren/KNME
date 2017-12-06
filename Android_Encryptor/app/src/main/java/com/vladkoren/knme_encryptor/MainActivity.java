package com.vladkoren.knme_encryptor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputField;
    TextView outPutView;
    Key key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputField = findViewById(R.id.startTxtF);
        outPutView = findViewById(R.id.resultTxt);
        key = new Key();
    }

    public void crypt(View view) {
        String result = "";
        String text = inputField.getText().toString().toLowerCase();
        char [] textArray = text.toCharArray();
        for(int i = 0; i<textArray.length; i++) {
            result = result + key.getKey(textArray[i]);
        }
        outPutView.setText(result);
    }


}
