package prob04;

public class StringUtil {

	public static String concatenate(String[] strArr) {
		String st="";
		for(int i=0; i<strArr.length; i++) {
			st += strArr[i];
		}
		return st;
	}
	
}
