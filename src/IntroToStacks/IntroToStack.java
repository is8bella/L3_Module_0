package IntroToStacks;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>();
		int currentIndex = 0;
		
		String userNum1;
		String userNum2;
		
		//1. Create a Stack of Doubles *
		Stack<Double> stack = new Stack<Double>();
		//   Don't forget to import the Stack class *
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack. *
		Random r = new Random();
		double randDouble = 0;
		
		for (int i = 0; i <= 100; i++) {
			randDouble = 0 + (100 - 0) * r.nextDouble();
			stack.push(randDouble);
			list.add(randDouble);
		}
		
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. *
		userNum1 = JOptionPane.showInputDialog("Enter any number from 0-100:");
		userNum2 = JOptionPane.showInputDialog("Enter another number from 0-100:");
		
		Double userdouble1 = Double.parseDouble(userNum1);
		Double userdouble2 = Double.parseDouble(userNum2);
		
		if(userdouble2 > userdouble1) {
			userdouble1 = Double.parseDouble(userNum2);
			userdouble2 = Double.parseDouble(userNum1);
		}
		
		System.out.println("NUM 1: " + userdouble1 + "\n" + "NUM 2: " + userdouble2);
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.*
		int sz = stack.size();
		for(int i = 0; i < sz; i++){
			double d = stack.pop();
			if(d > userdouble2 && d < userdouble1) {
				System.out.println(d);
			}
		}
		
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
