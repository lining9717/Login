package mg.studio.myapplication.Button_StartActivity_Extra;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

import mg.studio.myapplication.R;

public class Button_StartActivity_Extra_Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_atartactivity_extra);


        final EditText userInput =findViewById(R.id.et_input);
        findViewById(R.id.btn).setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String information = userInput.getText().toString();
                //Todo: handle the case where information is empty
                Intent intent = new Intent(getApplicationContext(),
                        Button_StartActivity_Extra_Second.class);
                intent.putExtra("shared_data", information);
                startActivity(intent);
            }
        });
    }

}
