package com.example.android.asrtourguide;

/**
 * Created by jasmbo on 10/3/17.
 */

public class Attraction {
    private String mName;
    private String mAddress;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Attraction(String name, String address, int imageResourceId) {
        mName=name;
        mAddress=address;
        mImageResourceId=imageResourceId;
    }

    public String getName() { return mName; }

    public String getAddress() { return mAddress; }

    public int getImageResourceId() { return mImageResourceId; }

}
