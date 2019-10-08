package javabasics;

import static java.lang.System.*;

public class StaticImportsConfig {
    public static final String NAME = "RANJEN NAIDU";
    public static final int MAX_COUNT = 1;

    public static void printStaticVariables(){
        out.println("Name: "+ NAME);
        out.println("Count: " + MAX_COUNT);
    }
}
