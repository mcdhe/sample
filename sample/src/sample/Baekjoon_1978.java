package sample;

import java.util.Scanner;

public class Baekjoon_1978 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int cnt = in.nextInt();
		int num;
		int prime_cnt = 0;
		for(int i = 0; i < cnt; i++)
		{
			num = in.nextInt();
			if (is_Prime(num) == true)
				prime_cnt++;
		}
		
		System.out.println(prime_cnt);
	}
	
	// 소수인지 판별하는 메소드
	static boolean is_Prime(int number) {
		
		// 1은 소수가 아님
		if(number == 1)
			return false;
		
		// 약수가 있는지 판별
		for(int i = 2; i < number; i++)
		{
			if(number % i == 0)
				return false;
		}
		
		return true;
	}
}

