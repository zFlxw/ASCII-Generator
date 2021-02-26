# ASCII Generator

This project allows you to convert an input text to an ascii output. You can directly print the text in the console or get the ASCII text as String. 

# Add to your project
### Maven

 #### Add jitpack as repository

    <repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
    </repository>

#### Add the dependency

    <dependency>
	    <groupId>com.github.zflxw</groupId>
	    <artifactId>ASCII-Generator</artifactId>
	    <version>1.0.0</version>
    </dependency>

### Gradle
#### Add jitpack as repository
    repositories {
        maven { url 'https://jitpack.io'}
    }
#### Add the dependency
    dependencies {
       implementation 'com.github.zflxw:ASCII-Generator:1.0.0'
    }

# How does it work?
Here is a quick example snippet, how to work with this Library

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

