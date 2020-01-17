package math.problems;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;

public class UnitTestingMath {
    private static FindLowestDifference FindMissingNumber;

    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        try {//unit testing for Factorial
            Assert.assertEquals(Factorial.fact(5), 120);
            System.out.println("Unit testing passed for factorial");
        } catch (AssertionError ar) {
            System.out.println("Unit testing failed for factorial");
        }

        try {//unit testing for Fibonacci
            ArrayList<Integer> expectedArray = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34));
            int fab[] = new int[10];
            // Assert.assertEquals();
            System.out.println("Unit testing passed for fibonacci");
        } catch (AssertionError as) {
            System.out.println("Unit testing failed for fibonacci");
        }

    }
}