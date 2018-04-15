package mg.studio.myapplication.Intent_Extra;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mg.studio.myapplication.R;

public class IntentExtra_Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intert_extra_main);

    }

    public void btnClick(View view) {
        String value = "Hello World! - This message was from the first activity.";
        Intent intent = new Intent(getApplicationContext(), NewActivity.class);
        intent.putExtra("keyword", value);
        startActivity(intent);
    }
}
