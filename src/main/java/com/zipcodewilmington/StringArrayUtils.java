package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length -1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String input : array){
            if(input == value){
                return true;
            }
        }

        return false;
    }



    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        //Convert string array to List of Strings
        List<String> input = Arrays.asList(array);
        //Reverse the collections of strings using Collections Parent Class of List
        Collections.reverse(input);
        //convert list back to array and return
        return input.toArray(array);
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        //create a for loop
        for (int i = 0; i <= array.length / 2 && array.length != 0; i++ ) {
            //if array index is not equal to the index of the current array
            if (array[i] != array[array.length -i - 1]) {
                break;
            }
            return true;
        }

        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {



        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int result = 0;
        for (String word: array){
              if(word == value){
                  result++;
              }
        }
        return result;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> result = new ArrayList<String>(Arrays.asList(array));
        result.remove(valueToRemove);
        String[] returnVal = new String[result.size()];
        for(int i = 0; i <= returnVal.length-1; i++){
            returnVal[i] = result.get(i);
        }
        return returnVal;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> result = new ArrayList<String>();
        //ArrayList<Integer> newList = new ArrayList<Integer>();
        // Always add first value
        result.add(array[0]);
        // Iterate the remaining values
        for(int i = 1; i < array.length; i++) {
            // Compare current value to previous
            if(array[i-1] != array[i]) {
                result.add(array[i]);
            }
        }
        String[] returnVal = new String[result.size()];
        for(int i = 0; i <= returnVal.length-1; i++){
            returnVal[i] = result.get(i);
        }
        return returnVal;

    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {


        return null;
    }


}
