import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class fomatter {
	private static String readFile( String file ) throws IOException {
	    BufferedReader reader = new BufferedReader( new FileReader (file));
	    String         line = null;
	    StringBuilder  stringBuilder = new StringBuilder();
	    String         ls = System.getProperty("line.separator");

	    while( ( line = reader.readLine() ) != null ) {
	        stringBuilder.append( line );
	        stringBuilder.append( ls );
	    }

	    return stringBuilder.toString();
	}
	public static void main(String[] args){
		try{
		String str = readFile(args[0]);
			str = str.replaceAll("<[^>]*>", "");
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*String str = "<html><head>\n" + 
				"<meta http-equiv= content-type  content= text/html; charset=UTF-8 ><title>Extracted Links</title></head><body><h2>Links</h2><br><a href= http://alienblue.org/ >http://alienblue.org/</a><br><a href= http://i.imgur.com/2ikXKl2.jpg >http://i.imgur.com/2ikXKl2.jpg</a><br><a href= http://i.imgur.com/8EFeF8r.jpg >http://i.imgur.com/8EFeF8r.jpg</a><br><a href= http://i.imgur.com/FqHbirk.jpg >http://i.imgur.com/FqHbirk.jpg</a><br><a href= http://i.imgur.com/HDGwDON.jpg >http://i.imgur.com/HDGwDON.jpg</a><br><a href= http://i.imgur.com/IYiBrCh.jpg >http://i.imgur.com/IYiBrCh.jpg</a><br><a href= http://i.imgur.com/JKez59I.jpg >http://i.imgur.com/JKez59I.jpg</a><br><a href= http://i.imgur.com/JQImHOO.jpg >http://i.imgur.com/JQImHOO.jpg</a><br><a href= http://i.imgur.com/PMPhAbv.jpg >http://i.imgur.com/PMPhAbv.jpg</a><br><a href= http://i.imgur.com/PV2mQM7.png >http://i.imgur.com/PV2mQM7.png</a><br><a href= http://i.imgur.com/XA8GdbS.jpg >http://i.imgur.com/XA8GdbS.jpg</a><br><a href= http://i.imgur.com/iT7qQtk.jpg >http://i.imgur.com/iT7qQtk.jpg</a><br><a href= http://i.imgur.com/rszJAyX.jpg >http://i.imgur.com/rszJAyX.jpg</a><br><a href= http://i.imgur.com/xuok2hQ.jpg >http://i.imgur.com/xuok2hQ.jpg</a><br><a href= http://imgur.com/EeNczW7 >http://imgur.com/EeNczW7</a><br><a href= http://imgur.com/a/51qKC >http://imgur.com/a/51qKC</a><br><a href= http://imgur.com/a/GeuSf >http://imgur.com/a/GeuSf</a><br><a href= http://imgur.com/iyAiCzv >http://imgur.com/iyAiCzv</a><br><a href= http://imgur.com/oYseW1v >http://imgur.com/oYseW1v</a><br><a href= http://jvl.bz/?ab5fd >http://jvl.bz/?ab5fd</a><br><a href= http://redd.it/2y89p8 >http://redd.it/2y89p8</a><br><a href= http://reddit.tv/ >http://reddit.tv/</a><br><a href= http://redditgifts.com/ >http://redditgifts.com/</a><br><a href= http://redditjs.com/r/wallpapers#grid >http://redditjs.com/r/wallpapers#grid</a><br><a href= http://redditmarket.com/ >http://redditmarket.com/</a><br><a href= http://reddpics.com/r/wallpapers/ >http://reddpics.com/r/wallpapers/</a><br><a href= http://sobeston.deviantart.com/art/Icecream-576181473?ga_submit_new=10%253A1449281136 >http://sobeston.deviantart.com/art/Icecream-576181473?ga_submit_new=10%253A1449281136</a><br><a href= http://www.panoptikos.com/r/wallpapers >http://www.panoptikos.com/r/wallpapers</a><br><a href= http://www.reddit.com/r/nocontext_wallpapers >http://www.reddit.com/r/nocontext_wallpapers</a><br><a href= http://www.reddit.com/r/wallpapers/comments/1t1zcf/its_finally_here_the_thing_nobodys_been_asking/ >http://www.reddit.com/r/wallpapers/comments/1t1zcf/its_finally_here_the_thing_nobodys_been_asking/</a><br><a href= http://www.reddit.com/r/wallpapers/wiki/rules >http://www.reddit.com/r/wallpapers/wiki/rules</a><br><a href= http://www.reddit.com/user/imaginarymod/m/imaginaryexpanded >http://www.reddit.com/user/imaginarymod/m/imaginaryexpanded</a><br><a href= http://www.yourepo.com/repo/ifuntheme/pack/wallpapersislamici6 >http://www.yourepo.com/repo/ifuntheme/pack/wallpapersislamici6</a><br><a";
		*/
	
		
	}

}
