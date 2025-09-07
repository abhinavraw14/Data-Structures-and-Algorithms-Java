import java.util.*;

public class TwoDimensionalArray {

  public int arr[][] = null;
  
  public TwoDimensionalArray(int rows, int cols) {
    this.arr = new int[rows][cols];
    for(int i = 0; i < rows; i++) {
      for(int j = 0; j < cols; j++) {
        arr[i][j] = Integer.MIN_VALUE;
      }
    }
  }

  // Inserting value in the array

  public void insertValueInTheArray(int row, int col, int value){
    try {
      if(arr[row][col] == Integer.MIN_VALUE) {
        arr[row][col] = value;
        System.out.println("Successfully inserted " + value + " at location: " + row + ", " + col);
      } else {
        System.out.println("This cell is already occupied by another value.");
      }
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid index to access array!");
    }
  }

  //Accessing cell value from a given array

  public void accessCell(int row, int col){
    System.out.println("Accessing row" + row + " , Col" + col);
    try{
      System.out.println("cell value is: "+ arr[row][col]);


    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Invalid index for 2d array");
    }
  }

  // Traversing the two dimensional Arrays
  public void traverse2DArray(){
    for(int row=0; row<arr.length; row++){
      for(int col=0; col<arr[0].length; col++){
        System.out.print(arr[row][col] + " ");
      }
      System.out.println();
    }
  }

  // Searching in 2D Array
  public void Searching2DArray(int valueToBeSearched){

    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[0].length; j++){
        if(arr[i][j] == valueToBeSearched){
          System.out.println( " value is at index: "+"("+i+ "," +j+")");
        }
      }
      System.out.println();
    }
  }

  

}
