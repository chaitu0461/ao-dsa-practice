package stacks.problems;

import java.util.List;
import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {
        int[][] persons = {{0, 1, 0}, {0, 0, 0}, {0, 1, 0}};
        Stack<Integer> personsStack = new Stack<>();
        for (int i = 0; i < persons.length; i++) {
            personsStack.push(i);
        }

        while (personsStack.size() > 1) {
            int curPotentialCandidate;
            int firstPerson = personsStack.pop();
            int secondPerson = personsStack.pop();
            if (persons[firstPerson][secondPerson] == 1)
                curPotentialCandidate = secondPerson;
            else
                curPotentialCandidate = firstPerson;

            personsStack.push(curPotentialCandidate);

        }
        int potentialCandidate=personsStack.peek();
        for(int column=0;column<persons[0].length;column++){
            if(persons[potentialCandidate][column]==1){
                System.out.println("no potential candidates present"); // celebrity should not know any person
                return;
            }
        }
        for(int row=0;row<persons.length;row++){
            if(row==potentialCandidate)
                continue;
            if(persons[row][potentialCandidate]==0){ //if any person does not know celebrity, he is not a celebrity
                System.out.println("no potential candidates present");
                return;
            }
        }
        System.out.println(potentialCandidate);

    }
}
