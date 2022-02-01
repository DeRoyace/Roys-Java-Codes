import java.util.Scanner;
import java.io.*;

public class BinaryTextRead {

    public static void main(String[] args) {

        boolean newFile = true;
        boolean newLine = true;
        String yesOrNo, fileName, binaryText, readWrite,
                line;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nEnter the name of the file you'd like "
                    + "to edit: ");
            fileName = scanner.nextLine();

            System.out.println("Is it a binary or text file (b/t): ");
            binaryText = scanner.nextLine();
            if (binaryText.equalsIgnoreCase("b")) {
                System.out.println("Would you like to read or write "
                        + "to this file? (r/w");
                readWrite = scanner.nextLine();
                if (readWrite.equalsIgnoreCase("r")) {
                    try {
                        ObjectInputStream is = new ObjectInputStream(
                                new FileInputStream(fileName));
                        System.out.println(is.readUTF());
                        is.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                } else if (readWrite.equalsIgnoreCase("w")) {
                    do {
                        try {
                            ObjectOutputStream outputStream = new ObjectOutputStream(
                                    new FileOutputStream(fileName, true));
                            System.out.println("Enter what you would like"
                                    + " to write to the binary file");
                            line = scanner.nextLine();
                            outputStream.writeUTF(line);
                            outputStream.flush();
                            outputStream.close();
                        } catch (IOException e) {
                            System.out.println(e);
                        }
                        System.out.println("Would you like to write "
                                + "another line? (y/n): ");
                        yesOrNo = scanner.nextLine();
                        if (yesOrNo.equalsIgnoreCase("n"))
                            newLine = false;
                    } while (newLine);
                }
            } else if (binaryText.equalsIgnoreCase("t")) {
                System.out.println("Would you like to read or write to "
                        + "this file? (r/w");
                readWrite = scanner.nextLine();
                if (readWrite.equalsIgnoreCase("r")) {
                    try {
                        FileReader fr = new FileReader(fileName);
                        BufferedReader br = new BufferedReader(fr);

                        String text;
                        while ((text = br.readLine()) != null) {
                            System.out.println(text);
                        }
                        br.close();

                    } catch (IOException e) {
                        System.out.println("The file does not exist.");
                        System.exit(0);
                    }

                } else if (readWrite.equalsIgnoreCase("w")) {
                    do {
                        try {
                            PrintWriter writeText;
                            writeText = new PrintWriter(
                                    new FileOutputStream(fileName, true));
                            System.out.println("Please type the line you wish "
                                    + "write: ");
                            writeText.println(scanner.nextLine());
                            writeText.flush();
                            writeText.close();
                        } catch (IOException e) {
                            System.out.println(e);
                            System.exit(0);
                        }

                        System.out.println("Would you like to enter another "
                                + "line? (y/n): ");
                        yesOrNo = scanner.nextLine();
                        if (yesOrNo.equalsIgnoreCase("n"))
                            newLine = false;
                    } while (newLine);
                }

            }

            System.out.println("Would you like to work with another "
                    + "file? (y/n)");
            yesOrNo = scanner.nextLine();
            if (yesOrNo.equalsIgnoreCase("n"))
                newFile = false;
        } while (newFile);
        scanner.close();
    }

}