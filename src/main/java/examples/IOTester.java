package examples;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class IOTester {
    public static void main(String[] args) {
        try {
            //Using FileUtils
            usingFileUtils();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            //Using BufferedReader
            readUsingIOUtils();

            //Using IOUtils
            readUsingIOUtils();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void usingFileUtils() throws IOException {
        //get the file object
        File file = FileUtils.getFile("input.txt");

        //get the temp directory
        File tmpDir = FileUtils.getTempDirectory();

        System.out.println(tmpDir.getName());

        //copy file to temp directory
        FileUtils.copyFileToDirectory(file, tmpDir);

        //create a new file
        File newTempFile = FileUtils.getFile(tmpDir, file.getName());

        //get the content
        String data = FileUtils.readFileToString(newTempFile, Charset.defaultCharset());

        //print the content
        System.out.println(data);
    }
    public static void readUsingIOUtils() throws IOException {
        try(InputStream in = new FileInputStream("input.txt")) {
            System.out.println( IOUtils.toString( in , "UTF-8") );
        }
    }
}