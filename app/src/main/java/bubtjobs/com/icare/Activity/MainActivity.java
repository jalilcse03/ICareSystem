package bubtjobs.com.icare.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import bubtjobs.com.icare.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }
}
