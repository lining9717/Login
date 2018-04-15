package mg.studio.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import mg.studio.myapplication.AppPrivateDirectory.AppPrivateDirectory;
import mg.studio.myapplication.AssertFolder.AssertFolder;
import mg.studio.myapplication.AudioRecord.AudioRecord;
import mg.studio.myapplication.Button_Design.Button_Design;
import mg.studio.myapplication.Button_Intent.Button_Intent;
import mg.studio.myapplication.Button_StartActivity.Button_StartActivity_Main;
import mg.studio.myapplication.Button_StartActivity_Extra.Button_StartActivity_Extra_Main;
import mg.studio.myapplication.Button_Toast.Button_Toast_Main;
import mg.studio.myapplication.DataBase.Database;
import mg.studio.myapplication.EditText.EditText_Main;
import mg.studio.myapplication.FingerPrint.FingerPrint;
import mg.studio.myapplication.GetColor.GetColor;
import mg.studio.myapplication.GradientBackground.GradientBackground;
import mg.studio.myapplication.ImplicIntent.ImplicIntent_Main;
import mg.studio.myapplication.Intent_Extra.IntentExtra_Main;
import mg.studio.myapplication.Layout.Layout_Main;
import mg.studio.myapplication.Layout_Final.Layout_Final_Main;
import mg.studio.myapplication.LifeCycle.LifeCycle;
import mg.studio.myapplication.ListView.ListView_Main;
import mg.studio.myapplication.ListView2.ListView2;
import mg.studio.myapplication.ListViewCustomAdapter.ListViewCustomAdapter;
import mg.studio.myapplication.RadioButton_Listener.RadioButton_Listener;
import mg.studio.myapplication.RadioButton_OnClick.RadioButton_OnClick;
import mg.studio.myapplication.Service.Service_Main;
import mg.studio.myapplication.ServiceDemo.ServiceDemo_Main;
import mg.studio.myapplication.UserName.UserName;
import mg.studio.myapplication.UserName_Final.Username_final;
import mg.studio.myapplication.Weather.Weather;
import mg.studio.myapplication.WebView_Activity.WebView_Main;
import mg.studio.myapplication.fragment.Fragment_Main;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private TextView tvName;
    private ListView listView;
    private String[] data = {
            "LifeCycle", "UserName", "UserName_Final", "Layout", "Layout_Final", "Button Design", "Button_Toast", "Button_Intent",
            "Button_StartActivity", "Button_StartActivity_extra", "ImageButton", "EditText",
            "RadioButtons_listener", "RadioButtons_onclick", "listView", "GetColor", "GradientBackground", "ImplicitIntent",
            "Weather_App_Design", "ListView", "ListViewCustomAdapter", "AudioRecorder", "DataBase", "FragmentOne", "Webview",
            "ServiceDemo", "Service", "Fingerprint", "AppPrivateDirectory", "AssetsFolder", "IntentExtras"};
    private SessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = findViewById(R.id.user_name);
        listView = findViewById(R.id.list);


        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.tv_item, data);
        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(this);
        /**
         * Only logged in users should access this activity
         */
        session = new SessionManager(getApplicationContext());
        if (!session.isLoggedIn()) {
            logout();
        }

        /**
         * If the user just registered an account from Register.class,
         * the parcelable should be retrieved
         */
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            // Retrieve the parcelable
            Feedback feedback = bundle.getParcelable("feedback");
            // Get the from the object
            String userName = feedback.getName();
            tvName.setText(userName);
        }


    }

    /**
     * Logging out the user:
     * - Will set isLoggedIn flag to false in SharedPreferences
     * - Clears the user data from SqLite users table
     */

    public void btnLogout(View view) {
        logout();
    }

    public void logout() {
        // Updating the session
        session.setLogin(false);
        // Redirect the user to the login activity
        startActivity(new Intent(this, Login.class));
        finish();
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0)
            startActivity(new Intent(MainActivity.this, LifeCycle.class));
        if (position == 1)
            startActivity(new Intent(MainActivity.this, UserName.class));
        if (position == 2)
            startActivity(new Intent(MainActivity.this, Username_final.class));
        if (position == 3)
            startActivity(new Intent(MainActivity.this, Layout_Main.class));
        if (position == 4)
            startActivity(new Intent(MainActivity.this, Layout_Final_Main.class));
        if (position == 5)
            startActivity(new Intent(MainActivity.this, Button_Design.class));
        if (position == 6)
            startActivity(new Intent(MainActivity.this, Button_Toast_Main.class));
        if (position == 7)
            startActivity(new Intent(MainActivity.this, Button_Intent.class));
        if (position == 8)
            startActivity(new Intent(MainActivity.this, Button_StartActivity_Main.class));
        if (position == 9)
            startActivity(new Intent(MainActivity.this, Button_StartActivity_Extra_Main.class));
        if (position == 10)
            startActivity(new Intent(MainActivity.this, ImageButton.class));
        if (position == 11)
            startActivity(new Intent(MainActivity.this, EditText_Main.class));
        if (position == 12)
            startActivity(new Intent(MainActivity.this, RadioButton_Listener.class));
        if (position == 13)
            startActivity(new Intent(MainActivity.this, RadioButton_OnClick.class));
        if (position == 14)
            startActivity(new Intent(MainActivity.this, ListView_Main.class));
        if (position == 15)
            startActivity(new Intent(MainActivity.this, GetColor.class));
        if (position == 16)
            startActivity(new Intent(MainActivity.this, GradientBackground.class));
        if (position == 17)
            startActivity(new Intent(MainActivity.this, ImplicIntent_Main.class));
        if (position == 18)
            startActivity(new Intent(MainActivity.this, Weather.class));
        if (position == 19)
            startActivity(new Intent(MainActivity.this, ListView2.class));
        if (position == 20)
            startActivity(new Intent(MainActivity.this, ListViewCustomAdapter.class));
        if (position == 21)
            startActivity(new Intent(MainActivity.this, AudioRecord.class));
        if (position == 22)
            startActivity(new Intent(MainActivity.this, Database.class));
        if (position == 23)
            startActivity(new Intent(MainActivity.this, Fragment_Main.class));
        if (position == 24)
            startActivity(new Intent(MainActivity.this, WebView_Main.class));
        if (position == 25)
            startActivity(new Intent(MainActivity.this, ServiceDemo_Main.class));
        if (position == 26)
            startActivity(new Intent(MainActivity.this, Service_Main.class));
        if (position == 27)
            startActivity(new Intent(MainActivity.this, FingerPrint.class));
        if (position == 28)
            startActivity(new Intent(MainActivity.this, AppPrivateDirectory.class));
        if (position == 29)
            startActivity(new Intent(MainActivity.this, AssertFolder.class));
        if (position == 30)
            startActivity(new Intent(MainActivity.this, IntentExtra_Main.class));
    }
}