package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if(first == 0)
        {
            System.out.println(second);
        }

        if(second == 0)
        {
            System.out.println(first);
        }

        int initialDivisor = first < second? first: second;

        for (int i = initialDivisor; i > 0 ; i--)
        {
            if (first%i==0 && second%i==0)
            {
                System.out.println(i);
                return;
            }
        }
    }
}
