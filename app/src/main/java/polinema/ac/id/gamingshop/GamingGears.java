package polinema.ac.id.gamingshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import polinema.ac.id.gamingshop.R;

public class GamingGears extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaming_gears);
    }

    public void handleHeadset(View view) {
            Intent intent =  new Intent(this,Headset.class);
            startActivity(intent);
        }

    public void handleKeyboard(View view) {
        Intent intent =  new Intent(this,Keyboard.class);
        startActivity(intent);
    }

    public void handleMouse(View view) {
        Intent intent =  new Intent(this,Mouse.class);
        startActivity(intent);
    }

    public void handleKursiGaming(View view) {
        Intent intent =  new Intent(this,KursiGaming.class);
        startActivity(intent);
    }
}

