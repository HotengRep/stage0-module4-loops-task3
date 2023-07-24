package school.mjc.stage0.loops.task3;

import java.lang.reflect.Array;

public class DigitsSum {
    public void printDigitsSum(int t){
        String convertDigit = Integer.toString(t);
        int length = convertDigit.length();
        int sum = 0;
        int digital = 0;
        int alreadyAddedNumber = 0;
        int plusT = t < 0? t*-1: t;
        for (int i = length; i > 0; i--)
        {
            alreadyAddedNumber += digital*((int)Math.pow(10,i));
            digital = (plusT -alreadyAddedNumber) / (int) Math.pow(10,i - 1);
            sum += digital;
        }
        System.out.println(sum);
    }
}
