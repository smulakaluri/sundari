package com.sundari.third;
import java.util.Arrays;

/**
 * This is a class that will sort a given array of integers.
 * It will use <class>Array</class> in the Java Util package.
 * @author Sundari
 *
 */
public class ArraySortSearch {
	/**
	 * This is the main method in the search and sort program that will
	 * do the sorting and searching.
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
	      int sortStr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
	      Arrays.sort(sortStr);

	     for (int i = 0; i < sortStr.length; i++) {
	         if(i != 0){
	            System.out.print(", ");
	         }
	         System.out.print(sortStr[i]);                     
	      }
	     
	     System.out.println();
	     
	     /*
	      int index = Arrays.binarySearch(sortStr, 2);
	      System.out.println("Found 2 @ " + index);
	      
	      sortStr = insertElement(sortStr, 1, index);
	      */
	   }

	}

