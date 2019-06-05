package com.biz.lotto;

import java.util.Random;

public class Lotto_04 {

	public static void main(String[] args) {

		/*
		 * 1. 정수형 배열을 45개를 생성하고 
		 * 2. 순서대로 1부터 45까지의 숫자를 각각 대입한다. 
		 * 배열요소에는 중복된 값이 없다. 
		 * 3. 45의 배열을 무작위로 섞을(suffle)것 
		 * 4. 섞인 배열에서 0번부터 5번까지를 추출해서 
		 * 5. 콘솔에 보여주기
		 */

		int[] nums = new int[45];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		//횟수를 정하지 않는 반복문
		//무한반복
		//	for(;;) {}
		// 보통은 ofr문을 이용해서 무한반복을 하지 않는다.
		// 무한 반복
//		boolean a = 1==1;
//		
//		while(a) {//while(true)
//		}
//		
//		while(true) {
//			if(!a) break;	
//		}
		Random rnd = new Random();
		int loop = nums.length *3;
		
		while(loop>0) {
			//임의로 0부터 44까지의 숫자 2개를 생성해서
			//각각 변수에 대입
			int index1 = rnd.nextInt(nums.length);
			int index2 = rnd.nextInt(nums.length);
			
			//두개의 변수에 저장된 값이 다르면
			if(index1 != index2) {
				int _temp = nums[index1];
				nums[index1] = nums[index2];
				nums[index2] = _temp;
				loop--;
				
			}
		}
		for(int i=0; i <6; i++) {
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
	
// 		i 옆에있는 것만 비교한다.	
//		for(int i=0; i<6; i++) {
//			int _temp;
//			if(nums[i]>nums[i+1]) {
//				_temp = nums[i];
//				nums[i] = nums[i+1];
//				nums[i+1] = _temp;
		for (int i = 0; i < 6; i++) {
			for (int j = i + 1; j < 6; j++) {
				if (nums[i] > nums[j]) {
					int _temp = nums[i];
					nums[i] = nums[j];
					nums[j] = _temp;

				}
			}

				System.out.print(nums[i]+"\t");
			}
			//System.out.print(nums[i]+"\t");
		}
		
				
	
}
