package mg.studio.myapplication.ImplicIntent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import mg.studio.myapplication.R;

public class AppIntentReceiver_Second extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appintentreceiver);
        ((TextView)findViewById(R.id.display)).setText(getClass().getSimpleName());

    }
}
