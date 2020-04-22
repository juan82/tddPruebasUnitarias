package tdd;


public class UrlShortener {
	
	private CacheController cacheController = CacheControllerFactory.getInstance();	
	
	public String shorter ( String url) {
		
		return this.cacheController.shortUrl(url) ;
	}
	
	public String reverseUrl (String shortenUrl) {
		
		return this.cacheController.reverseUrl(shortenUrl) ;
	}

}
