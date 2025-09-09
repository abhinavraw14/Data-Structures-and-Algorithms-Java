package ArrayQuestions;

import java.util.Arrays;

public class FindTopTwoScores {
  public static int[] findTopTwoScores(int [] array){
    // Best Score
    // Given an array, write a function to get first, second best scores from the array and return it   in new array.

    //myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
    //firstSecond(myArray) // {90, 87}
    int first = 0; 
    int second = 0;

    int [] secondArray= new int[2];

    for(int i=0; i<array.length; i++){
      if(array[i] > first ){
        first = array[i];
      }
      else if(array[i] > second && second != first){
        second = array[i];
      }
    }

    secondArray[0] = first;
    secondArray[1] = second;

    return secondArray;
  }
  public static void main(String[] args) {

    int []myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};

    int newArray[] = findTopTwoScores(myArray);
    System.out.println(Arrays.toString(newArray));
  }
}
