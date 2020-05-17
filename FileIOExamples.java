import java.io.IOException;
import java.nio.file.*;

class FileIOExamples {

  public static void main(String[] args) throws IOException {
    String contents = Files.readString(Paths.get("filethatdoesnotexist.txt"));
    System.out.println(contents);
  }
  
}