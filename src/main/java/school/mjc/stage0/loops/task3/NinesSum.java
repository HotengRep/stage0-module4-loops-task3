package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
    int lenghtOfNumber = 0;
    int sum = 0;
    while (lenghtOfNumber <= lengthOfLastNumber)
    {
        sum += Math.pow(10,lenghtOfNumber)-1;
        lenghtOfNumber++;
    }
    System.out.println(sum);

    }
}
