package com.biz.lotto;

import java.util.Random;

public class Lotto_02 {

	public static void main(String[] args) {

		// 6개의 정수형 배열을 생성하고
		// 정수개열 갯수만큼 반복을 하면서
		// 1. 임의 정수 1부터 45까지 중 한개를 생성하고
		// 2. 생성한 수가 배열에 이미 담겨있는지 검사
		// 3. 그렇지 않으면 배열에 임의 정수를 담기
		int[] intNum = new int[6];
		Random rnd = new Random();

		for(int re=0; re<5;re++) {
			System.out.println();
		for (int i = 0; i < intNum.length; i++) {
			int intR = rnd.nextInt(45) + 1;
			int index;

			for (index = 0; index < intNum.length; index++) {
				if (intNum[index] == intR) {
					break;
				}
			}

			if (index >= intNum.length) {
				intNum[i] = intR;
			} else {
				i = i - 1;
			}

		}
		for (int i = 0; i < intNum.length; i++) {

			System.out.print(intNum[i] + "\t");

		}

	}
	}
}