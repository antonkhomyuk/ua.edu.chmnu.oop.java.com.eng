package ua.edu.chmnu.fks.oop.Lab9;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        File file =new File(System.getProperty("user.dir"),"text.txt");
        FileOperation fileOperation=new FileOperation();
        fileOperation.copyFile(file);
    }

}

