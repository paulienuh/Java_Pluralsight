package com.pluralsight;

import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
	// Looping
        /*
        WHILE LOOP

        while(condition)
            statement;
            As long as condition is true, then print the statement or do whatever

        DO-WHILE LOOP

        do
         statement
         while(condition)
            so do the statement whilst the condition i.e. a variable is less than 100


        FOR LOOP
        for(initialize; condition; update loop)
         statement;
            */

        for(int iVal = 1; iVal <100; iVal *= 2)
            System.out.println(iVal);



        // ARRAYS - store multiple values under a single name

        float[] theVals = new float[3];
        // Each element accessed via an index which range from 0 to number of elements minus1
        theVals[0] = 10.0f;
        theVals[1] = 20.0f;
        theVals[2] = 30.0f;
        // This can also be written like: float[] theVals = {10.0f, 20.0f, 30.0f}
        float sum = 0.0f;

        for(int i = 0; i < theVals.length; i++)
            sum += theVals[i];
        System.out.println(sum);

        // FOR EACH LOOP
        /* for(loop-variable-declaration: array)
         statement; */

        for(float currentVal : theVals)
            sum += currentVal;

        System.out.println(sum);

        //SWITCH
        /* switch(test-value)
        * {
        * case value-1: statements
        * case value-2: statements;*/

        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break; // when the job is done, it's time for a break.
            case 2:
                System.out.println("Tuesday");
                break;
            default: // in case no match
                System.out.println("Almost the weekend!");
                break;
        }

        // Goes through the whole block of code until one matches
    }
}
