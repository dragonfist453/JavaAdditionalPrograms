/*
Write a Java program to demonstrate the following.
Given a double-precision number, payment, denoting an amount of money, use
the NumberFormat class' getCurrencyInstance method to convert payment into the US,
Indian, Chinese, and French currency formats. Then print the formatted values as
follows:
US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment
where formattedPayment is payment formatted according to the appropriate Locale's
currency. Note: India does not have a built-in Locale, so you must construct one where
the language is en (i.e., English).
Input Format
A single double-precision number denoting .
Constraints
 0<=payment<=109
Output Format
On the first line, print US: u where u is payment formatted for US currency.
On the second line, print India: i where i is payment formatted for Indian currency.
On the third line, print China: c where c is payment formatted for Chinese currency.
On the fourth line, print France: f, where f is payment formatted for French currency.
 */
package Problem3;
import java.text.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the payment");
        double payment = input.nextDouble();

	try{
		if(payment<0 && payment>=1000000000)
			throw new Exception();
	}
	catch(Exception e) {
		System.out.println(e);
	}
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: "+usFormat.format(payment));
        System.out.println("India: "+indiaFormat.format(payment));
        System.out.println("China: "+chinaFormat.format(payment));
        System.out.println("France: "+franceFormat.format(payment));
    }
}
