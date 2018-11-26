
public class Test {

	public static String stringClean (String str) {
		char [] c = str.toCharArray();
		String cleanedStr = "";
		
		for (char value : c) {
			if (cleanedStr.indexOf(value) == -1) {
				cleanedStr += value;
			}
		}		
		return cleanedStr;
	}
	
	public static int maxBlock (String str) {
		char [] c = str.toCharArray();
		int blockNum = 0;
		int count = 1;
		
		if (c.length == 0)
			return 0;
		
		for (int i=0; i<c.length-1; i++) {
			if (str.charAt(i) == str.charAt(i+1))
				count++;
			else
				count = 1;
			
			if (count > blockNum)
				blockNum = count;
		}

		return blockNum;
	}
	
	public static String reorderBlock (String str) {
		char [] c = str.toCharArray();
		
		
		for (int i=0; i<c.length-1; i++) {
			for (int j=0; j<c.length-i-1; j++) {
				if (c[j] > c[j+1]) {
					char temp = c[j];
					c[j] = c[j+1];
					c[j+1] = temp;
				}
			}
		}
		
		String sortedStr = String.valueOf(c);
		return sortedStr;
	}
	
	public static void main (String [] args) {
		String a = "yyzzza";
		System.out.println(stringClean(a));
		
		String b = "abbbcdd";
		System.out.println(stringClean(b));
		
		String c = "Hello";
		System.out.println(stringClean(c));	
		
		String d = "hoopla";
		System.out.println(maxBlock(d));
		
		String e = "abbCCCddBBBxx";
		System.out.println(maxBlock(e));
		
		String f = "";
		System.out.println(maxBlock(f));
		
		String g = "bbAAaccAdF";
		System.out.println(reorderBlock(g));
		
		String h = "hoopla";
		System.out.println(reorderBlock(h));
	}
}
