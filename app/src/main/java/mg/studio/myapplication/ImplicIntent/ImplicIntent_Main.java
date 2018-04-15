package mg.studio.myapplication.ImplicIntent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import mg.studio.myapplication.R;

public class ImplicIntent_Main extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.implicitintent);

    }

    public void Receiver(View view) {
        startActivity(new Intent(ImplicIntent_Main.this, AppIntentReceiver.class));
    }

    public void Caller(View view) {
        startActivity(new Intent(ImplicIntent_Main.this, AppIntentCaller.class));
    }
}
