package en.codegym.task.pro.task06.task0616;

/* 
Employee records
1. The setPosition() method must set the passed value to the position instance variable.
2. The setSalary() method must set the passed value to the salary instance variable.
3. You cannot change the names of the instance variables.
4. You cannot change the names of method parameters
*/

public class Solution {
    public String name = "Amigo";
    public String position = "Java developer";
    public int salary = 10_000;

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
