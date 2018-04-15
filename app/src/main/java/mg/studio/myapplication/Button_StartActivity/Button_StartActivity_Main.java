package mg.studio.myapplication.Button_StartActivity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import mg.studio.myapplication.R;

public class Button_StartActivity_Main  extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Connect this java file with the xml layout
        setContentView(R.layout.button_startactivity_main);

        // Connect the Button and set the onClick listener
        (findViewById(R.id.btn)).setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), Button_StartActivity_Second.class);
                startActivity(intent);
            }
        });
    }
}
