package polinema.ac.id.gamingshop;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import polinema.ac.id.gamingshop.R;

public class DetailHeadset3 extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_headset3);

        getSupportActionBar().setTitle("Logitech G231 Prodigy");
        getSupportActionBar().setSubtitle("");

        videoView = (VideoView)findViewById(R.id.videoView);
        //inisialisasi object videoview
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/" + R.raw.headsetlogitech));
        //digunakan untuk mengidentifikasi resource seperti lokasi video
        videoView.setMediaController(new MediaController(this));
        //menampilkan media controler video
        videoView.start();
        //memulaivideo
    }
}
