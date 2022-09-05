package String;

import java.util.Arrays;
import java.util.Scanner;

public class Flames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Boy name : ");
		String name1 = scan.nextLine().toLowerCase();
		System.out.println("Enter Girl name : ");
		String name2 = scan.nextLine().toLowerCase();
		
		
		flame(name1,name2);

	}

	private static void flame(String name1, String name2) {

		int len1 = name1.length();
		int len2 = name2.length();
		String s1 = name1;
		String s2 = name2;
		
		
		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len2; j++) {
				if (name1.charAt(i) == name2.charAt(j)) {
					name1 = name1.replaceFirst(String.valueOf(name1.charAt(i)), "0");
					name2 = name2.replaceFirst(String.valueOf(name2.charAt(j)), "0");

				}
			}
		}

		System.out.println("Balance String of "+s1);
		String str1 = balanceName(name1);
		System.out.println(str1);
		System.out.println();
		System.out.println("Balance String of "+s2);
		String str2 = balanceName(name2);
		System.out.println(str2);
		name1 = name1.replaceAll("0", "");
		name2 = name2.replaceAll("0", "");
		String result = name1 + name2;
		char ch = findChar(result);
		System.out.println();
		
		System.out.println(s1+" and "+s2+" relation ship is "+relationShip(ch));

	}

	private static String balanceName(String str) {
		char[] ch = new char[str.length()];
		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != '0') {
				ch[index++] = str.charAt(i);
			}
		}
		ch = Arrays.copyOf(ch, index);
		return String.valueOf(ch);
	}

		private static char findChar(String str) {
		 String flames = "FLAMES";
	        StringBuilder sb = new StringBuilder(flames);
	        char relationship = ' ';
	        while(sb.length()!=1)
	        {
	            int reminder = str.length()%sb.length(); 
	            String store;
	            
	            if(reminder!=0){
	                store = sb.substring(reminder)+sb.substring(0, reminder-1);  
	            }else{
	                store = sb.substring(0, sb.length()-1);
	            }
	            sb = new StringBuilder(store);
	           relationship = sb.charAt(0);
			
	        }
	       return relationship;
	}

	private static String relationShip(char ch) {
		switch (ch) {
		case 'F':
			return "Friends";
		case 'L':
			return "Love";
		case 'A':
			return "Affection";

		case 'M':
			return "Marriage";
		case 'E':
			return "Enemies";
		case 'S':
			return "Sibling(Sister)";

		}
		return "";
	}
}
