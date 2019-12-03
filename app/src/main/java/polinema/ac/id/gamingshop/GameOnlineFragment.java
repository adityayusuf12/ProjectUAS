package polinema.ac.id.gamingshop;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import polinema.ac.id.gamingshop.GameOnlineActivity.Dota;
import polinema.ac.id.gamingshop.GameOnlineActivity.MonsterHunter;
import polinema.ac.id.gamingshop.GameOnlineActivity.Overwatch;
import polinema.ac.id.gamingshop.GameOnlineActivity.Rocket_League;
import polinema.ac.id.gamingshop.GameOnlineActivity.Warframe;
import polinema.ac.id.gamingshop.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class GameOnlineFragment extends Fragment {

    ImageView imageview1;
    ImageView imageview2;
    ImageView imageview3;
    ImageView imageview4;
    ImageView imageview5;


    public GameOnlineFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_game_online, container, false);

        imageview1 = view.findViewById(R.id.imageView);
        imageview2 = view.findViewById(R.id.imageView2);
        imageview3 = view.findViewById(R.id.imageView3);
        imageview4 = view.findViewById(R.id.imageView4);
        imageview5 = view.findViewById(R.id.imageView5);

        imageview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Warframe.class);
                intent.putExtra("some","some data");
                startActivity(intent);

            }
        });

        imageview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Rocket_League.class);
                intent.putExtra("some","some data");
                startActivity(intent);
            }
        });

        imageview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Overwatch.class);
                intent.putExtra("some","some data");
                startActivity(intent);
            }
        });

        imageview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MonsterHunter.class);
                intent.putExtra("some","some data");
                startActivity(intent);
            }
        });

        imageview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Dota.class);
                intent.putExtra("some","some data");
                startActivity(intent);
            }
        });
        return view;

    }

}
