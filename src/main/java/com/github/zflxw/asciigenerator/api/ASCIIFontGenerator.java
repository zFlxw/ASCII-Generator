package com.github.zflxw.asciigenerator.api;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * This code is licensed under - CC Attribution CC BY 4.0.
 * @author www.quickprogrammingtips.com
 *
 * modified by: zFlxw
 */
public class ASCIIFontGenerator {
    public static final int FONT_SIZE_SMALL = 12;
    public static final int FONT_SIZE_MEDIUM = 18;
    public static final int FONT_SIZE_LARGE = 24;
    public static final int FONT_SIZE_HUGE = 32;

    public static final String DEFAULT_ART_SYMBOL = "*";

    /**
     * Returns the given input as ascii art font. For size, you can use predefined sizes or a custom size.
     * Usage - getAsciiText("Hi", 30, ASCIIArtFont.ART_FONT_SERIF, "@");
     * @param inputText
     * @param textHeight - Use a predefined size or a custom type
     * @param asciiArtFont - Use one of the available fonts
     * @param symbol - Specify the character for printing the ascii art
     * @throws Exception
     */
    public static String getAsciiText(String inputText, int textHeight, ASCIIArtFont asciiArtFont, String symbol) {
        String fontName = asciiArtFont.getValue();
        int imageWidth = findImageWidth(textHeight, inputText, fontName);

        BufferedImage bufferedImage = new BufferedImage(imageWidth, textHeight, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = bufferedImage.getGraphics();
        Font font = new Font(fontName, Font.BOLD, textHeight);
        graphics.setFont(font);

        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.drawString(inputText, 0, getBaselinePosition(graphics, font));

        StringBuilder stringBuilder = new StringBuilder();

        for (int y = 0; y < textHeight; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < imageWidth; x++) {
                sb.append(bufferedImage.getRGB(x, y) == Color.WHITE.getRGB() ? symbol : " ");
            }
            if (sb.toString().trim().isEmpty()) {
                continue;
            }
            stringBuilder.append(sb).append("\n");
        }
        return stringBuilder.toString();
    }

    /**
     * Prints ASCII art for the specified text. For size, you can use predefined sizes or a custom size.
     * Usage - printTextArt("Hi",30,ASCIIArtFont.ART_FONT_SERIF,"@");
     * @param inputText
     * @param textHeight - Use a predefined size or a custom type
     * @param asciiArtFont - Use one of the available fonts
     * @param symbol - Specify the character for printing the ascii art
     * @throws Exception
     */
    public static void printTextArt(String inputText, int textHeight, ASCIIArtFont asciiArtFont, String symbol) {
        System.out.println(getAsciiText(inputText, textHeight, asciiArtFont, symbol));
    }

    /**
     * Convenience method for printing ascii text art.
     * Font default - Dialog,  Art symbol default - *
     * @param inputText
     * @param textHeight
     */
    public static void printTextArt(String inputText, int textHeight) {
        System.out.println(getAsciiText(inputText, textHeight, ASCIIArtFont.FONT_DIALOG, DEFAULT_ART_SYMBOL));
    }

    /**
     * Using the current font and current art text find the width of the full image
     * @param textHeight
     * @param inputText
     * @param fontName
     * @return
     */
    private static int findImageWidth(int textHeight, String inputText, String fontName) {
        BufferedImage bufferedImage = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = bufferedImage.getGraphics();
        graphics.setFont(new Font(fontName, Font.BOLD, textHeight));
        return graphics.getFontMetrics().stringWidth(inputText);
    }

    /**
     * Find where the text baseline should be drawn so that the characters are within image
     * @param graphics
     * @param font
     * @return
     */
    private static int getBaselinePosition(Graphics graphics, Font font) {
        FontMetrics metrics = graphics.getFontMetrics(font);

        return metrics.getAscent() - metrics.getDescent();
    }
}
