package com.telmediq.iconify.fonts;

import com.telmediq.iconify.Icon;
import com.telmediq.iconify.IconFontDescriptor;

public class IoniconsModule implements IconFontDescriptor {

    @Override
    public String ttfFileName() {
        return "iconify/android-iconify-ionicons.ttf";
    }

    @Override
    public Icon[] characters() {
        return IoniconsIcons.values();
    }
}
