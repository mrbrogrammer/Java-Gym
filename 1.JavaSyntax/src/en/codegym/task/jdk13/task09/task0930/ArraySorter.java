package en.codegym.task.jdk13.task09.task0930;

public class ArraySorter {

    public void sort(String[] array) {
        //write your code here
        for (int index1 = 0; index1 < array.length; index1++) {
            int index2 = 0;
            while (index2 < array.length) { //
                if (!isNumber(array[index1]) && !isNumber(array[index2])) {
                    // only when the current string smaller, then we swap
                    if (!isGreaterThan(array[index1], array[index2])) {
                        String tmp = array[index1];
                        array[index1] = array[index2];
                        array[index2] = tmp;
                    }
                } else if (isNumber(array[index1]) && isNumber(array[index2])){
                    if (Integer.parseInt(array[index1]) > Integer.parseInt(array[index2])) {
                        int tmp = Integer.parseInt(array[index1]);
                        array[index1] = array[index2];
                        array[index2] = String.valueOf(tmp);
                    }
                }
                index2++;
            }
            
        }
        
    }

    // String comparison method: 'a' is greater than 'b'
    public boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Is the passed string a number?
    public boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];
            if ((i != 0 && character == '-') // The string contains a hyphen
                || (!Character.isDigit(character) && character != '-') // or is not a number and doesn't start with a hyphen
                || (chars.length == 1 && character == '-')) // or is a single hyphen
            {
                return false;
            }
        }
        return true;
    }
}
