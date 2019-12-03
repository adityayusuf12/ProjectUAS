package polinema.ac.id.gamingshop;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import polinema.ac.id.gamingshop.GameOfflineActivity.Darksoul3;
import polinema.ac.id.gamingshop.GameOfflineActivity.ResidenEvil;
import polinema.ac.id.gamingshop.GameOfflineActivity.Sekiro;
import polinema.ac.id.gamingshop.GameOfflineActivity.TheWitcher;
import polinema.ac.id.gamingshop.GameOfflineActivity.TombRaider;
import polinema.ac.id.gamingshop.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class GameOfflineFragment extends Fragment {

    ImageView imageview1;
    ImageView imageview2;
    ImageView imageview3;
    ImageView imageview4;
    ImageView imageview5;

    public GameOfflineFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_game_offline, container, false);
        imageview1 = view.findViewById(R.id.imageView);
        imageview2 = view.findViewById(R.id.imageView2);
        imageview3 = view.findViewById(R.id.imageView3);
        imageview4 = view.findViewById(R.id.imageView4);
        imageview5 = view.findViewById(R.id.imageView5);

        imageview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ResidenEvil.class);
                intent.putExtra("some","some data");
                startActivity(intent);

            }
        });

        imageview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Darksoul3.class);
                intent.putExtra("some","some data");
                startActivity(intent);
            }
        });

        imageview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TheWitcher.class);
                intent.putExtra("some","some data");
                startActivity(intent);
            }
        });

        imageview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Sekiro.class);
                intent.putExtra("some","some data");
                startActivity(intent);
            }
        });

        imageview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TombRaider.class);
                intent.putExtra("some","some data");
                startActivity(intent);
            }
        });
        return view;
    }

}
