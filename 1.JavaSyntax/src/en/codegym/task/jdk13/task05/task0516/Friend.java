package en.codegym.task.jdk13.task05.task0516;

/**
You can't buy friends
1. The Friend class must have a String variable name.
2. The Friend class must have an int variable age.
3. The Friend class must have a char variable sex.
4. The class must have a constructor that takes a name as an argument and initializes the corresponding instance variable.
5. The class must have a constructor that takes a name and age as arguments, and initializes the corresponding instance variables.
6. The class must have a constructor that takes a name, age, and sex as arguments, and initializes the corresponding instance variables.
*/

public class Friend {
    //write your code here
    private String name;
    private int age;
    private char sex;
    
    public Friend(String name){
        this.name = name;
        age = 12;
        sex = 'm';
    }
    
    public Friend(String name, int age){
        this.name = name;
        this.age = age;
        sex = 'm';
    }
    
    public Friend(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
