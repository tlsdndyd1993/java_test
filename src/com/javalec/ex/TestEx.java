package com.javalec.ex;

public class TestEx {
	
	public static void main(String[] args) {
		short test = -129;
		System.out.println(test);
		
		double d = 3.14D;
		System.out.println(d);
		
//		<묵시적 형변환 작은 곳-> 큰 곳>
		int i1 = 10;
		double d1 = i1;
		System.out.println("d1 데이터는 "+d1+"입니다.");
		
//		<명시적 형변환 큰 곳 -> 작은 곳 => 데이터 손실. 코드에 명시해줘야함>
		double d2 = 1029384729568234792.0D;
		System.out.println("d2는 "+d2+"입니다.");
//		int i2 = d2;
		int i2 = (int)d2;
		
		System.out.println("i2 데이터는 "+i2 + "입니다.");
				
		
	}
}
