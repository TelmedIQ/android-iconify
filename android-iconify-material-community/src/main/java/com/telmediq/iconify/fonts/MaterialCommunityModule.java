package com.telmediq.iconify.fonts;

import com.telmediq.iconify.Icon;
import com.telmediq.iconify.IconFontDescriptor;

public class MaterialCommunityModule implements IconFontDescriptor {

    @Override
    public String ttfFileName() {
        return "iconify/android-iconify-material-community.ttf";
    }

    @Override
    public Icon[] characters() {
        return MaterialCommunityIcons.values();
    }
}
