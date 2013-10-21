// Simple printer main.

import java.io.IOException;

public class Checker {
  public static void main(String[] args) {
    try {
      Parser parser = new Parser();
      parser.Parse(System.in, System.out);
    } catch (IOException io) {
      io.printStackTrace();
    }
  }
}
