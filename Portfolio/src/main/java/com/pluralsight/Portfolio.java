package com.pluralsight;

import java.util.ArrayList;

public class Portfolio extends FixedAsset{
    private String name;
    private String owner;
    public static ArrayList<FixedAsset> assets = new ArrayList<>();
    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }
}
