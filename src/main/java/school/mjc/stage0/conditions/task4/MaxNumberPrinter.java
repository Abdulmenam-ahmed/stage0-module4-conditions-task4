package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
    	int max= first;
    	max= second>= max? second : first ;
    	max= third>=max ? third: max;
    	System.out.println(max);
    }
}
