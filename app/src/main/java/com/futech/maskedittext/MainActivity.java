package com.futech.maskedittext;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.com.sapereaude
        .maskedEditText
        .MaskedEditText;

public class MainActivity extends AppCompatActivity {

    MaskedEditText creditCardText, phoneNumText, dateText;
    Button show;

    @Override
    protected void onCreate(
            Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        creditCardText = findViewById(R.id.card);
        phoneNumText = findViewById(R.id.phone);
        dateText = findViewById(R.id.Date);
        show = findViewById(R.id.showButton);

        show.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {

                        // Display the information
                        // from the EditText
                        // with help of Taosts
                        Toast.makeText(
                                MainActivity.this,
                                "Credit Card Number "
                                        + creditCardText.getText()
                                        + "\n Phone Number "
                                        + phoneNumText.getText()
                                        + "\n Date "
                                        + dateText.getText(),
                                Toast.LENGTH_LONG)
                                .show();
                    }
                });
    }
}
