package polinema.ac.id.gamingshop.HeadsetFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class MyPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){

    //sebuah list yang menampung objek Fragment
    private val pages = listOf(
            HSteelseriesFragment(),
            HRazerFragment(),
            HLogitechFragment()
    )

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    //judul untuk tabs
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "First Tab"
            1 -> "Second Tab"
            else -> "Third Tab"
        }
    }
}
