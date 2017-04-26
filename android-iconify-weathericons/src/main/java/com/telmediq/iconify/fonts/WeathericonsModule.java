package com.telmediq.iconify.fonts;

import com.telmediq.iconify.Icon;
import com.telmediq.iconify.IconFontDescriptor;

public class WeathericonsModule implements IconFontDescriptor {

    @Override
    public String ttfFileName() {
        return "iconify/android-iconify-weathericons.ttf";
    }

    @Override
    public Icon[] characters() {
        return WeathericonsIcons.values();
    }
}
