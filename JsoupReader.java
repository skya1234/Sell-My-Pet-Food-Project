import java.io.IOException;  
import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document;  

public class JsoupReader {
    public static void main( String[] args ) throws IOException{  
        Document doc = Jsoup.connect("https://www.ebay.com/urw/Apple-iPhone-XR-64-GB-Black-Unlocked-Dual-SIM-/product-reviews/13023706562?_itm=296269616776").get();  
        String title = doc.title();  
        System.out.println("title is: " + title);  
    }
}
