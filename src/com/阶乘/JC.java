package com.�׳�;

import java.math.BigInteger;
import java.util.*;

public class JC {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		while(true){
		System.out.println("���������ݣ�");
			int i=sc.nextInt();
			if(i<0) break;
//			long nowtime1=System.currentTimeMillis();//��ȡ����ʱ��
			long nowtime1=System.nanoTime();//��ȡ����ʱ��
			BigInteger s=factorial(i);
//			long nowtime2=System.currentTimeMillis();//��ȡ����ʱ��
			long nowtime2=System.nanoTime();//��ȡ����ʱ��
			System.out.println("�ݹ��㷨���н��Ϊ��"+s);
			long cha=nowtime2-nowtime1;
			System.out.println("����ʱ��nsΪ:"+cha);
			System.out.println("************************************************************");
			long nowtime3=System.nanoTime();
			BigInteger s2=factorial2(i);
			long nowtime4=System.nanoTime();
			System.out.println("�ǵݹ��㷨���н��Ϊ��"+s2);
			long cha2=nowtime4-nowtime3;
			System.out.println("����ʱ��nsΪ:"+cha2);
			long sjc=cha-cha2;//����ʱ���
			System.out.println("�ݹ��㷨�ȷǵݹ��㷨ʱ���϶�����"+sjc+"���룡����");
		}
		sc.close();
	}
	public static BigInteger factorial(int n){//�ݹ��㷨
		if(n==0) return BigInteger.valueOf(1);
		return BigInteger.valueOf(n).multiply(factorial(n-1));
	}
	public static BigInteger factorial2(int n){//�ǵݹ��㷨
		if(n==0) 
			return BigInteger.valueOf(1);
		else{
			BigInteger result=BigInteger.valueOf(1);
			for(int i=1;i<=n;i++){
				result=result.multiply(BigInteger.valueOf(i));
			}
			return result;
		}
	}
}
