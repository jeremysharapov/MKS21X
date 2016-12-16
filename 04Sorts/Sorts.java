import java.util.*;
public class Sorts{
    public static String name(){
	return "09.Sharapov.Jeremy";
    }

    /**Selection sort of an int array.
     *Upon completion, the elements of the array will be in increasing order.
     *@param data the elements to be sorted.
     */

    public static void selectionSort(int[] data){
    }

    public static void insertSort(int[] data){
	int inTransit;
	for (int i = 1; i < data.length; i++){
	    inTransit = data[i];
	    for (int n = i - 1; data[n] < data[i]; n--){
		data[n + 1] = data[n];
		data[n + 1] = inTransit;
	    }
	}
    }

    public static void bubbleSort(int[] data){
	int didSwap = 1;
	while (didSwap != 0){
	    for (int i = 1; i < data.length; i++){
		didSwap = 0;
		if (data[i] < data[i - 1]){
		    int store = data[i - 1];
		    data[i - 1] = data[i];
		    data[i] = store;
		    didSwap = didSwap + 1;
		}
	    }
	}
    }

    
}
