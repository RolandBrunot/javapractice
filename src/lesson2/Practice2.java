package lesson2;

import java.util.*;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.println("请输入一个不大于10的数字:");
		int a1 = a.nextInt();
		a.close();
		int count = 0;
		int j = 0;
		if (a1 > 9)
			System.out.println("很抱歉，您输入的数字过大");
		else {
			for (int i = 1; i < 2 * a1; i++) {
				count = 0;
				char q[] = new char[30];
				if (i > a1) {
					for (j = 2 * a1 - i; j > 0; j--) {
						q[a1 - 1 + count] = (char) (2 * a1 - i - count + '0');
						q[a1 - 1 - count] = (char) (2 * a1 - i - count + '0');
						count++;
					}
					System.out.println(q);
				} else {
					for (j = 0; j < i; j++) {
						q[a1 - 1 + count] = (char) (i - count + '0');
						q[a1 - 1 - count] = (char) (i - count + '0');
						count++;
					}
					System.out.println(q);
				}
			}
		}
	}
}
