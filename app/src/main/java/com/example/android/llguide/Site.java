package com.example.android.llguide;

public class Site {

    private int SiteImage;
    private int TitleId;
    private int DescriptionId;

    public Site(int siteImage, int titleId, int descriptionId ){
        SiteImage = siteImage;
        TitleId = titleId;
        DescriptionId = descriptionId;
    }


    public int getSiteImage(){
        return SiteImage;
    }

    public int getTitleId(){
        return TitleId;
    }

    public int getDescriptionId(){
        return DescriptionId;
    }
}


