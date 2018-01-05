package org.esiea.cam_gidon.olaf;

import android.app.Notification;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Toast;


/**
 * Created by thiba on 05/01/2018.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ToastCreator(View v){
        Toast.makeText(getApplicationContext(),"Test", Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(),getString(R.string.msg), Toast.LENGTH_LONG).show();
    }

    public void NotifCreator(View v){
        //Notification notif
    }

    public void DialogCreator(View v){
        //R.layout.activity_dialog
    }
}


