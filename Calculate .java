package Calculate ;

import java.lang.*;
import java.util.*;
import java.util.Scanner;

class Calculate 
{ 
	//this method calculates gcd and lcm of two numbers
    public  int gcd()
    {
        int x, y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two numbers: ");
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("GCD of two numbers is : " + gcd(x, y));
        System.out.println("LCM of two numbers is : " + lcm(x, y));
        return 0;
    }

    static int gcd(int x, int y)
    {
        int r = 0, a, b;
        a = (x > y) ? x : y; // a is greater number
        b = (x < y) ? x : y; // b is smaller number

        r = b;
        while (a % b != 0)
        {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }

    static int lcm(int x, int y)
    {
        int a;
        a = (x > y) ? x : y; // a is greater number
        while (true)
        {
            if (a % x == 0 && a % y == 0)
            {
                return a;
            }
            ++a;
        }
        }
        //this method calculates simple and compound interest rates.
    public int intrest()
    {
        double p, n, r, si, ci;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the amount : ");
        p = s.nextDouble();

        System.out.print("Enter the No.of years : ");
        n = s.nextDouble();

        System.out.print("Enter the Rate of interest : ");
        r = s.nextDouble();

        si = (p * n * r) / 100;
        ci = p * Math.pow(1.0 + r / 100.0, n) - p;

        System.out.println("\nAmount : " + p);
        System.out.println("No. of years : " + n);
        System.out.println("Rate of interest : " + r);
        System.out.println("Simple Interest : " + si);
        System.out.println("Compound Interest : " + ci);
        return 0;
    }
// this method calculates volume and area of a cylinder 
    public int volume ()
    {
        double PI = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter Height: ");
        double h = sc.nextDouble();

        double volume = PI * r * r * h;
        double area = 2 * PI * r * (r + h);
        System.out.println("Volume of Cylinder: " + volume);
        System.out.println("Area of Cylinder: " + area);
        return 0;
    }
    //all methods are called in the main method.
    public static void main (String[] args)
    {
    	Calculate  all= new Calculate ();
    	all.gcd();
    	all.intrest();
    	all.volume();
    	}
    }
