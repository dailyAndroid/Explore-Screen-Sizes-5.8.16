package com.example.hwhong.explorescreensizes;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class NameFragment extends Fragment {

    private ListView listView;
    private ArrayAdapter<String> adapter;
    private Communicate communicate;
    private String[] names;

    public NameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.name_fragment, container, false);
        listView = (ListView) view.findViewById(R.id.listView);
        names = getResources().getStringArray(R.array.name);
        adapter = new ArrayAdapter<String>(getActivity(),
                R.layout.companylistview, R.id.rowItem, names);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String item = names[i];
                //now passed to MainActivity
                communicate.onRespond(item);


            }
        });
        return view;
    }

    public interface Communicate {
        public void onRespond(String name);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            communicate = (Communicate) activity;
        } catch(Exception e) {}
    }
}
