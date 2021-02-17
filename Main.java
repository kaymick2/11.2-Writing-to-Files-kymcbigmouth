import java.io.*;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws Exception {
    Scanner fileNameInput = new Scanner(System.in);
    System.out.println("Enter the name of the file you want to output to.");
    String fileName = fileNameInput.nextLine();
    int fileLines=0;
    do {
      System.out.println("enter the amount of lines you want to input");
      fileLines = fileNameInput.nextInt();
      if (fileLines != Integer) {
        throw new IllegalArgumentException("Please enter an integer.");
      } else {
        break;
      }
    } while (!fileNameInput.hasNextInt());

    PrintWriter fileOutput = new PrintWriter(fileName);
    for (int lineNo = 0; lineNo < fileLines; lineNo++) {
      System.out.println("enter a line to input");
      String userInput = fileNameInput.nextLine();
      fileOutput.println(userInput);
    }

  }

}