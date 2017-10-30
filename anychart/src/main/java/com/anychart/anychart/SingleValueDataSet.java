package com.anychart.anychart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleValueDataSet {

    private StringBuilder js = new StringBuilder();

    private List<Object> values = new ArrayList<>();

    public SingleValueDataSet(Object[] values) {
        this.values = Arrays.asList(values);
    }

    public SingleValueDataSet(List<Object> values) {
        this.values.addAll(values);
    }

    public void addValue(Object value) {
        values.add(value);
    }

    public boolean isEmpty() {
        return values.isEmpty();
    }

    public void clear() {
        values.clear();
    }

    protected String generateJs() {
        for (Object singleValue : values) {
            js.append(singleValue).append(",");
        }
        js.setLength(js.length() - 1);

        return js.toString();
    }

}
