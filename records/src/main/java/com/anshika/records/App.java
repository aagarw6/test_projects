package com.anshika.records;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Sorted s;
        s= new Sorted();
        s.addentry("ggggg",12345,3);
        s.addentry("aaaaa",12346,5);
        s.addentry("vvvvv",12347,8);
        s.addentry("sssss",97886,9);
        s.display();
    }
}
