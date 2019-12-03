package polinema.ac.id.gamingshop.HeadsetFragment


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import polinema.ac.id.gamingshop.DetailHeadset3
import polinema.ac.id.gamingshop.R

/**
 * A simple [Fragment] subclass.
 */
class HLogitechFragment : Fragment() {

    internal lateinit var button1: Button;

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_headset3, container, false)

        button1 = view.findViewById(R.id.button);

        button1.setOnClickListener(View.OnClickListener {
            val intent = Intent(activity, DetailHeadset3::class.java)
            intent.putExtra("some", "some data")
            startActivity(intent)
        })
        return view;
    }


}
