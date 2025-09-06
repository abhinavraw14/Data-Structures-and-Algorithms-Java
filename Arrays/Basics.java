public class Basics{
  public static void main(String[] args) {
    // Declaration of array
    int [] arr;
    int arr2[];

    // Allocation
    arr = new int[5];

    // Initialization
    int [] arr3 = {1, 2, 3, 4, 5};

    // Accessing elements
    System.out.println(arr3[0]);

    // Length of array
    System.out.println(arr3.length);

    // Iterating through array
    for(int i = 0; i < arr3.length; i++) {
      System.out.print(arr3[i] + " ");
    }

    // Enhanced for loop
    for(int num : arr3) {
      System.out.print(num + " ");
    }

    // Multidimensional array
    int [][] matrix = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };

    System.out.println(matrix[1][2]); // Outputs 6

    int [] [] matrix2 = new int[3][3];
    matrix2[0][0] = 1;

    // traversing multidimensional array
    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

    // jaggged array
    int [][] jagged = new int[3][];
    jagged[0] = new int[2];
    jagged[1] = new int[3];
    jagged[2] = new int[1];
    jagged[0][0] = 1;
    jagged[0][1] = 2;
    jagged[1][0] = 3;
    jagged[1][1] = 4;
    jagged[1][2] = 5;
    jagged[2][0] = 6;
    for(int i = 0; i < jagged.length; i++) {
      for(int j = 0; j < jagged[i].length; j++) {
        System.out.print(jagged[i][j] + " ");
      }
      System.out.println();
    }


  }
}