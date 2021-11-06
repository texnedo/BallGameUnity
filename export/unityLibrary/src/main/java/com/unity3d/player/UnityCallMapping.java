package com.unity3d.player;

import android.util.Log;

public class UnityCallMapping {
    public static final UnityCallMapping instance = new UnityCallMapping();

    public void passStringValue(String value) {
        Log.d("UnityCallMapping", value);
    }
}
