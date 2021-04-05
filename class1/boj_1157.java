import java.util.Scanner;
public class Main {

	public static void boj_1157(String[] args) {
		Scanner s = new Scanner(System.in);
		String word = s.next().toUpperCase();
		int alpha[] = new int[26];
		int max = 0; char e = ' '; 
		
		for(int i = 0; i < word.length(); i ++) {
			alpha[word.charAt(i) - 65]++;
		}
		
		for(int i = 0; i < alpha.length; i ++) {
			if(max < alpha[i]) {
				e = (char) (65+i);
				max = alpha[i];
			}
			else if(max == alpha[i]) 
				e = '?';
		}
		
		System.out.println(e);
	}
}
