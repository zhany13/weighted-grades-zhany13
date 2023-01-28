import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner myobject = new Scanner(System.in);
       double earnpoint = myobject.nextDouble();
       double total = myobject.nextDouble();
       double assignment = myobject.nextDouble();

       //

        Score score=new Score(total,earnpoint,assignment);
        System.out.println(String.format("Total Weighted grade = %.0f/%.0f*%.2f*100=%.3f for the weighted grade.",
                score.getEarnedPoint(),score.getTotal(),score.getAssignment(),score.calculate()));
    }
}