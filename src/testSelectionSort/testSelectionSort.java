package testSelectionSort;

import SelectionSort.SelectionSort;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	
	@Test
	public void test() {
		testPositive();
		testNegative();
		//testMixed();
		//testDuplicates();
	}

	public testSelectionSort() {
	}
	
	public void testPositive(){
		//Given
		SelectionSort selectionSort = new SelectionSort();
		int[] testData = new int[5];
		testData[0] = 8;
		testData[1] = 9;
		testData[2] = 7;
		testData[3] = 10;
		testData[4] = 2;
		int[] SortedTestData = new int[5];
		SortedTestData[0] = 2;
		SortedTestData[1] = 7;
		SortedTestData[2] = 8;
		SortedTestData[3] = 9;
		SortedTestData[4] = 10;
		
        //When
        selectionSort.basicSelectionSort(testData);
            
        //Then
    	System.out.println(selectionSort.basicSelectionSort(testData));
        assertEquals(selectionSort.basicSelectionSort(testData), SortedTestData);
	}

	public void testNegative(){
		//Given
		SelectionSort selectionSort = new SelectionSort();
		int[] testData = new int[5];
		testData[0] = -8;
		testData[1] = -9;
		testData[2] = -7;
		testData[3] = -10;
		testData[4] = -2;
		int[] SortedTestData = new int[5];
		SortedTestData[0] = -10;
		SortedTestData[1] = -9;
		SortedTestData[2] = -8;
		SortedTestData[3] = -7;
		SortedTestData[4] = -2;

        //When
        selectionSort.basicSelectionSort(testData);
            
        //Then
    	System.out.println(selectionSort.basicSelectionSort(testData));
        assertEquals(selectionSort.basicSelectionSort(testData), SortedTestData);
	}
	
	public void testMixed(){
		//Given
		SelectionSort selectionSort = new SelectionSort();
		int[] testData = new int[5];
		testData[0] = -8;
		testData[1] = 9;
		testData[2] = 7;
		testData[3] = -10;
		testData[4] = 0;
		int[] SortedTestData = new int[5];
		SortedTestData[0] = -10;
		SortedTestData[1] = -8;
		SortedTestData[2] = 0;
		SortedTestData[3] = 7;
		SortedTestData[4] = 9;
		
        //When
        selectionSort.basicSelectionSort(testData);
            
        //Then
    	System.out.println(selectionSort.basicSelectionSort(testData));
        assertEquals(selectionSort.basicSelectionSort(testData), SortedTestData);
	}
	
	public void testDuplicates(){
		//Given
		SelectionSort selectionSort = new SelectionSort();
		int[] testData = new int[5];
		testData[0] = -8;
		testData[1] = -8;
		testData[2] = 9;
		testData[3] = 9;
		testData[4] = 0;
		int[] SortedTestData = new int[5];
		SortedTestData[0] = -8;
		SortedTestData[1] = -8;
		SortedTestData[2] = 0;
		SortedTestData[3] = 9;
		SortedTestData[4] = 9;
		
        //When
        selectionSort.basicSelectionSort(testData);
            
        //Then
    	System.out.println(selectionSort.basicSelectionSort(testData));
        assertEquals(selectionSort.basicSelectionSort(testData), SortedTestData);
	}
	

}

