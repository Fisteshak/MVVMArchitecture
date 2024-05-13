package com.example.mvvmarchitecture;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.mvvmarchitecture.databinding.ActivityMainBinding;
import com.example.mvvmarchitecture.repository.NoteRepository;
import com.example.mvvmarchitecture.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainViewModel mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        binding.setViewmodel(mainViewModel);
        binding.invalidateAll();
        binding.executePendingBindings();
        binding.setLifecycleOwner(this);

        mainViewModel.init(getApplicationContext());
//        TextView tv = findViewById(R.id.TV);
//        Button insertBtn = findViewById(R.id.InsertBtn);
//        insertBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mainViewModel.insertClick();
//            }
//        });
//
//        Button getBtn = findViewById(R.id.GetBtn);
//        getBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mainViewModel.getAllClick();
//            }
//        });

//        mainViewModel.getNotesLD().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(String s) {
//                tv.setText(s);
//            }
//        });
    }

}