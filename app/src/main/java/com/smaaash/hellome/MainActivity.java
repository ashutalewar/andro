package com.smaaash.hellome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button button = new Button(this);
//        button.setText("yoyo");
//        Button button1 = new Button(this);
//        button1.setText("Second");
//        LinearLayout laylin = new LinearLayout(this);
//        laylin.setOrientation(LinearLayout.VERTICAL);
//        laylin.addView(button);
//        laylin.addView(button1);
//        setContentView(laylin);
        Log.d(TAG, "this is oncreate" + this.toString());
    }

    public void openNewActivity(View view){
        Log.d(TAG, "onOptionsItemSelected: yayyyyyyy clicked");
        Intent intent = new Intent(getApplicationContext(), browserActivity.class);
        startActivity(intent);
    }

    public void openCamera(View view){
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        return false;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "this is destroy" + this.toString());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "this is stopped" + this.toString());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "this is started" + this.toString());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "this is paused" + this.toString());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "this is resumed" + this.toString());
    }
}
