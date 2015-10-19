/* Assignment 2 - WebScrapping using java
 * Information needed:  Webscrapping staff directory fksm.uitm.edu.my
 */

/* Author : Rosmaini Dollah
* ID : 2014845352
* Github ID: rosmaini2014845352

*/
package webscrapping;


import java.io.IOException;
import java.util.logging.Level;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.Jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class WebScrapping {

   
    public static void main(String[] args) throws IOException {
        Document doc;
        
        try {
              doc = Jsoup.connect("http://fskm.uitm.edu.my/v1/fakulti/staff-directory/academic/1097.html").get();
              
              String tajuk = doc.title();
              System.out.println("\nTajuk Laman Web : "+ tajuk);
    
              org.jsoup.select.Elements urls = doc.select("a");
              
              for (Element url: urls){
                  //to get the value of url attributes
                  System.out.println("\nURL <a>"+url.attr("href"));
                  System.out.println ("\nNama <a>"+url.text());
                 }
              
    } catch(IOException e){
        
    }
}}
