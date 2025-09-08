package ArrayQuestions;

import java.util.Arrays;

public class MiddleFunction {
  

  public static void middleOne(int [] array){
    // My code 

    for(int i=0; i<array.length-2; i++){
      System.out.print(array[i+1]+" ");
    }
    
  }

  // Correction
  public static int[] middle(int[] array){
    // if an array has less than 3 elements, middle is empty
    if(array.length <= 2){
      return new int[0]; //this will print an empty array
    }

    // create a new array of size (length -2)
    int [] result = new int[array.length - 2];

    // copy elements from index 1 to length -2
    for(int i=1; i<array.length-1; i++){
      result[i-1] = array[i];

    }
    return result;
    //"int[]" means the function will return an array of integers.


  }
  public static void main(String[] args) {
    int []array = {1, 2, 3, 4, 5, 6};
    int[] midArray = middle(array);

    System.out.println(Arrays.toString(midArray));
  }

}

