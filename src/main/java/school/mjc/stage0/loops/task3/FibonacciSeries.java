package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int currentFibonacci = 0;
        int previousFibonacci = 0;
        int temp = 0;
        for (int i = 0; i < lastFibonacci; i++)
        {
            System.out.println(currentFibonacci);
            temp = currentFibonacci == 0 ?1 : previousFibonacci + currentFibonacci;
            previousFibonacci = currentFibonacci;
            currentFibonacci = temp;


        }
    }
}
