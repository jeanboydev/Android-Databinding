package com.jeanboy.app.databinding.data;

import androidx.databinding.ObservableField;

/**
 * @author caojianbo
 * @since 2020/1/6 14:45
 */
public class DataObservable {

    public ObservableField<String> name = new ObservableField<>();
    public ObservableField<Integer> age = new ObservableField<>();

    public DataObservable(String name, Integer age) {
        this.name.set(name);
        this.age.set(age);
    }
}
