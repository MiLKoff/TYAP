import java.util.Scanner;
public class Primes 
{
public static void main(String[] args)
        {
        		if (isPrime(100)==true)
        			System.out.print("Число сложное!");
        		else System.out.print("Число простое!");

		}
        public static boolean isPrime(int n)
        	{
		        for(int i=2;i<n;i++)
		        	if(n%i==0)
		        		return true;
		        	return false;
			}
}
