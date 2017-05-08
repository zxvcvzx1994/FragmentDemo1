package com.example.kh.myapplication.Module;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.kh.myapplication.MainActivity;
import com.example.kh.myapplication.R;

/**
 * Created by kh on 5/8/2017.
 */

public class Fragment_Top extends Fragment {
    EditText et;
    Button btn;
    MainActivity mainActivity;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_top, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.mainActivity  = (MainActivity) getActivity();
        View  view  =getView();
        et = (EditText) view.findViewById(R.id.et);
        btn  = (Button) view.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = et.getText().toString().trim();
                mainActivity.SetString(data);
            }
        });
    }
}
