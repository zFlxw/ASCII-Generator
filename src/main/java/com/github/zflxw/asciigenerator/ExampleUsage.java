package com.github.zflxw.asciigenerator;

import com.github.zflxw.asciigenerator.api.ASCIIArtFont;
import com.github.zflxw.asciigenerator.api.ASCIIFontGenerator;

public class ExampleUsage {
    public static void main(String[] args) {
        /*
         * Argument 1: The text to print (in this case "Example")
         * Argument 2: The font size (in this case medium)
         */
        ASCIIFontGenerator.printTextArt("Example", ASCIIFontGenerator.FONT_SIZE_MEDIUM);

        /*
         * Argument 1: The text to print (in this case "Example")
         * Argument 2: The font size (in this case medium)
         * Argument 3: The font type (in this case "Monospaced")
         * Argument 4: The symbol to print the text in (in this case "@", default: "*")
         */
        ASCIIFontGenerator.printTextArt("Example", ASCIIFontGenerator.FONT_SIZE_MEDIUM, ASCIIArtFont.FONT_MONOSPACED, "@");
    }
}
