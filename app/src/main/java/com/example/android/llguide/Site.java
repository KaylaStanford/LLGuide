package com.example.android.llguide;

public class Site {

    private int mSiteImage;
    private int mTitleId;
    private int mDescriptionId;

    public Site(int siteImage, int titleId, int descriptionId ){
        mSiteImage = siteImage;
        mTitleId = titleId;
        mDescriptionId = descriptionId;
    }


    public int getSiteImage(){
        return mSiteImage;
    }

    public int getTitleId(){
        return mTitleId;
    }

    public int getDescriptionId(){
        return mDescriptionId;
    }
}


