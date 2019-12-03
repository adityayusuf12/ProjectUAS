package polinema.ac.id.gamingshop

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import polinema.ac.id.gamingshop.MouseFragment.MyPagerAdapter
import kotlinx.android.synthetic.main.activity_mouse.*

class Mouse : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mouse)

        viewpager_main.adapter = MyPagerAdapter(supportFragmentManager)
    }
}
