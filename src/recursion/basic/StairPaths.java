package recursion.basic;

public class StairPaths {
    public static void main(String[] args) {
        printStairPaths(5,0,"");
    }

    private static void printStairPaths(int totalNumberOfSteps, int currentStep, String ans) {
        if(totalNumberOfSteps==currentStep)
            System.out.println(ans);
        if(currentStep>totalNumberOfSteps)
            return;
        printStairPaths(totalNumberOfSteps,currentStep+1,ans+1);
        printStairPaths(totalNumberOfSteps,currentStep+2,ans+2);
        printStairPaths(totalNumberOfSteps,currentStep+3,ans+3);

    }
}
