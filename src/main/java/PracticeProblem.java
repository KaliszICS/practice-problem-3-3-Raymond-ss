/*
 * File: Else if
 * Author: Raymond
 * Date Created: March 25, 2026
 * Date Last Modified: April 15, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {

	}
	
public static String evenOrOdd(int num) {
	if (num == 0){
		return "Zero";
	}
	else if (num % 2 == 0){
		return "Even";
	}
	else{
		return "Odd";
	}
}

public static String positiveOrNegative(int num) {
	if (num > 0){
		return "Positive";
	}

	else if(num < 0){
		return "Negative";
	}
	else{
		return "Zero";
	}
}
public static String pluralize(String num){

	num = num.toLowerCase();
	if (num.endsWith("ey")){
		return "eys";
	}
	else if (num.endsWith("y")){
		return "ies";
	}
	else if (num.endsWith("ife")){
		return "ives";
	}
	else {
		return "s";
	}

}



}