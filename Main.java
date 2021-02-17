import java.io.*;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws Exception {
    Scanner fileNameInput = new Scanner(System.in);
    System.out.println("Enter the name of the file you want to output to.");
    String fileName = fileNameInput.nextLine();
     /** if (fileLines != Integer) {
        throw new IllegalArgumentException("Please enter an integer.");
      } else {
        break;
      }
      */
      Scanner stringScanner=new Scanner(System.in);
    PrintWriter fileOutput = new PrintWriter(fileName);
    for (int lineNo = 0; lineNo < 999999999; lineNo++) {
      System.out.print("enter a line to input or press CTRL-C to quit: ");
      String userInput = stringScanner.nextLine();
      if (userInput=="quit"){
        break;
      }
      fileOutput.println(userInput);
    }      
    

    fileOutput.close();

  }

}