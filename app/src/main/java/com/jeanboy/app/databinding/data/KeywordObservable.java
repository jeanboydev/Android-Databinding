package com.jeanboy.app.databinding.data;

import androidx.databinding.BaseObservable;

/**
 * @author caojianbo
 * @since 2020/1/6 15:15
 */
public class KeywordObservable extends BaseObservable {

    public final String value;

    public KeywordObservable(String value) {
        this.value = value;
    }
}
