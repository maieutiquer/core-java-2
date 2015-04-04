package ch.plam.corejava2.week0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Problems2Impl implements Problems2 {

    @Override
    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    @Override
    public boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int min(int... array) {
        return Arrays.stream(array).min().getAsInt();
    }

    @Override
    public int kthMin(int k, int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                if (k > 0) {
                    min = array[i];
                    k--;
                } else {
                    break;
                }
            }
        }
        return min;
    }

    @Override
    public float getAverage(int[] array) {
        return 1.0f * IntStream.of(array).sum() / array.length;
    }

    @Override
    public long getSmallestMultiple(int upperBound) {
        long smallestMultiple = 1;
        while (smallestMultiple < 232792563) {
            boolean fulfilsCondition = true;
            for (int i = 1; i < upperBound; i++) {
                if (smallestMultiple % i != 0) {
                    fulfilsCondition = false;
                    break;
                }
            }
            if (fulfilsCondition == true) {
                return smallestMultiple;
            }
            smallestMultiple++;
        }
        return -1;
    }

    private boolean isPalindrome(long number) {
        String numberAsString = String.valueOf(number);
        for (int i = 0; i < numberAsString.length() / 2; i++) {
            if (!(numberAsString.charAt(i) == numberAsString.charAt(numberAsString.length() - i - 1))) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public long getLargestPalindrome(long N) {
        for (long i = N; i > 9; i--) {
            if (isPalindrome(i)) {
                return i;
            }
        }
        return 0;
    }
    
    private int[] matrixToArray(short[][] matrix) {
        int arrayLength = matrix.length * matrix[0].length;
        int[] array = new int[arrayLength];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                array[i*j + j] = matrix[i][j];
            }
        }
        return array;
    }

    @Override
    public int[] histogram(short[][] image) {
        int[] imageAsArray = matrixToArray(image);
        for (int i = 0; i < imageAsArray.length; i++) {
            System.out.println(i + " - " + imageAsArray[i]);
        }
        int numberOfUniqueElementsInImage;
        Set<Integer> uniqKeys = new TreeSet<Integer>();
//        uniqKeys.addAll(Arrays.asList(image));

        return null;
    }

    @Override
    public long doubleFac(int n) {
        return LongStream.rangeClosed(2, LongStream.rangeClosed(2, n).reduce(1, (a, b) -> a * b)).reduce(1, (a, b) -> a * b);
    }

    @Override
    public long kthFac(int k, int n) {
        long kthFact = 0;
        if (k > 0) {
            kthFact = LongStream.rangeClosed(2, n).reduce(1, (a, b) -> a * b);
        }
        for (int i = 1; i < k; i++) {
            kthFact += LongStream.rangeClosed(2, kthFact).reduce(1, (a, b) -> a * b);
        }
        return kthFact;
    }

    @Override
    public int getOddOccurrence(int[] array) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public long pow(int a, int b) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public long maximalScalarSum(int[] a, int[] b) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int maxSpan(int[] array) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean canBalance(int[] array) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int[][] rescale(int[][] original, int newWidth, int newHeight) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String reverseMe(String argument) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String copyEveryChar(String input, int k) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String reverseEveryWord(String arg) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isPalindrome(String argument) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isPalindrome(int number) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int getPalindromeLength(String input) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int countOcurrences(String needle, String haystack) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String decodeURL(String input) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int sumOfNumbers(String input) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean areAnagrams(String A, String B) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasAnagramOf(String string, String string2) {
        // TODO Auto-generated method stub
        return false;
    }

}
