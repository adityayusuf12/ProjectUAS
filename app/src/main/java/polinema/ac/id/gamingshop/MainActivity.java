package polinema.ac.id.gamingshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import polinema.ac.id.gamingshop.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleListGame(View view) {
        Intent intent =  new Intent(this,List_Game.class);
        startActivity(intent);
    }
    public void handleGamingGears(View view) {
        Intent intent =  new Intent(this,GamingGears.class);
        startActivity(intent);
    }

}
