package com.�������;

import java.util.ArrayList;  
import java.util.List;
import java.util.Scanner;  
public class ZH {  
	static int number;
    public static void main(String args[]){  
    	System.out.println("�������ַ������飬�Կո�ָ���");
    	Scanner sc=new Scanner(System.in);
    	StringBuffer sb=new StringBuffer();
//    	while(sc.hasNext()){
    		sb.append(sc.nextLine());
//    	}
    	String[] ss=sb.toString().split(" "); 
    	System.out.println("��������Ԫ�飺");
    	number=sc.nextInt();	
    	sc.close();
        com(ss);  
    }  
    public static void com(String ss[]){  
        if(ss==null||ss.length==0){  
            return ;  
        }  
        List<String> list=new ArrayList();
//        System.out.println("��������Ԫ�飺");
//        Scanner scanner=new Scanner(System.in);
//        int i=scanner.nextInt();
//        scanner.close();
        if(number>ss.length){
        	System.out.println("����������ִ�������ĳ��ȣ�����");
        	return;
        }
//        for(int i=1;i<=number;i++){  
            c(ss,0,number,list);  
//        }  
    }  
    //���ַ��������е�begin���ַ���ʼ��ѡnumber���ַ�����list��  
    public static void c(String []st,int begin,int number,List<String> list){  
        if(number==0){  
            System.out.println(list.toString());  
            return ;  
        }  
        if(begin==st.length){  
            return;  
        }  
        list.add(st[begin]);  
        c(st,begin+1,number-1,list);  
        list.remove((String)st[begin]);  
        c(st,begin+1,number,list);  
    }  
}  
