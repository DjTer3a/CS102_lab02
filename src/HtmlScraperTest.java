

public class HtmlScraperTest extends WordSearch {
    public static void main(String[] args){


            System.out.println(" // PART A. Testing MySimpleURLReader");
            MySimpleURLReader obj = new MySimpleURLReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
            System.out.println(obj.getPageContents());
            
            
            System.out.println(" // PART B. Testing MySimpleURLReader");
            System.out.println(obj.getLineCount());
            System.out.println(obj.getUrl());
            System.out.println(obj.getName());


            System.out.println(" // PART C. Testing MySimpleURLReader");
            System.out.println(obj.getNumberOfCSSLinks());


            System.out.println(" // PART D. Testing MySimpleURLReader");
            HTMLFilteredReader obj1 = new HTMLFilteredReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
            System.out.println(obj1.getPageContents());


            System.out.println(" // PART E. Testing MySimpleURLReader");
            WordSearch obj2 = new WordSearch("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
            obj2.check("Turkey");
            obj2.check("Ankara");
            obj2.check("Capital");
            obj2.check("Mordor");
            
        }

}
