package comm.pracctice;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

//Remove duplicate characters from a string
//👉 "programming" → "progamin"
public class Duplicate {
	public static void main(String[] args) {
		String str = "Programming";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			boolean flag = false;
			for (int j = 0; j < i; j++) {
				if (ch == str.charAt(j)) {
					flag = true;
					break;
				}

			}
			if (!flag) {
				System.out.print(ch);

//		}

			}

		}
		System.out.println();
		//another way String- array- set
		char [] array=str.toCharArray();
		for (char c : array) {
			System.out.println(c);
		}
		Set set= new LinkedHashSet();
		for (Object object : str.toCharArray()) {
			set.add(object);
		}
		System.out.println("-----------");
		for (Object object : set) {
			System.out.println(object);
		}
		
		
	}
}
