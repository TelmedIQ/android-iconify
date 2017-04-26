package com.telmediq.iconify.fonts;

import com.telmediq.iconify.Icon;
import com.telmediq.iconify.IconFontDescriptor;

public class MaterialModule implements IconFontDescriptor {

    @Override
    public String ttfFileName() {
        return "iconify/android-iconify-material.ttf";
    }

    @Override
    public Icon[] characters() {
        return MaterialIcons.values();
    }
}
