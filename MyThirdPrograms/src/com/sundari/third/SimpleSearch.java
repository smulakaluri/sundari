package com.sundari.third;

public class SimpleSearch {
public static void main(String[] args){
       int[] array={11,-10,25,18,45,55,30,87,-28,18};

       System.out.println("The contents of the Array are :");

       for(int i=0;i<array.length;i++)
          System.out.println("Array[" + i + "] = " + array[i]);

       int search_element=55;
       int find_index=-1;

       for(int j=0;j<(array.length-1);j++){
          if(array[j]==search_element){
             find_index=j;
             break;
          }
       }

       if(find_index!=-1){
          System.out.println(" The search element is : " + search_element);
          System.out.println(" It is found in the array at position : " + find_index);
       }

       else
          System.out.println("\n The search element is not found in the array.");
    }
 }
