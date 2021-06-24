/**
 * Lab02 Instructions found on moodle
 * 
 * Style guidlines URL:-
 * http://www.cs.bilkent.edu.tr/~adayanik/cs101/practicalwork/styleguidelines.htm
 * 
 * 
 * @author Mostafa Higazy
 * @version 24/06/2021
 */


public class HtmlScraperTest extends WordSearch {
    public static void main(String[] args){

            //testing MySimpleURLReader
            System.out.println(" // PART A. Testing MySimpleURLReader");
            MySimpleURLReader obj = new MySimpleURLReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
            System.out.println(obj.getPageContents());
            
            //testing MySimpleURLReader
            System.out.println(" // PART B. Testing MySimpleURLReader");
            System.out.println(obj.getLineCount());
            System.out.println(obj.getUrl());
            System.out.println(obj.getName());

            //testing MySimpleURLReader
            System.out.println(" // PART C. Testing MySimpleURLReader");
            System.out.println(obj.getNumberOfCSSLinks());

            //testing HTMLFilteredReader
            System.out.println(" // PART D. Testing HTMLFilteredReader");
            HTMLFilteredReader obj1 = new HTMLFilteredReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
            System.out.println(obj1.getPageContents());


            //testing WordSearch
            System.out.println(" // PART E. Testing WordSearch");
            WordSearch obj2 = new WordSearch("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
            obj2.check("Turkey");
            obj2.check("Ankara");
            obj2.check("Capital");
            obj2.check("Mordor");
            
        }

}
