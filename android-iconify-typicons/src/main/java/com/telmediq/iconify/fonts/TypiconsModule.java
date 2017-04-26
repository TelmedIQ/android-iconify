package com.telmediq.iconify.fonts;

import com.telmediq.iconify.Icon;
import com.telmediq.iconify.IconFontDescriptor;

public class TypiconsModule implements IconFontDescriptor {

    @Override
    public String ttfFileName() {
        return "iconify/android-iconify-typicons.ttf";
    }

    @Override
    public Icon[] characters() {
        return TypiconsIcons.values();
    }
}
