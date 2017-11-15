package com.uni.calculator;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.uni.calculator.databinding.ActivityMainBinding;

/**
 * Created by dot on 11/12/17.
 */

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    private static final char ADD_SYMBOL            = '+';
    private static final char MINUS_SYMBOL          = '-';
    private static final char MULTIPLICATION_SYMBOL = '*';
    private static final char DIVISION_SYMBOL       = '/';
    private static char CURRENT_ACTION = 0;
    int value1 , value2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewActivity();
    }

    private void viewActivity() {

        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.result.setText(binding.result.getText()+"1");
            }
        });

        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.result.setText(binding.result.getText()+"2");
            }
        });

        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.result.setText(binding.result.getText()+"3");
            }
        });

        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.result.setText(binding.result.getText()+"4");
            }
        });

        binding.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.result.setText(binding.result.getText()+"5");
            }
        });

        binding.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.result.setText(binding.result.getText()+"6");
            }
        });

        binding.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.result.setText(binding.result.getText()+"7");
            }
        });

        binding.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.result.setText(binding.result.getText()+"8");
            }
        });

        binding.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.result.setText(binding.result.getText()+"9");
            }
        });

        binding.button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.result.setText(binding.result.getText()+"0");
            }
        });

        binding.buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.result.setText("");
            }
        });


        binding.buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.information.setText("+");
                if (binding.result == null){
                    binding.result.setText("");
                }else {
                    value1 = Integer.parseInt(binding.result.getText() + "");
                    CURRENT_ACTION = ADD_SYMBOL;
                    binding.result.setText(null);
                }
            }
        });

        binding.buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.information.setText("-");
                if (binding.result == null){
                    binding.result.setText("");
                }else {
                    value1 = Integer.parseInt(binding.result.getText() + "");
                    CURRENT_ACTION = MINUS_SYMBOL;
                    binding.result.setText(null);
                }
            }
        });

        binding.buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.information.setText("*");
                if (binding.result == null){
                    binding.result.setText("");
                }else {
                    value1 = Integer.parseInt(binding.result.getText() + "");
                    CURRENT_ACTION = MULTIPLICATION_SYMBOL;
                    binding.result.setText(null);
                }
            }
        });

        binding.buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.information.setText("/");
                if (binding.result == null){
                    binding.result.setText("");
                }else {
                    value1 = Integer.parseInt(binding.result.getText() + "");
                    CURRENT_ACTION = DIVISION_SYMBOL;
                    binding.result.setText(null);
                }
            }
        });

        binding.buttonCompute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.information.setText("");
                value2 = Integer.parseInt(binding.result.getText() + "");

                if (CURRENT_ACTION == ADD_SYMBOL){
                    binding.result.setText(value1 + value2 +"");
                } else if (CURRENT_ACTION == MINUS_SYMBOL){
                    binding.result.setText(value1 - value2+"");
                } else if (CURRENT_ACTION == MULTIPLICATION_SYMBOL){
                    binding.result.setText(value1 * value2+"");
                } else if (CURRENT_ACTION == DIVISION_SYMBOL){
                    binding.result.setText(value1 / value2+"");
                }
            }
        });
    }

}
