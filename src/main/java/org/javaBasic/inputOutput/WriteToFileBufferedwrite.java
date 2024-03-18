package org.javaBasic.inputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileBufferedwrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("./data.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Written from BufferedWrite");
        bw.close();
    }
}
