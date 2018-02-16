package com.组合问题;

import java.util.ArrayList;  
import java.util.List;
import java.util.Scanner;  
public class ZH {  
	static int number;
    public static void main(String args[]){  
    	System.out.println("请输入字符串数组，以空格分隔：");
    	Scanner sc=new Scanner(System.in);
    	StringBuffer sb=new StringBuffer();
//    	while(sc.hasNext()){
    		sb.append(sc.nextLine());
//    	}
    	String[] ss=sb.toString().split(" "); 
    	System.out.println("请输入求几元组：");
    	number=sc.nextInt();	
    	sc.close();
        com(ss);  
    }  
    public static void com(String ss[]){  
        if(ss==null||ss.length==0){  
            return ;  
        }  
        List<String> list=new ArrayList();
//        System.out.println("请输入求几元组：");
//        Scanner scanner=new Scanner(System.in);
//        int i=scanner.nextInt();
//        scanner.close();
        if(number>ss.length){
        	System.out.println("您输入的数字大于数组的长度！！！");
        	return;
        }
//        for(int i=1;i<=number;i++){  
            c(ss,0,number,list);  
//        }  
    }  
    //从字符串数组中第begin个字符开始挑选number个字符加入list中  
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
