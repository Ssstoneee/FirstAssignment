 

/**
 * Created by Yang on 1/23/20.
 */
//import java.util.Arrays;
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
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        //StringBuilder sb = new StringBuilder();
        //for(int i=1; i< array.length; i++){
          //  sb.append(array[i]);
        //}  
        //return sb.toString();
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String item: array){
            if(item.equals(value)) {
                return true;
            }
        }
        //Arrays.asList(array).contains(value);
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int len = array.length;
        String[] result = new String[len];
        for(int i = 0; i < len; i++) {
            result[i] = array[len-1-i];
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        
        if (array == null) {return false;}
        int len = array.length;
        for (int i = 0; i < len/2; i++) {
            if(!array[i].equals(array[len-1-i])){
                return false;
        }
        //return true;
    }
    return true;
}
    

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < array.length; i++) {
            sb.append(array[i]);       
        }
        
        String str = sb.toString().toLowerCase().replaceAll("\\s", "");
        int[] check = new int[26]; 
        for(char c : str.toCharArray()) {
            check[c - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(check[i] == 0) {
                return false;
            }
        }
        
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int time = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(value)) {
                time += 1;
            }
        }
        return time;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int len = 0;
        for(int i = 0; i < array.length; i++) {
            if(!array[i].equals(valueToRemove)) {
                len++;
            }
        }
        String[] result = new String[len];
        int pos = 0;
        for(int i = 0; i < array.length; i++) {
             if(!array[i].equals(valueToRemove)) {
                 result[pos] = array[i];
                 pos++;
             }
        }
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int len = 1;
        for(int i = 1; i < array.length; i++) {
            if(!array[i].equals(array[i-1])) {
                len++;
            }
        }
        String[] result = new String[len];
        result[0] = array[0];
        int pos = 1;
        for(int i = 1; i < array.length; i++) {
            if(!array[i].equals(array[i-1])) {
                result[pos] = array[i];
                pos++;
            }
        }
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate 
     * occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int len = 1;
        for(int i = 1; i < array.length; i++) {
            if(!array[i].equals(array[i-1])) {
                len++;
            }
        }
        String[] result = new String[len];
        int count = 1;
        int k = 0;
        for(int i = 0; i < array.length; i++) {
            if(i+1 < array.length && array[i] == array[i+1]) {
                count += 1;
            } else {
                StringBuilder str = new StringBuilder();
                for(int j = 0; j < count; j++) {
                    str.append(array[i]);
                }
                result[k++] = str.toString();
                count = 1;
            }
        }
        return result;
    }


}
