package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int max;
       if (first <= second) {
           if (second <= third) {
               max = third;
           } else {
               max = second;
           }
       } else {
           max = first;
       }
        System.out.println(max);
    }
}
