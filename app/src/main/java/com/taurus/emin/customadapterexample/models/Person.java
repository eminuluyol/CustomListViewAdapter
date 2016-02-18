package com.taurus.emin.customadapterexample.models;

/**
 * Created by Emin on 2/18/2016.
 */
public class Person {
    private String name;
    private final String address;
    private int photoId;

    public Person(String name,String address,  int photoId) {
        this.name = name;
        this.address = address;
        this.photoId = photoId;

    }

    public int getPhotoId() {
        return photoId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {return address;}

}

