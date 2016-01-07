package com.example.amrosman.safer;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {


    private static final int LOGOUT_ITEM = 1001 ;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    private CoordinatorLayout coordinatorLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinator);

        Log.d(getClass().getSimpleName(), "onCreate");
        Button logbutton = (Button) findViewById(R.id.loginbutton);
        logbutton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                EditText et = (EditText) findViewById(R.id.emailtext);
                String emailentered = et.getText().toString();
                Snackbar.make(view, "You have entered: " + emailentered, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }


        });

        Button createbutton = (Button) findViewById(R.id.createaccount);
        createbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "You Sure bruh!! ", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.

        StringBuilder build = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            build.append(getString(R.string.letsdoit) + "\n\n");
        }

        TextView mul = (TextView) findViewById(R.id.letsdoit);
        mul.setText(build);

        //Display Images from the Assets Folder
        String imagename = "abroad.jpg";
        ImageView studyabroad = (ImageView) findViewById(R.id.study_abroad);

        try {
            InputStream stream = getAssets().open(imagename);
            Drawable d = Drawable.createFromStream(stream, null);
            studyabroad.setImageDrawable(d);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        studyabroad.setImageResource(R.drawable.abroad);


        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
       menu.add(1, LOGOUT_ITEM,102,"Log out");
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        switch (id) {
            case R.id.action_settings:

                Snackbar.make(coordinatorLayout, "You selected settings", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                return  true;
            case R.id.action_about:
                Snackbar.make(coordinatorLayout, "You selected About", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                return  true;
            case LOGOUT_ITEM:
                Snackbar.make(coordinatorLayout, "You selected log out", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                return  true;
            case R.id.action_myprofile:
                Snackbar.make(coordinatorLayout, "You selected your profile", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                return  true;


        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(getClass().getSimpleName(), "onStart");

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.amrosman.safer/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(getClass().getSimpleName(), "onResume");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(getClass().getSimpleName(), "onStop");

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.amrosman.safer/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(getClass().getSimpleName(), "onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(getClass().getSimpleName(), "onDestroy");

    }

    public void Handlethisshit(View view) {
        Snackbar.make(view, "Facebook sucks", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Toast.makeText(MainActivity.this, "Your View is Portrait", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(MainActivity.this, "Your View is Landscape", Toast.LENGTH_LONG).show();

        }
    }
}
