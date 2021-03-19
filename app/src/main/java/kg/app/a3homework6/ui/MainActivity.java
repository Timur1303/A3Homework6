package kg.app.a3homework6.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import kg.app.a3homework6.R;
import kg.app.a3homework6.databinding.ActivityMainBinding;
import kg.app.a3homework6.domain.Math;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding ui;
    private Math math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());
        math = new Math();

        ui.btnAdd.setOnClickListener(v -> {
            int addOne = Integer.parseInt(ui.etOperatorOne.getText().toString());
            int addTwo = Integer.parseInt(ui.etOperatorTwo.getText().toString());
            ui.tvResult.setText(String.valueOf(math.add(addOne, addTwo)));
        });

        ui.btnSub.setOnClickListener(v -> {
            int subOne = Integer.parseInt(ui.etOperatorOne.getText().toString());
            int subTwo = Integer.parseInt(ui.etOperatorTwo.getText().toString());
            ui.tvResult.setText(String.valueOf(math.sub(subOne, subTwo)));
        });

        ui.btnMul.setOnClickListener(v -> {
            int mulOne = Integer.parseInt(ui.etOperatorOne.getText().toString());
            int mulTwo = Integer.parseInt(ui.etOperatorTwo.getText().toString());
            ui.tvResult.setText(String.valueOf(math.mul(mulOne, mulTwo)));
        });

        ui.btnDiv.setOnClickListener(v -> {
            int divOne = Integer.parseInt(ui.etOperatorOne.getText().toString());
            int divTwo = Integer.parseInt(ui.etOperatorTwo.getText().toString());
            ui.tvResult.setText(String.valueOf(math.div(divOne, divTwo)));
        });

        ui.btnReverse.setOnClickListener(v -> {
            String word = String.valueOf(ui.etReverseOperator.getText().toString());
            ui.tvResult.setText(String.valueOf(math.reverseWords(word)));
        });
    }
}