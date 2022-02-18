package com.image.downlaod;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
 
public class DownloadImageFromURL {

    public static void main(String[] args) throws IOException {

	String abc="new hello";
	String abc1= new String(abc);
	String abc2="new hello";
	System.out.println(abc.equals(abc1)+"iiii"+abc1.equals(abc2));
	
	try {
	    System.out.println(1/0);
	}
	catch (ArithmeticException ex) {
	    
	}
    }
    
    
    
}
