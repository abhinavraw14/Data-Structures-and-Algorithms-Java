package ArrayQuestions;

public class SumDiagonalElements {
  public static int sumDiagonalElements(int [][] array){
    // given a 2d array calculate the sum of diagonal elements.

    // 0,0  0,1  0,2
    // 1,0  1,1  1,2
    // 2,0  2,1  2,2
    // myArray2D= {{1,2,3},
    //             {4,5,6},
    //             {7,8,9}};

    int sum = 0;
    for(int i=0; i < array.length; i++){
      for(int j=0; j < array[0].length; j++){
        if(array[i][j] == array[i][i]){
          sum += array[i][i]; 
        }
      }
    }
    return sum;

  }
  public static void main(String[] args) {
    int [][] myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
    int sumDiagonal = sumDiagonalElements(myArray2D);
    System.out.println(sumDiagonal);
  }
}
