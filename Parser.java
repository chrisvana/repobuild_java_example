// Example library

import com.google.protobuf.TextFormat;
import com.google.protobuf.TextFormat.ParseException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

public class Parser {
  public void Parse(InputStream input, OutputStream output) throws IOException {
    MyProto.FooProto.Builder builder = MyProto.FooProto.newBuilder();
    PrintStream stream = new PrintStream(output);
    try {
      TextFormat.merge(new InputStreamReader(input, "ASCII"), builder);
      stream.println("Success!");
    } catch (ParseException e) {
      stream.println("Failed to Parse ASCII input: " + e);
    }
  }
}