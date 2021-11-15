package com.unity3d.player;

import android.util.Log;

import com.yandex.metrica.YandexMetrica;

public class UnityCallMapping {
    public static final UnityCallMapping instance = new UnityCallMapping();

    public void passStringValue(String value) {
        Log.d("UnityCallMapping", value);
        YandexMetrica.reportEvent("unity_value_reported", value);
    }
}
