package com.������������;

import java.util.Scanner;

public class ZSHF {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�����뱻���ֵ�������n��");
		int n=sc.nextInt();
		System.out.println("�����뻮���е�������m��");
		int m=sc.nextInt();
		sc.close();
		int sum=q(n,m);
		System.out.println("����"+sum+"�����������֣�����");
		StringBuffer sb = new StringBuffer();
	    d(n,1,n,sb);
//	    System.out.println(n);
	}
	public static int q(int n,int m){
		if((n<1)||(m<1)) return 0;
		if((n==1)||(m==1)) return 1;
		if(n<m) return q(n,n);
		if(n==m) return q(n,m-1)+1;
		return q(n,m-1)+q(n-m,m);
	}
	 public static void d(int data,int j, int n,StringBuffer rs){
	    StringBuffer sb = new StringBuffer(rs);
	    for( int i = j; i<=n; i++){
	         if(i==n){
		          rs.append(i);
		          System.out.println(rs.toString());
		          rs = new StringBuffer(sb);
	         }
	         else if(i!=data){
		          rs.append(i);
		          rs.append("+");
		          d(data,i,n-i,rs);
		          rs = new StringBuffer(sb); 
	         } 
	    }
	}
}



//import java.util.Scanner;
//
//public class ZSHF{
// 
// public static void huafenD(int oldData,int j, int n,StringBuffer result){
//    StringBuffer r = new StringBuffer(result);
//    for( int i = j;i<=n;i++){
//         if(i==n&&i!=oldData) {
//          result.append(i);
//          System.out.println(result.toString());
//          result = new StringBuffer(r);
//         }
//         else if(i!=oldData){
//          result.append(i);
//          result.append("+");
//          huafenD(oldData,i,n-i,result);
//          result = new StringBuffer(r);
//         
//         }
//      
//    }
//
//}
// public static void main(String args[]) {
//  Scanner in = new Scanner(System.in);
//  System.out.println("������һ��������1-10��");
//  int data = in.nextInt();
//  while(data<1){
//   System.out.println("�������� ������Ҫ������������");
//   data = in.nextInt();
//  }
//  
//  if(data==1)System.out.println("���軮��");
//  else {
//   StringBuffer sb = new StringBuffer();
//   huafenD(data,1,data,sb);
//  }
// }
//}
