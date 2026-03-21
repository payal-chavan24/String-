package comm.pracctice;

//ind frequency of each character
//👉 "aabbc" → a=2, b=2, c=1
public class Frequency {
	public static void main(String[] args) {
		String str = "aabbc";
		//char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			boolean flag = false;
			for (int j = 0; j < i; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					flag = true;
					break;
				}

			}
			if (!flag) {
				for (int k = 0; k < str.length(); k++) {
					if (str.charAt(i) == str.charAt(k)) {
						count++;
					}

				}

				System.out.println(str.charAt(i) + "=" + count);
			}

		}
	}
}
