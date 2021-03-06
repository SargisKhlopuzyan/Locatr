package com.example.sargiskh.locatr;

import android.net.Uri;

/**
 * Created by sargiskh on 12/1/2016.
 */

public class GalleryItem {

    private String mCaption;
    private String mId;
    private String mUrl;
    private String mOwner;
    private double mLat;
    private double mLon;

    public void setCaption(String mCaption) {
        this.mCaption = mCaption;
    }

    public void setId(String mId) {
        this.mId = mId;
    }

    public void setUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String owner) {
        mOwner = owner;
    }

    public Uri getPhotoPageUri() {
        return Uri.parse("http://www.flickr.com/photos/")
                .buildUpon()
                .appendPath(mOwner)
                .appendPath(mId)
                .build();
    }

    public String getUrl() {
        return mUrl;
    }

    public double getLat() {
        return mLat;
    }

    public void setLat(double lat) {
        mLat = lat;
    }

    public double getLon() {
        return mLon;
    }

    public void setLon(double lon) {
        mLon = lon;
    }

    @Override
    public String toString() {
        return mCaption;
    }

    public String getId() {
        return mId;
    }
}
