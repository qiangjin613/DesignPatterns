package com.designpatterns.practice.adapter.demo2;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Enumeration 适配 Iterator
 */
public class EnumerationAdapter implements Iterator {

    Enumeration enumeration;

    public EnumerationAdapter(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }
}
