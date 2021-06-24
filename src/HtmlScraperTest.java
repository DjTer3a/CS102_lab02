

public class HtmlScraperTest extends WordSearch {
    public static void main(String[] args){
            // HTMLFilteredReader obj = new HTMLFilteredReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
            // System.out.println(obj.getUrl());
            // System.out.println(obj.getName());
            // System.out.println(obj.getUnfilteredPageContents());
            // System.out.println(obj.getLineCount());
            // System.out.println(obj.getPageContents());

            WordSearch obj2 = new WordSearch("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");

            obj2.check("Ankara");
        }

}
