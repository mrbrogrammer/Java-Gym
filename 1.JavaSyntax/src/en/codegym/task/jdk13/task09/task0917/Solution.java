package en.codegym.task.jdk13.task09.task0917;

/* 
Catching unchecked exceptions
*/

public class Solution {
    public static void main(String[] args) {
        handleExceptions(new Solution());
    }

    public static void handleExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (NullPointerException e) {
            printStack(e);
        } catch (NumberFormatException e) {
            printStack(e);
        } catch (IndexOutOfBoundsException e) {
            printStack(e);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() throws NullPointerException {
        throw new NullPointerException();
    }

    public void method2() throws IndexOutOfBoundsException {
        throw new IndexOutOfBoundsException();
    }

    public void method3() throws NumberFormatException {
        throw new NumberFormatException();
    }
}

