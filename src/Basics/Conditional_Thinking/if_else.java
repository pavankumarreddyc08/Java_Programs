package Basics.Conditional_Thinking;

import java.sql.SQLOutput;
import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        int sum1=a+b;
//        int sum2=a+c;
//        System.out.println(sum1);
//        System.out.println(sum2);

        System.out.println("Enter age: ");
        int age= sc.nextInt();
        if(age>=18){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
            
        }
    }

}
