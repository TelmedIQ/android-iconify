package com.telmediq.iconify.sample;

import android.app.Application;
import com.telmediq.iconify.Iconify;

public class SampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        for (Font font : Font.values())
            Iconify.with(font.getFont());
    }
}
