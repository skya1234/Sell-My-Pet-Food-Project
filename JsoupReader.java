import java.io.File;
import java.io.IOException;  
import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.*;

public class JsoupReader {
    public static void main( String[] args ) throws IOException{  
        File htmlWebPage = new File("reviewspage.txt");
        Document doc = Jsoup.parse(htmlWebPage, "UTF-8");
        Elements reviewTextList = doc.getElementsByAttributeValue("data-test", "review-card--text");
        Elements reviewNameList = doc.getElementsByAttributeValue("data-test", "review-card--username");
        int numReviews = 0;
        for (Element obj : reviewTextList) {
            numReviews +=1;
            System.out.println("Review Number " + numReviews + ": " + obj.text());
            
        }
    }
}
