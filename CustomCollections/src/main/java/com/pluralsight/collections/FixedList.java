package com.pluralsight.collections;

import java.util.ArrayList;

public class FixedList<T> {

    private int maxSize;
    ArrayList<T> items = new ArrayList<>();

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }
    public void add(T item){
        if(items.size() >= maxSize){
            System.out.println("List at capacity: cannot add more");
            return;
        }
        items.add(item);
    }
    public ArrayList<T> getItems() {
        return items;
    }
}
