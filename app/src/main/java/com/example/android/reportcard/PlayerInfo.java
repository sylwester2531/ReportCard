package com.example.android.reportcard;

/**
 * Created by admin on 2017-07-08.
 */

public class PlayerInfo {

    private int mImageResourceId;
    private String mNamePlayer;
    private String mPlayerPosition;
    private String mPlayerAge;
    private String mPlayerHeight;


    public PlayerInfo(int ImageResourceId, String playerName, String playerPosition, String playerAge, String playerHeight) {
        mImageResourceId = ImageResourceId;
        mNamePlayer = playerName;
        mPlayerPosition = playerPosition;
        mPlayerAge = playerAge;
        mPlayerHeight = playerHeight;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getmNamePlayer() {
        return mNamePlayer;
    }

    public String getmPlayerPosition() {
        return mPlayerPosition;
    }

    public String getmPlayerAge() {
        return mPlayerAge;
    }

    public String getmPlayerHeight() {
        return mPlayerHeight;
    }
}
