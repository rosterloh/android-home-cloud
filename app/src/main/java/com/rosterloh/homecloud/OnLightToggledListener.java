package com.rosterloh.homecloud;

/**
 * Simple callback interface for any class that needs to listen for Leds being switched on or off.
 */
public interface OnLightToggledListener {
    void onLightToggled(int position, boolean isLightOn);
}
