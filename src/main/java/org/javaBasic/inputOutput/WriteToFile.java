package org.javaBasic.inputOutput;

import java.io.FileWriter;

public class WriteToFile {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("./data.txt");
            fw.write("Hello World Test");
            fw.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
