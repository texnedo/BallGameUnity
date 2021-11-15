package com.texnedo.crazyball_game;

import android.app.Application;

import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.YandexMetricaConfig;

public class CrazyBallApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Creating an extended library configuration.
        YandexMetricaConfig config = YandexMetricaConfig
                .newConfigBuilder("907c6de3-be0b-4052-b4b7-1b18cf52ebaa")
                .withLogs()
                .withCrashReporting(true)
                .withStatisticsSending(true)
                .withInstalledAppCollecting(true)
                .build();
        // Initializing the AppMetrica SDK.
        YandexMetrica.activate(getApplicationContext(), config);
        // Automatic tracking of user activity.
        YandexMetrica.enableActivityAutoTracking(this);
        YandexMetrica.setLocationTracking(true);
        YandexMetrica.reportEvent("app_launched");
    }
}
