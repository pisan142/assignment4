
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {

  /**
   * Provided as an example, should not need it.
   */
  public static void printAlphabet() {
    for (char curr = 'a'; curr <= 'z'; curr++) {
      System.out.printf("%c ", curr);
    }
  }
  
  /**
   * This method returns the number of times c appears in the message.
   * For example, if message = "abcbcbc", and c = 'b', then the method should return 3
   * If no c character appears in the message, return 0
   * NOTE: this method is required for testing, you must not delete it
   */
  public static int countChar(String message, char c) {
    //TODO
    return 0;
  }

  /**
   * This method checks how many times each letter appears in the given message and prints it.
   * For example, if message = "abcbcbc", then the method should print out (output doesn't include "* "):
   * a: 1
   * b: 3
   * c: 3
   * NOTE: this method is required for testing, you must not delete it
   */
  public static void analyzeLine(String message) {
    //TODO
  }

  // This method gets inputs from the user, calls analyzeLine.
  /**
   * This methods get inputs from user and calls analyzeLine()
   * It keeps asking for inputs until user enter "stop"
   * When user enters "stop", the method will end with "All done!"
   */
  public static void textAnalysis() {
    //TODO
    System.out.print("Enter a line (use stop to end): ");
    //TODO
    System.out.println("All done!");
  }
  
  /**
   * You can edit the main() method as you wish.
   */
  public static void main(String[] args) {
    textAnalysis();
  }
}
