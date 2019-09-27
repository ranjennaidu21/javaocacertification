package javabasics;
//the random class need to be imported
import java.util.Random;

public class PackagesAndImports {

    public static void main(String[] args) {
        //for System dont have to import as it is in java.lang class
        Random random = new Random();
        System.out.println(random.nextInt(5));
    }
}

