package com.example.blackice;

import static android.content.Context.MODE_PRIVATE;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.blackice.databinding.ActivityMainBinding;


public class MainFragment extends Fragment {

    private SharedPreferences pref;
    private EditText editsave;

    private ActivityMainBinding bindingMain;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindingMain = ActivityMainBinding.inflate(LayoutInflater.from(requireContext()));


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        bindingMain = ActivityMainBinding.inflate(inflater, container, false);
        View view = bindingMain.getRoot();
        //return view;
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        bindingMain = null;
    }

}