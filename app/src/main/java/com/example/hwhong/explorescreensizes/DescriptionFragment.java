package com.example.hwhong.explorescreensizes;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class DescriptionFragment extends Fragment {

    private TextView compName, description;
    private String[] descriptions;


    public DescriptionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.description_fragment, container, false);

        compName = (TextView) view.findViewById(R.id.compNameTV);
        description = (TextView) view.findViewById(R.id.descriptionTV);

        return view;
    }

    public void updateInfo(String name) {
        descriptions = getResources().getStringArray(R.array.descrip);

        compName.setText(name);

        switch(name) {
            case "Apple":
                description.setText(descriptions[0]);
                break;
            case "Beme":
                description.setText(descriptions[1]);
                break;
            case "Square":
                description.setText(descriptions[2]);
                break;
            case "Uber":
                description.setText(descriptions[3]);
                break;
            case "Twitter":
                description.setText(descriptions[4]);
                break;
            case "Google":
                description.setText(descriptions[5]);
                break;
            case "Samsung":
                description.setText(descriptions[6]);
                break;
            case "Facebook":
                description.setText(descriptions[7]);
                break;
            case "Watsi":
                description.setText(descriptions[8]);
                break;
            case "Airbnb":
                description.setText(descriptions[9]);
                break;
        }
    }

}
