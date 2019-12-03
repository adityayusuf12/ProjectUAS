package polinema.ac.id.gamingshop.GameOfflineActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import polinema.ac.id.gamingshop.R;

public class Darksoul3 extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_darksoul3);

        Bundle bundle = getIntent().getExtras();
        if(bundle!= null){
            if (bundle.getString("some")!=null){
                Toast.makeText(getApplicationContext(),
                        "data"+ bundle.getString("some"),Toast.LENGTH_SHORT).show();
            }
        }

        getSupportActionBar().setTitle("DarkSoul 3");
        getSupportActionBar().setSubtitle("");

        videoView = (VideoView)findViewById(R.id.videoView);
        //inisialisasi object videoview
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/" + R.raw.darksoul));
        //digunakan untuk mengidentifikasi resource seperti lokasi video
        videoView.setMediaController(new MediaController(this));
        //menampilkan media controler video
        videoView.start();
        //memulaivideo
    }
}
