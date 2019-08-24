package com.example.fizzbuzzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements FizzContract.ViewContract {

    private FizzPresenter presenter = new FizzPresenter((FizzContract.PresenterContract) this);

    private EditText editText;
    private Button button;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.input);
        textView = findViewById(R.id.output);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                presenter.onInput(text);
            }
        });
    }

    @Override
    public void showFizzBuzz(String string) {
        textView.setText(string);
    }
}
