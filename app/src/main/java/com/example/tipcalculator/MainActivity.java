package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.tipcalculator.databinding.ActivityMainBinding;
import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }

    public void onClick(View view) {
        BigDecimal billTotal = new BigDecimal(binding.editBillTotal.getText().toString());
        BigDecimal percentageOfTip =
                new BigDecimal(binding.editPercentageOfTip.getText().toString());
        BigDecimal peopleCount = new BigDecimal(binding.editPeopleCount.getText().toString());

        String tpp = "Total Per Person: $" + TipCalculator.calculateTip(billTotal, percentageOfTip,
                peopleCount);

        binding.totalPerPerson.setText(tpp);
    }
}