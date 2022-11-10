package star;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

//		System.out.println(N);
													
		for (int i = 0; i < N; i++) {				//i를 0으로 초기화 , i를 n까지 1씩 증가하겠다. (행)
			for (int j = 0; j <= i; j++) {			// J를 0으로 초기화 , j를 i까지 1씩 증가하겠다. (열)
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
