import java.util.scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("What is your number? ");
    String num = s.nextLine();
    char ch;
    String newNum = "";
    for (int i = 0; i < num.length(); i++) {
      ch = num.charAt(i);
      newNum = ch + newNum;
    }
    System.out.println(newNum);
  }
