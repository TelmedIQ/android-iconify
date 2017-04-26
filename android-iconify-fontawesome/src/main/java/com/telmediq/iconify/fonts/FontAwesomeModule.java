package com.telmediq.iconify.fonts;

import com.telmediq.iconify.Icon;
import com.telmediq.iconify.IconFontDescriptor;

public class FontAwesomeModule implements IconFontDescriptor {

    @Override
    public String ttfFileName() {
        return "iconify/android-iconify-fontawesome.ttf";
    }

    @Override
    public Icon[] characters() {
        return FontAwesomeIcons.values();
    }
}
