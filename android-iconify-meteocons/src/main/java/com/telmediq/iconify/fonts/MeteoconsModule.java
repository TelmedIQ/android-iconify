package com.telmediq.iconify.fonts;

import com.telmediq.iconify.Icon;
import com.telmediq.iconify.IconFontDescriptor;

public class MeteoconsModule implements IconFontDescriptor {

    @Override
    public String ttfFileName() {
        return "iconify/android-iconify-meteocons.ttf";
    }

    @Override
    public Icon[] characters() {
        return MeteoconsIcons.values();
    }
}
