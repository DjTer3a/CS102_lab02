public class HtmlScraperTest extends MySimpleURLReader {
    public static void main(String[] args){
            MySimpleURLReader obj = new MySimpleURLReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
            System.out.println(obj.getUrl());
            System.out.println(obj.getName());
            System.out.println(obj.getUnfilteredPageContents());
            System.out.println(obj.getLineCount());
        }

}
