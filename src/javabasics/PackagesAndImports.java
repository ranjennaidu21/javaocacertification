package javabasics;
//the random class need to be imported

import java.util.Date;
import java.util.Random;

//for the date if both using same class name better to ignore wildcard and use fullName as below,
//or will conflict
//import java.sql.*;

public class PackagesAndImports {

    public static void main(String[] args) {
        //for System dont have to import as it is in java.lang class
        Random random = new Random();
        System.out.println(random.nextInt(5));

        Date date;
        java.sql.Date date2;
    }

    //shortcut ctrl+alt+l to reformat code
    //shortcut ctrl+alt+o to organize and clear unused import
}

