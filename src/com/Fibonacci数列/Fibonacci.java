package com.Fibonacci����;

import java.math.BigInteger;
import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
		System.out.println("���������ݣ�");
			int i=sc.nextInt();
			if(i<0) break;
			long nowtime1=System.nanoTime();//��ȡ����ʱ��
			BigInteger s=fibonacci(i);
			long nowtime2=System.nanoTime();//��ȡ����ʱ��
			System.out.println("�ݹ��㷨���н��Ϊ��"+s);
			long cha=nowtime2-nowtime1;
			System.out.println("����ʱ��nsΪ:"+cha);
			System.out.println("************************************************************");
			long nowtime3=System.nanoTime();
			BigInteger s2=fibonacci2(i);
			long nowtime4=System.nanoTime();
			System.out.println("�ǵݹ��㷨���н��Ϊ��"+s2);
			long cha2=nowtime4-nowtime3;
			System.out.println("����ʱ��nsΪ:"+cha2);
			long sjc=cha-cha2;//����ʱ���
			System.out.println("�ݹ��㷨�ȷǵݹ��㷨ʱ���϶�����"+sjc+"���룡����");
		}
		sc.close();
	}
	public static BigInteger fibonacci(int n){//�ݹ��㷨
		if(n<=1) return BigInteger.valueOf(1);
		return fibonacci(n-1).add(fibonacci(n-2));
	}
	public static BigInteger fibonacci2(int n){//�ǵݹ��㷨
		double res=(1/Math.sqrt((double)5))*(Math.pow(((1+Math.sqrt((double)5))/2),(n+1))-(Math.pow((1-Math.sqrt((double)5)/2),(n+1))));
		return BigInteger.valueOf((long)res);
	}
}

