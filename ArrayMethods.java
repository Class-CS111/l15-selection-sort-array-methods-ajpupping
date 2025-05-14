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
*	TODO: <Pseudocode for selection sort here>
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
  /**DESCRIPTION: */
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
  
  /**DESCRIPTION: */
  public static void swap(int[] array, int a, int b)
  {
  
  }
	
	/**DESCRIPTION: */
  public static int indexOfMin(int[] array, int startIndex)
  {
    return 0; //STUB to keep compiler happy
  }

	/**DESCRIPTION: */
  public static void reverse(int[] array)
  {

  }

	/**DESCRIPTION: */
  public static void selectionSort(int[] array)
  {

  }

}