package com.github.appreciated.app.layout.test.view.plain.basic;

import com.github.appreciated.app.layout.test.view.ExampleView;

public class View1 extends ExampleView {
    @Override
    protected String getViewName() {
        return getClass().getName();
    }
}