package polinema.ac.id.gamingshop.MouseFragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import polinema.ac.id.gamingshop.MouseFragment.MLogitechFragment
import polinema.ac.id.gamingshop.MouseFragment.MRazerFragment
import polinema.ac.id.gamingshop.MouseFragment.MSteelseriesFragment


class MyPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){

    //sebuah list yang menampung objek Fragment
    private val pages = listOf(
            MSteelseriesFragment(),
            MRazerFragment(),
            MLogitechFragment()
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