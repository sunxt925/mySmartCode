package com;

public class Test {
	static int temp=0;
	public static void main(String[] args) {
		for(int i=1;i<=64;i++){
			temp=time(i+1)-time(i);
			System.out.println(i+":"+time(i)+"	»¹Ðè"+temp);
		}

	}
	public static int time(int n){
		int result=0;
		result=n*n+4*n;
		return result;
	}
}
