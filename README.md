# ASCII-Generator
This project allows you to convert an input text to an ascii output. You can directly print the text in the console or get the ASCII text as String. 

# Add to your project
This project is only available as snapshot

### Maven

    <repository>
    <id>snapshots-repo</id>
    <url>https://oss.sonatype.org/content/repositories/snapshots/</url>
    </repository>




    <dependency>
    <groupId>com.github.zflxw</groupId>
    <artifactId>ASCII-Generator</artifactId>
    <version>1.0-SNAPSHOT</version>
    </dependency>

### Gradle

    repositories {
      maven {
        name "Sonatype"
        url "https://oss.sonatype.org/content/repositories/snapshots/"
      }
    }

   dependencies {
      implementation 'com.github.zflxw:ASCII-Generator:1.0-SNAPSHOT'
   }

# Usage
    // this renders "Example" in Medium size and prints it directly in the console
    ASCIIFontGenerator.printTextArt("Example", ASCIIFontGenerator.FONT_SIZE_MEDIUM);
 
The result:

![result](https://cdn.discordapp.com/attachments/722499400953233470/792880337071898655/unknown.png)

# License
Leave a look in the license file or the ASCIIFontGenerator Class for more information about the license
