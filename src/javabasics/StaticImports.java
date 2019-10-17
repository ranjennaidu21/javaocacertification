package javabasics;

import static java.lang.Math.*;
import static javabasics.StaticImportsConfig.*;
public class StaticImports {

    //static import for importing static members(variables or methods) , regular import for importing class
    public static void main(String[] args) {
        System.out.println(MAX_COUNT);
        int min = min(2,5); //instead of using Math.min
        System.out.println(PI); //instead of writing Math.PI
        printStaticVariables(); //have to be static , instead of writing StaticImportsConfig.printStaticVariables()
    }
}
