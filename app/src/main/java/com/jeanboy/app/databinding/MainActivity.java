package com.jeanboy.app.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.jeanboy.app.databinding.data.DataModel;
import com.jeanboy.app.databinding.data.DataObservable;
import com.jeanboy.app.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private DataModel dataModel;
    private DataObservable dataObservable;
    private String keyword = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,
                R.layout.activity_main);
        dataModel = new DataModel("haha", 2020);

        dataObservable = new DataObservable("哈哈", 2021);
//        binding.setUser(dataObservable);
        binding.setData(dataObservable);
        binding.setHint("请输入关键词");
        binding.setKeyword(keyword);
        binding.etKeyword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                keyword = s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void toUpdate(View view) {
        dataObservable.name.set("哈哈");
        dataObservable.age.set(2019);
        Toast.makeText(this, keyword, Toast.LENGTH_SHORT).show();
    }
}
