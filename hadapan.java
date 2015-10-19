/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webscrapping;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class hadapan {
    public static void main (String[] args){
        Document doc;
        
        try {
              doc = Jsoup.connect("http://fskm.uitm.edu.my/v1/fakulti/staff-directory/academic/1097.html").get();
              
              Element tajukLaman = doc.select("#ru-mainnav").first();
            String tajuk;
              System.out.println("Tajuk Laman Web:"+ tajuk);
              Elements bahasa= doc.select("#ru-mainnav");
              
              for (Element BahasaElement : bahasa){
                  System.out.println("Bahasa digunakan:"+BahasaElement.text());
              }
             
              
    } catch(IOException e){
        
    }
    }
    
}
