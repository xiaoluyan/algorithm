package algorithm.recursionandloop;

public class J09JumpFloor {
	
	//循环的方法
    public int JumpFloor(int target) {
    	if(target <= 0) {
    		return 0;
    	}
    	if(target == 1) {
    		return 1;
    	}
    	if(target == 2) {
    		return 2;
    	}
    	int f1 = 1;
    	int f2 = 2;
    	int res = 0;
    	for(int i = 3; i <= target; i++) {
    		res = f2 + f1;
    		f1 = f2;
    		f2 = res;
    	}
    	return res;
    }
}
