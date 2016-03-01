package str;


public class J04ReplaceSpace {
	
	public String replaceSpace(StringBuffer str) {
		if(str == null) {
			return null;
		}
		
		int originalLength = str.length();
		int spaceNum = 0;
		// 获得字符串包含的空格个数
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				spaceNum++;
			}
		}
		
		int newLength = originalLength + spaceNum * 2;
		char[] temp = new char[newLength];
		originalLength--;
		newLength--;
		
		while(originalLength >= 0 && newLength >= originalLength) {
			if(str.charAt(originalLength) == ' ') {
				temp[newLength--] = '0';
				temp[newLength--] = '2';
				temp[newLength] = '%';
			} else {
				temp[newLength] = str.charAt(originalLength);
			}
			newLength--;
			originalLength--;
		}
		
		String resultStr = "";
		for(int i = 0; i < temp.length; i++) {
			resultStr += temp[i];
		}
    	return resultStr;
    }
	
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("We are happy.");
		System.out.println(new J04ReplaceSpace().replaceSpace(str));
	}
};