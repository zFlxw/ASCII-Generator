package com.github.zflxw.asciigenerator.api;

/**
 * This code is licensed under - CC Attribution CC BY 4.0.
 * @author www.quickprogrammingtips.com
 *
 * modified by: zFlxw
 */
public enum ASCIIArtFont {
    FONT_DIALOG("Dialog"),
    FONT_DIALOG_INPUT("DialogInput"),
    FONT_MONOSPACED("Monospaced"),
    FONT_SERIF("Serif"),
    FONT_SANS_SERIF("SansSerif");

    private final String VALUE;

    ASCIIArtFont(String value) {
        this.VALUE = value;
    }

    public String getValue() { return this.VALUE; }
}
