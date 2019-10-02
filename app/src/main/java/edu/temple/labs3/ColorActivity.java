package edu.temple.labs3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

public class ColorActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);


        //String colors [] = {"Red","Green","Blue", "Yellow", "Purple", "Gray", "Orange", "Brown", "Pink", "Teal" };

        //ArrayAdapter spinnerArray = new ArrayAdapter<>(ColorActivity.this, android.R.layout.simple_spinner_item, colors);

        Spinner Colors = (Spinner) findViewById(R.id.spinner2);

// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.colorSelection, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        Colors.setAdapter(adapter);
        Colors.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        View background = findViewById(R.id.colorChange);
        String text = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(), text, Toast.LENGTH_SHORT).show();
        if (text.equals("Red")) {
            background.setBackgroundColor(Color.RED);
        } else if (text.equals("Green")) {
            background.setBackgroundColor(Color.GREEN);
        } else if (text.equals("Blue")) {
            background.setBackgroundColor(Color.BLUE);
        } else if (text.equals("Yellow")) {
            background.setBackgroundColor(Color.YELLOW);
        } else if (text.equals("Purple")) {
            background.setBackgroundColor(Color.parseColor("Purple"));
        }else if(text.equals("Gray")) {
            background.setBackgroundColor(Color.GRAY);
        }else if(text.equals("Orange")) {
            background.setBackgroundColor(Color.rgb(255, 165, 0));
        }else if(text.equals("Brown")) {
            background.setBackgroundColor(Color.rgb(139, 69, 19));
        } else if(text.equals("Pink")) {
            background.setBackgroundColor(Color.rgb(255,105,180));
        }else if(text.equals("Teal")){
            background.setBackgroundColor(Color.parseColor("Teal"));

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}