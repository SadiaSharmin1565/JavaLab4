package com.mycompany.arrayproblem;
import java.util.Scanner;
public class ArrayProblem{
 
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int arr[]=new int[100];
        int i,sum=0,arrnum;
        double average;
        System.out.println("Enter The Number Of Values :");
        arrnum=sc.nextInt();
    
        System.out.println("Enter The Values :");
        for(i=0;i<arrnum;i++){
             arr[i]=sc.nextInt();
        }
        
        System.out.print("The Array : ");
        for(i=0;i<arrnum;i++){
            System.out.print(arr[i]+" ");
            sum=sum+arr[i];
        }
        System.out.println("");
       average=sum/arrnum;
        System.out.println("Average :"+average);
    }
}

