package com.biz.arr;

import java.util.Random;

public class Array_03 {

	public static void main(String[] args) {

		int[] intKor = new int[100];
		Random rnd = new Random();

		// 향상된 for를 이용해서
		// 배열에 어떤값을 담기하기는 문법오류는 나지 않는다.
		// 그러나 값은 담기지 않는다.
		for (int n : intKor) {
			n = rnd.nextInt(50);
		}
		for (int n : intKor) {
			System.out.println(n);

		}
		// 향상된 for를 사용할 때
		// 배열요소의 값을 변경하고자 할때

		int index = 0;
		for (int n : intKor) {
			intKor[index++] = rnd.nextInt(50);
		}

		
		//향상된  for와 인덱스 변수를 사용하여
		//한줄에 5개씩 배열요소를 구분하여
		// 표시하는 방법
		index = 0;

		for (int n : intKor) {
			System.out.print(n);
			if (++index % 5 == 0) {
				System.out.println();
			} else {
				System.out.print(", ");

			}
		}
	}

}
