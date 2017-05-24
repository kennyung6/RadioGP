package com.inducesmile.radiogp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by KennYung6 on 5/24/17.
 */

public class MainActivity extends AppCompatActivity {

    TextView btnClickDisplay;
    String firstBtn = "You have selected the first RadioButton";
    String secondBtn = "You have selected the second RadioButton";
    String thirdBtn = "You have selected the third RadioButton";
    String fourthBtn = "You have selected the fourth RadioButton";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {

        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Displays the click action response
        btnClickDisplay = (TextView) findViewById(R.id.button_click_display);

        // Check which radio button was clicked
        switch (view.getId()) {

            case R.id.radio_first:
                if (checked) {
                    btnClickDisplay.setText(firstBtn);

                    break;
                }
            case R.id.radio_second:
                if (checked) {
                    btnClickDisplay.setText(secondBtn);

                    break;
                }
            case R.id.radio_third:
                if (checked) {
                    btnClickDisplay.setText(thirdBtn);

                    break;
                }
            case R.id.radio_fourth:
                if (checked) {
                    btnClickDisplay.setText(fourthBtn);

                    break;
                }
        }
    }
}
