package com.codegym.task.task21.task2102;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* 
Compare modifiers

*/

public class Solution {
    public static void main(String[] args) {
        int classModifiers = Solution.class.getModifiers();
        System.out.println(isModifierSet(classModifiers, Modifier.PUBLIC));   //true
        System.out.println(isModifierSet(classModifiers, Modifier.STATIC));   //false

        int methodModifiers = getMainMethod().getModifiers(); // this adds all the modifiers by HEX
        System.out.println(isModifierSet(methodModifiers, Modifier.STATIC));      //true
    }

    public static boolean isModifierSet(int allModifiers, int specificModifier) {
        // if allModifiers is divisible by specificModifier while less than > specificModifier, then
        if (allModifiers == specificModifier) {
            return true;
        } else {
            int a = (allModifiers / 2) * 2;
            int b = allModifiers % 2;
            if (a == specificModifier || b == specificModifier) {
                return true;
            }
            
        }
        return false;
    }

    private static Method getMainMethod() {
        Method[] methods = Solution.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equalsIgnoreCase("main")) return method;
        }

        return null;
    }
}
