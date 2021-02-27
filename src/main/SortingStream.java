package main;

import java.io.*;

public class SortingStream {


    public static void main(String[] args) {
        try {
            new SortingStream().run("filePath.txt");
        }
        catch(FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }


    //main method for program logic
    private void run (String fileName) throws IOException {

        String line;
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        while ((line = reader.readLine()) != null) {
            char[] symbols = line.toCharArray();
            bubbleSort(symbols);
            writer.write(symbols);
            writer.newLine();
        }
        reader.close();
        writer.close();

    }

    //sort method
    private void bubbleSort(char[] symbols) {
        int n = symbols.length;
        char temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (symbols[j - 1] > symbols[j]) {
                    temp = symbols[j - 1];
                    symbols[j - 1] = symbols[j];
                    symbols[j] = temp;
                }
            }
        }
    }


}
