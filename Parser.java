// Example library

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Parser {
  public void Parse(InputStream input, OutputStream output) throws IOException {
    // For now, do nothing but mirror the input.
    int character ;
    while ((character = input.read()) >= 0) {
      output.write(character);
    }
  }
}