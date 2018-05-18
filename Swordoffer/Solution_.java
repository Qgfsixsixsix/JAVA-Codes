import java.util.Scanner;

public class Solution_ {
	public static int Sum_Solution(int n) {
		int sum = n;
		boolean flag = (sum > 0) && ((sum += Sum_Solution(--n)) > 0);
		return sum;
    }
	public static void main(String[] agrs){
		while (true){
				Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
				int b = Sum_Solution(a);
				System.out.println(b);
		}
	}
}
