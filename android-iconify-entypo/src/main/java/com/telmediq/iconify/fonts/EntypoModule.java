package com.telmediq.iconify.fonts;

import com.telmediq.iconify.Icon;
import com.telmediq.iconify.IconFontDescriptor;

public class EntypoModule implements IconFontDescriptor {

    @Override
    public String ttfFileName() {
        return "iconify/android-iconify-entypo.ttf";
    }

    @Override
    public Icon[] characters() {
        return EntypoIcons.values();
    }
}
