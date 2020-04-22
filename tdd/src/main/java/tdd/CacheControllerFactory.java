package tdd;

public class CacheControllerFactory {
	
	public static CacheController getInstance() {
		
		//return null; //tambien funciona asi
		return new CacheController();
		
	}

}
