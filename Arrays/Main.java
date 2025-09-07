import java.util.Arrays;
public class Main {
  public static void main(String[] args) {

    TwoDimensionalArray sda = new TwoDimensionalArray(3, 3);

    sda.insertValueInTheArray(0, 0, 10);
    //sda.insertValueInTheArray(0, 0, 20);
    for(int i=0; i<sda.arr.length; i++){
      for(int j=0; j<sda.arr[0].length; j++){
        System.out.print(sda.arr[i][j]+ " ");
      }
      System.out.println();
    }





  }  
  
}
