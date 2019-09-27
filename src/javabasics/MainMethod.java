package javabasics;

public class MainMethod {
    //you can add edit configuration and add in the program arguments where it accept string of args separated by space
    public static void main(String[] args){
        System.out.println("args length: " +args.length);

        //to print all the arguments
        for(int i=0;i<args.length;i++){
            System.out.println("args[" +i+"]="+args[i]);
        }
    }

}
