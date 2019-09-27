package javabasics;

public class Comments {

    public static void main(String[] args) {
        //Single line comment
        /*
        this is multi
        line comments
        */

        int i = sum(1,2);
    }

    //javadoc comment by type /**and enter after created the method. when hover above of the method, can see the javadoc

    /**
     * Calculate sum of two integers
     *
     * @param a operand
     * @param b operand
     * @return sum
     */
    public static int sum(int a,int b){
        int sum = a + b;
        return sum;
    }
}
