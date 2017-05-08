package com.example.kh.myapplication.Module;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kh.myapplication.R;
import com.squareup.picasso.Picasso;

/**
 * Created by kh on 5/8/2017.
 */

public class Fragment_Bottom  extends Fragment implements Communator{
    ImageView im;
    TextView txt;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_bot, container, false);
        im = (ImageView) view.findViewById(R.id.im);
        txt  = (TextView) view.findViewById(R.id.txt);
        if(savedInstanceState==null){
            txt.setText("");
        }else{
            String data = savedInstanceState.getString("data");
            txt.setText(data);
        }
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }



    @Override
    public void onStart() {
        super.onStart();
        Picasso.with(getActivity()).load("http://hoahongmagic.com/wp-content/uploads/2015/05/hoa-hong-tinh-yeu.jpg").placeholder(R.mipmap.ic_launcher_round).into(im);

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("data", txt.getText().toString().trim());
    }

    @Override
    public void GetText(String text) {
        txt.setText(text);
    }
}
