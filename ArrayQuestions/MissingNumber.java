package ArrayQuestions;

public class MissingNumber {
  static int findMissingNumberInArray(int []arr){
    int n = arr.length + 1;
    int expectedSum = (n*(n+1)) / 2;
    int actualSum = 0;
    for(int number :  arr){
      actualSum += number;
    }
    return expectedSum - actualSum;
  }

  public static void main(String[] args) {
    int arr [] ={1,2,3,4,6};
    System.out.println(findMissingNumberInArray(arr));
    
  }
}
