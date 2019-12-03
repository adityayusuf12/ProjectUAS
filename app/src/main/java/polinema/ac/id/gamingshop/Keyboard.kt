package polinema.ac.id.gamingshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import polinema.ac.id.gamingshop.KeyboardFragment.MyPagerAdapter
import kotlinx.android.synthetic.main.activity_headset.*

class Keyboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keyboard)

        viewpager_main.adapter = MyPagerAdapter(supportFragmentManager)
    }
}
