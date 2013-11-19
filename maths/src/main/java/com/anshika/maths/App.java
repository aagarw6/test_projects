package com.anshika.maths;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Maths m = new Maths();
        int add;
        add = m.add(1,2);
        System.out.println(add);
        int subtract;
        subtract =m.subtract(2, 1);
        System.out.println(subtract);
        int factorial;
        factorial = m.factorial(4);
        System.out.println(factorial);
        int product;
        product = m.product(1, 5);
        System.out.println(product);
        
    }
}
