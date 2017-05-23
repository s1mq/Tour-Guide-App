package com.example.android.tourguideapp;

/**
 * Created by tsare on 23.05.2017.
 */

public class Attraction {

    private String mAttractionName;

    private String mAttractionAddress;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Attraction(String attractionName, String attractionAddress, int imageResourceId){
        mAttractionName = attractionName;
        mAttractionAddress = attractionAddress;
        mImageResourceId = imageResourceId;
    }

    public String getAttractionName() {
        return mAttractionName;
    }

    public String getAttractionAddress() {
        return mAttractionAddress;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
