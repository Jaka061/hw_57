package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(Class.num);
        Thread minus = new Thread(new Thread1());
        minus.start();
        Thread plus = new Thread(new Thread2());
        plus.start();
        Thread division = new Thread(new Thread3());
        division.start();
        Thread multiplication = new Thread (new Thread4());
        multiplication.start();

        System.out.println(Class.num);
    }

}
