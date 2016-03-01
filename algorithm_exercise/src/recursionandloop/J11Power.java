package recursionandloop;

/**
 * 求浮点数的n次方
 * @author Luyan Xiao
 *
 */
public class J11Power {
	
	//方法1：normal
	public double power1(double base, int exponent) {
		if(equal(base, 0.0) && exponent <0) {
			try {
				throw new Exception("0的负次数幂无意义。");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
		
		int tempEx = Math.abs(exponent);
		double res = 1.0;
		for(int i = 0; i < tempEx; i++) {
			res *= base;
		}
		return exponent > 0 ? res : 1 / res;
	}
	
	//计算机内表示小数时有误差，故判断两个小数是否相等时，
	//只能判断它们之差的绝对值是不是在一在一个很小的范围内
	public boolean equal(double num1, double num2) {
		if((num1 - num2 > -0.0000001) && (num1 - num2 < 0.0000001)) {
			return true;
		} else {
			return false;
		}
	}
	
	//方法2：用公式(effective)
	public double power2(double base, int exponent) {
		if(equal(base, 0.0) && exponent <0) {
			try {
				throw new Exception("0的负次数幂无意义。");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
		if(exponent == 0) {
			return 1;
		}
		if(exponent == 1) {
			return base;
		}

		int tempEx = Math.abs(exponent);
		//用右移代替除以2
		double res = power2(base, tempEx >> 1);
		res *= res;
		//用位与运算代替%判断exponent是否是奇数
		if((exponent & 0x1) == 1) {
			res *= base;
		}
		return exponent > 0 ? res : 1 / res;
	}
	
	
	
	public static void main(String[] args) {
		J11Power j11Power = new J11Power();
		double base = 0;
		int exponent = 1;
		double res = j11Power.power2(base, exponent);
		System.out.println(res);
	}
}
