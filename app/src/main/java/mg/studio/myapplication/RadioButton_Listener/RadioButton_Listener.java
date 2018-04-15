package mg.studio.myapplication.RadioButton_Listener;


import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

import mg.studio.myapplication.R;

public class RadioButton_Listener extends Activity implements OnCheckedChangeListener {
    RadioGroup radiogroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radiobutton_listener);
        // Connect the radioGroup
        radiogroup = (RadioGroup) findViewById(R.id.radioGroup);
        radiogroup.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup arg0, int arg1) {
        // When a radio is selected, something will be done
        // if(arg1==R.id.radio0){
        // //Do this
        // Toast.makeText(getBaseContext(), "I love you ",
        // Toast.LENGTH_SHORT).show();
        //
        // }
        // if(arg1==R.id.radio1){
        // //Do this
        // Toast.makeText(getBaseContext(), "I like you",
        // Toast.LENGTH_SHORT).show();
        //
        // }
        // if(arg1==R.id.radio2){
        // //Do this
        // Toast.makeText(getBaseContext(), "Hum...",
        // Toast.LENGTH_SHORT).show();
        //
        // }

        // ////////////////
        switch (arg1) {
            case R.id.radio0:
                Toast.makeText(getBaseContext(), "I love you ", Toast.LENGTH_SHORT)
                        .show();

                break;
            case R.id.radio1:
                Toast.makeText(getBaseContext(), "I like you", Toast.LENGTH_SHORT)
                        .show();

                break;
            case R.id.radio2:
                Toast.makeText(getBaseContext(), "Hum...", Toast.LENGTH_SHORT)
                        .show();

                break;
            default:
                break;
        }

    }
}
