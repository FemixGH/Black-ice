package com.example.blackice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import com.example.blackice.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences pref;
    private EditText editsave;
    private final String save_key = "save_key";

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());
        //init();

        MainFragment mainFragment = new MainFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, mainFragment);
        fragmentTransaction.commit();

//        SharedPreferences.Editor edit = pref.edit();
//        edit.putString(save_key, editsave.getText().toString());
//        edit.apply();
    }

    public void onClick1(View view) {
        MainFragment mainFragment = new MainFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, mainFragment);
        fragmentTransaction.commit();
    }

    public void onClick2(View view) {
        libraryFragment libraryFragment = new libraryFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, libraryFragment);
        fragmentTransaction.commit();
    }

    public void onClick3(View view) {
        photoFragment photoFragment = new photoFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, photoFragment);
        fragmentTransaction.commit();
    }

    private void init(){
        pref = getSharedPreferences("Test", MODE_PRIVATE);
        editsave = findViewById(R.id.editText);
        editsave.setText(pref.getString(save_key, "empty"));
    }

}