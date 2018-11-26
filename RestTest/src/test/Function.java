package test;

public class Function {
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
}
