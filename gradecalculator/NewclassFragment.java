package edu.auburn.eng.csse.comp3170.sjh0020.gradecalculator;

import android.support.v4.app.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class NewclassFragment extends Fragment
{
    Button doneButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_newclass, container, false);
    }

    @Override
    public void onStart()
    {
        super.onStart();

        doneButton = (Button) getView().findViewById(R.id.doneButton);
        doneButton.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v){
                //get class name
                //set weights and categories
                //set categories

            }
        });

    }




}