package singleton;

public class EhanshiSingleton {
	private static EhanshiSingleton instance = new EhanshiSingleton();
	
	private EhanshiSingleton(){}
	public static EhanshiSingleton getInstance(){
		return instance;
	}
}
