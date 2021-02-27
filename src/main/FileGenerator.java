package main;

import java.io.*;
import java.util.Random;

public class FileGenerator {
    private long numberOfLines;
    private int lineLength;

    public static void main(String[] args) {
        FileGenerator generator = new FileGenerator();
        generator.getParams();
        generator.generateFile();

    }

    private void getParams() {

        try {
            //Getting parameters from console
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Number of lines: ");
            numberOfLines = Integer.parseInt(reader.readLine());
            System.out.print("Line length: ");
            lineLength = Integer.parseInt(reader.readLine());
            reader.close();
        }
        catch (IOException e) {

        }

    }


    private void generateFile () {

        try {

            //write random chars into "input.txt" file
            BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"));
            for (int i = 0; i < numberOfLines; i++) {
                for (int j = 0; j < lineLength; j++) {
                    Random random = new Random();
                    writer.write('a' + random.nextInt(26));
                }
                writer.newLine();
            }
            writer.close();
        }

        catch (IOException e){

        }
    }
}
