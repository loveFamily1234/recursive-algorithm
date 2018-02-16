package com.Fibonacci数列;

import java.math.BigInteger;
import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
		System.out.println("请输入数据：");
			int i=sc.nextInt();
			if(i<0) break;
			long nowtime1=System.nanoTime();//获取纳秒时间
			BigInteger s=fibonacci(i);
			long nowtime2=System.nanoTime();//获取纳秒时间
			System.out.println("递归算法运行结果为："+s);
			long cha=nowtime2-nowtime1;
			System.out.println("运行时间ns为:"+cha);
			System.out.println("************************************************************");
			long nowtime3=System.nanoTime();
			BigInteger s2=fibonacci2(i);
			long nowtime4=System.nanoTime();
			System.out.println("非递归算法运行结果为："+s2);
			long cha2=nowtime4-nowtime3;
			System.out.println("运行时间ns为:"+cha2);
			long sjc=cha-cha2;//运行时间差
			System.out.println("递归算法比非递归算法时间上多运行"+sjc+"纳秒！！！");
		}
		sc.close();
	}
	public static BigInteger fibonacci(int n){//递归算法
		if(n<=1) return BigInteger.valueOf(1);
		return fibonacci(n-1).add(fibonacci(n-2));
	}
	public static BigInteger fibonacci2(int n){//非递归算法
		double res=(1/Math.sqrt((double)5))*(Math.pow(((1+Math.sqrt((double)5))/2),(n+1))-(Math.pow((1-Math.sqrt((double)5)/2),(n+1))));
		return BigInteger.valueOf((long)res);
	}
}

