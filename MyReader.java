package lab;

import java.io.*;

class MyReader extends FileReader {
    File file;
    char[] content = new char[1000];

    MyReader(File file) throws Exception {
        super(file);
        this.file = file;
    }

    MyReader(String filename) throws Exception {
        super(filename);
        file = new File(filename);
    }

    public String readContent() throws Exception {
        StringBuilder stringBuilder = new StringBuilder(); // To store the content read from the file
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n"); // Append each line to the StringBuilder
            }
        }
        return stringBuilder.toString(); // Return the content as a string
    }

    public static void main(String[] args) throws Exception {
        MyReader reader = new MyReader("Welcome1.txt");
        System.out.println(reader.readContent());

        File file = new File("Welcome1.txt");
        MyReader reader2 = new MyReader(file);
        System.out.println(reader2.readContent());
    }
}

