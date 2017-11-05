import java.io.*;


public class Laj {

  private static void printLines(String name, InputStream ins) throws Exception {
    String line = null;
    BufferedReader in = new BufferedReader(
        new InputStreamReader(ins));
    while ((line = in.readLine()) != null) {
        System.out.println(name + " " + line);
    }
  }

  private static void runProcess(String command) throws Exception {
    Process pro = Runtime.getRuntime().exec(command);
    //printLines(command + " stdout:", pro.getInputStream());
    if(pro.getInputStream()!=null&&command=="java sam2")
    System.out.println("sahi khel gaya");
    //pro.waitFor();
    //System.out.println(command + " exitValue() " + pro.exitValue());
  }

  public static void main(String[] args) {
    try {
      runProcess("javac sam2.java");
      runProcess("java sam2");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
