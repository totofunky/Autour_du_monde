package com.example.thorin_lenain.autourdumonde;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.thorin_lenain.autourdumonde.model.Resto;
import com.example.thorin_lenain.autourdumonde.model.Restos;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Thorin_LeNain on 15/10/2014.
 */
public class Fragment_list extends Fragment {
    private View view;
    private ListView listView;
    private SimpleAdapter mSchedule;
    private ArrayList<HashMap<String, String>> listItem = new ArrayList<HashMap<String, String>>();
    private EditText editText;
    private ArrayAdapter<Resto> arrayAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_list, container, false);
        listView =(ListView) view.findViewById(R.id.list_resto);
        editText =(EditText) view.findViewById(R.id.search_edit);

    /*    HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("titre","Japonais");
        hashMap.put("com","8 rue vesal, 75005, PARIS");
        listItem.add(hashMap);

        hashMap = new HashMap<String, String>();
        hashMap.put("titre","Mexicain");
        hashMap.put("com","8 rue vesal, 75005, PARIS");
        listItem.add(hashMap);

        hashMap = new HashMap<String, String>();
        hashMap.put("titre","Americain");
        hashMap.put("com","8 rue vesal, 75005, PARIS");
        listItem.add(hashMap);


        mSchedule = new SimpleAdapter(getActivity(), listItem, R.layout.list_affichage,
                new String[]{"titre", "com"}, new int[]{R.id.titre, R.id.com});
                */
        arrayAdapter = new ArrayAdapter<Resto>(getActivity(), android.R.layout.simple_list_item_1, Restos.getInstance().getRestos());
        listView.setAdapter(arrayAdapter);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mSchedule.getFilter().filter(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        return view;
    }
}
