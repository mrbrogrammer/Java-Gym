package en.codegym.task.jdk13.task08.task0808;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
10 thousand deletions and insertions
*/

public class Solution {
    public static void main(String[] args) {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        //write your code here
        for (int index = 0; index < 10000; index++) {
            list.add(index);
        }

    }

    public static void get10000(List list) {
        //write your code here
        for (int index = 0; index < 10000; index++) {
            list.get(index);
        }
    }

    public static void set10000(List list) {
        //write your code here
        for (int index = 0, reverseIndex = 10000 -1; index < 10000; index++) {
            list.set(index, reverseIndex);
            reverseIndex--;
        }
    }

    public static void remove10000(List list) {
        //write your code here
        for (int index = 0; index < 10000; index++) {
            list.remove(0);
        }
    }
}
