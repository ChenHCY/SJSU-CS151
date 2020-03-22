//Student Name: Chenyu Yang
//student ID: 014277029
//Course: CS-151-2020SP
//Lab: Homework 5 Exercise-5
//Date: 2020/03/17

package Exercise5;

public class TooManyHoursWorkedException extends Exception 
{
	TooManyHoursWorkedException(String s){
		super(s);
	}
}

class Input{
	 void method() throws TooManyHoursWorkedException {
		 throw new TooManyHoursWorkedException("TooManyHoursWorkedException occured");
	 }
}

class TestInput{
	public static void main(String[] args){
        try {
            new Input().method();
        } catch(TooManyHoursWorkedException tmh) {
            System.out.println(tmh.getMessage());
        }
	}
}
