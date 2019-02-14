package com.example.nnenna.mystoragehelper;

/**
 * Created by nnenna on 1/11/19.
 */

public class Upload {

    private String mName;
    private String mImageUrl;
    private String mKey;

    public Upload(String trim, String s){
//        empty constructor needed
    }

    public Upload(String mName, String mImageUrl, String mKey) {
        if (mName.trim().equals("")){
            mName = "No Name";
        }

        this.mName = mName;
        this.mImageUrl = mImageUrl;
        this.mKey = mKey;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }

//    @Exclude
    public String getmKey() {
        return mKey;
    }

//    @Exclude
    public void setmKey(String mKey) {
        this.mKey = mKey;
    }
}


