import java.util.*;
import java.util.Random;
public class otp {
	static char[] sendOTP(int length) {
		System.out.println("the otp for the transaction id is :");
		String numbers="0123456789";
		Random ob1=new Random();
		char[] otp=new char[length];
		for(int i=0;i<length;i++)
		{
			otp[i]=numbers.charAt(ob1.nextInt(numbers.length()));
		}
		return otp;
	}

	public static void main(String[] args) {
		System.out.println(sendOTP(6));
		
		
	}

}
