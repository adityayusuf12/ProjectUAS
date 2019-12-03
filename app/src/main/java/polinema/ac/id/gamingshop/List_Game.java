package polinema.ac.id.gamingshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import polinema.ac.id.gamingshop.R;

public class List_Game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__game);
    }

    public void handleGameOnline(View view) {
//        getSupportFragmentManager().beginTransaction()
//                .replace(R.id.gamelist_fragment_placeholder, new GameOnlineFragment())
//                .commit();



        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        GameOnlineFragment gameonlineFragment = (GameOnlineFragment) getSupportFragmentManager().findFragmentByTag("GAMEONLINE_FRAGMENT");
        if (gameonlineFragment != null && gameonlineFragment.isVisible()) {
            //fragmentTransaction.commit();
        } else {
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.enter_from_right, R.anim.exit_from_left, R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.gamelist_fragment_placeholder, new GameOnlineFragment(), "GANEONLINE_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

    public void handleGameOffline(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        GameOfflineFragment gameofflineFragment = (GameOfflineFragment) getSupportFragmentManager().findFragmentByTag("GAMEOFFLINE_FRAGMENT");
        if(gameofflineFragment != null && gameofflineFragment.isVisible()){
            fragmentTransaction.commit();
        }
        else{
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.enter_from_right, R.anim.exit_from_left, R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.gamelist_fragment_placeholder, new GameOfflineFragment(), "GAMEOFFLINE_FRAGMENT");
            fragmentTransaction.commit();
        }
    }

}

