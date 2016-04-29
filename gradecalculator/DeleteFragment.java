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

public class DeleteFragment extends Fragment
{
    final static String ARG_POSITION = "position";
    int mCurrentPosition = -1;
    Button myButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {

        if (savedInstanceState != null)
        {
            mCurrentPosition = savedInstanceState.getInt(ARG_POSITION);
        }

        return inflater.inflate(R.layout.fragment_delete, container, false);
    }

    @Override
    public void onStart()
    {
        super.onStart();

        /*myButton = (Button) getView().findViewById(R.id.button);
        myButton.setOnClickListener(new Button.OnClickListener()
        {

            public void onClick(View v)
            {
                Toast toast = Toast.makeText(getActivity().getApplicationContext(),
                        "button pressed", Toast.LENGTH_SHORT);
                toast.show();

            }
        });*/

    }




}