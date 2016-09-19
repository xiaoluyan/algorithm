package str;

public class JStr2Int {
	
	public static int autoStr2Int(String str) {
		if(str == null) {
			try {
				throw new Exception("输入不能为空");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
		
		str = str.trim(); //去掉前后的空格
		if(str.length() == 0) {
			try {
				throw new Exception("输入不能都为空格");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
		
		int i = 0;
		boolean isFushu = false;
		if(str.charAt(i) == '-') { 
			isFushu = true;
			i++;
		} else if(str.charAt(i) == '+') {
			i++;
		}
		
		long min = Integer.MIN_VALUE;
		long max = Integer.MAX_VALUE;
		long num = 0;
		
		for (; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= '0' && c <= '9') {
				num = num * 10 + c - '0';
			} else {
				return 0; //异常字符，直接输出0
			}
			
			if(isFushu && (0 - num) < min) {
				return 0;
			}
			
			if(!isFushu && num > max) {
				return 0;
			}
		}
		
		if(isFushu) {
			num = 0 - num;
		} 
		return new Long(num).intValue(); //将long转换为int
	}
	
	public static void main(String[] args) {
//		String str = "-2147483648";
		String str = "   ";
		System.out.println(JStr2Int.autoStr2Int(str));
	}
}
