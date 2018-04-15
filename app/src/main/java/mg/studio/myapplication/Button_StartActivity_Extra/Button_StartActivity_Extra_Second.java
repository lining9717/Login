package mg.studio.myapplication.Button_StartActivity_Extra;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import mg.studio.myapplication.R;

public class Button_StartActivity_Extra_Second extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_startactivity_extra_second);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String retrievedInformation = extras.getString("shared_data");
            TextView display = findViewById(R.id.txtLayout);
            display.setText(retrievedInformation);
        }

    }
}
