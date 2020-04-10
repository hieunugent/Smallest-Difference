import java.util.Arrays;

class SmallestDiff{
  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    // Write your code here.
		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		int indexOne = 0;
		int indexTwo = 0;
		int minResult = Integer.MAX_VALUE;
		int possibleMin = Integer.MAX_VALUE;
		int[] resultArray = new int[2];
		while (indexOne < arrayOne.length && indexTwo < arrayTwo.length){
			int firstNum = arrayOne[indexOne];
			int secondNum = arrayTwo[indexTwo];
			if(firstNum < secondNum){
				possibleMin = secondNum - firstNum;
				indexOne++;
			}else if (secondNum < firstNum){
				possibleMin = firstNum - secondNum;
				indexTwo++;
			}else{
				return new int[]{firstNum, secondNum};
			}
			if (minResult > possibleMin){
				minResult = possibleMin;
				resultArray = new int[]{ firstNum, secondNum };
			}
		}

    return resultArray;
  }
}
