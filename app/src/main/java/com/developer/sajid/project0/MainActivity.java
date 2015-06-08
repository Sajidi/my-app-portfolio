package com.developer.sajid.project0;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {

    private Button spotifyStreamerBtn;
    private Button scroesappBtn;
    private Button libraryAppBtn;
    private Button builditbiggerBtn;
    private Button xyzreaderBtn;
    private Button capsstoneBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spotifyStreamerBtn= (Button) findViewById(R.id.spotify);
        scroesappBtn=(Button) findViewById(R.id.scoresapp);
        libraryAppBtn=(Button) findViewById(R.id.libraryapp);
        builditbiggerBtn=(Button) findViewById(R.id.builditbigger);
        xyzreaderBtn=(Button) findViewById(R.id.xyzreader);
        capsstoneBtn=(Button) findViewById(R.id.capstone);

        spotifyStreamerBtn.setOnClickListener(this);
       scroesappBtn.setOnClickListener(this);
       libraryAppBtn.setOnClickListener(this);
       builditbiggerBtn.setOnClickListener(this);
       xyzreaderBtn.setOnClickListener(this);
       capsstoneBtn.setOnClickListener(this);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

        if(view == spotifyStreamerBtn)
        {
            DisplayMessage("This button will launch my Spotify Stream App");
        }else
        if(view == scroesappBtn)
        {
            DisplayMessage("This button will launch my Scores App");
        }else
        if(view == libraryAppBtn)
        {
            DisplayMessage("This button will launch my Library App");
        }else
        if(view == builditbiggerBtn)
        {
            DisplayMessage("This button will launch my Build it Bigger App");
        }else
        if(view == xyzreaderBtn)
        {
            DisplayMessage("This button will launch my XYZ Reader App");
        }else
        if(view == capsstoneBtn)
        {
            DisplayMessage("This button will launch my Capston App");
        }


    }

    public void DisplayMessage(String message)
    {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}
