package com.整数划分问题;

import java.util.Scanner;

public class ZSHF {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入被划分的正整数n：");
		int n=sc.nextInt();
		System.out.println("请输入划分中的最大加数m：");
		int m=sc.nextInt();
		sc.close();
		int sum=q(n,m);
		System.out.println("共有"+sum+"种正整数划分！！！");
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
//  System.out.println("请输入一个整数（1-10）");
//  int data = in.nextInt();
//  while(data<1){
//   System.out.println("您的输入 不符合要求，请重新输入");
//   data = in.nextInt();
//  }
//  
//  if(data==1)System.out.println("无需划分");
//  else {
//   StringBuffer sb = new StringBuffer();
//   huafenD(data,1,data,sb);
//  }
// }
//}
