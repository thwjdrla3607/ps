import java.util.Scanner;

class boj_1152 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String st = sc.nextLine();
    st = st.trim();
    int sum = 0;

    for(int i = 0; i < st.length(); i++) {
      if(st.charAt(i) == ' ') {
        sum++;
      }
    }

    if(st.isEmpty()) {
      System.out.println("0");
    } else System.out.println(sum+1);
  }
}