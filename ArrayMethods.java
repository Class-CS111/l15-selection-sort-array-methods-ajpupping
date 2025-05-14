/********************************************
*	AUTHOR:	Alyssa Pupping
* COLLABORATORS: N/A
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED: 5/13/25
********************************************/

/********************************************
*	ArrayMethods
*********************************************
*	PROGRAM DESCRIPTION:
*	Collection of useful methods for int arrays.
*********************************************
*	ALGORITHM:
*	Loop through the array and print each element to string
* Swap two elements within the array
* Find the minimum element in the array
* Reverse the order of the elements in the array
*********************************************

/* UML CLASS DIAGRAM:
-----------------------------------------
ArrayMethods
-----------------------------------------
-----------------------------------------
+ arrayString(array : int[]) : String //static
+ swap(array : int[], a : int, b : int) : void //static
+ indexOfMin(array : int[], startIndex : int) : int //static
+ reverse(array : int[]) : void //static
+ selectionSort(array : int[]) : void //static
-----------------------------------------
*/

public class ArrayMethods
{
  /**DESCRIPTION: print the array */
  public static String arrayString(int[] a)
  {
    String result = "{ " + a[0];
    // concatenate on each int value
    for(int i = 1; i < a.length; i++) {
      result +=  ", " + a[i];
    }
    result += " }";

    return result;
  }
  
  /**DESCRIPTION: swap two values */
  public static void swap(int[] array, int a, int b)
  {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  
  }
	
	/**DESCRIPTION: find the index of the minimum value */
  public static int indexOfMin(int[] array, int startIndex)
  {
    int minValue = array[startIndex];
    int minIndex = startIndex;

    for(int i = startIndex+1; i < array.length; i++) {
      if(minValue > array[i]) {
        minValue = array[i];
        minIndex = i;
      }
    }
    return minIndex;
  }

	/**DESCRIPTION: reverse the order of the array */
  public static void reverse(int[] array)
  {
    for(int i = 0; i < array.length/2; i++) {
      ArrayMethods.swap(array, i, array.length-1-i);
    }

  }

	/**DESCRIPTION: sorts the array in order from least to greatest*/
  public static void selectionSort(int[] array)
  {
    for(int i = 0; i < array.length-1; i++) {
      int indexMinValue = ArrayMethods.indexOfMin(array, i);
      ArrayMethods.swap(array, i, indexMinValue);
    }

  }

}