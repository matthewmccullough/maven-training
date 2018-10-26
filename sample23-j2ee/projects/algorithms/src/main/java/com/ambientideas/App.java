package com.ambientideas;

/**
 * Hello world!
 *Take user name and display it to the user.
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter your name:");
        a=sc.nextInt();
        System.out.println("Your name is"+" "+a);
    }
}
