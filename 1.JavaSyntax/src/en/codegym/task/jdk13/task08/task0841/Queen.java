package en.codegym.task.jdk13.task08.task0841;

/**
 * 1. The main method should populate the anthill by calling the Queen class's populate method.
 * 2. The main method should call the sendForFood method on each of the ants in the workers array.
 * 3. The main method should call the sendIntoBattle method on each of the ants in the soldiers array.
 */
public class Queen {

    public static Worker[] workers;
    public static Soldier[] soldiers;

    public static void main(String[] args) {
        populate();

        //write your code here
        for (int i = 0; i < workers.length; i++) {
            workers[i].sendForFood();
        }
    
        for (int i = 0; i < soldiers.length; i++) {
            soldiers[i].sendIntoBattle();
        }
    }

    public static void populate() {
        workers = new Worker[800];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker();
        }

        soldiers = new Soldier[70];
        for (int i = 0; i < soldiers.length; i++) {
            soldiers[i] = new Soldier();
        }
    }
}
