package com.rosterloh.homecloud;

public class Led {

    private boolean mLightOn;

    public Led(boolean lightOn) {
        mLightOn = lightOn;
    }

    public boolean isLightOn() {
        return mLightOn;
    }

    public boolean toggleLight() {
        mLightOn = !mLightOn;
        return mLightOn;
    }

}
