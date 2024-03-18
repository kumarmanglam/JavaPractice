package org.javaBasic.inputOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyFileReader {
    public static void main(String[] args) throws IOException {
        try{
            Reader reader = new FileReader("./data.txt");
            int  data = reader.read();
            while(data!=-1){
                System.out.println((char)data);
                data = reader.read();
            }
            reader.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
