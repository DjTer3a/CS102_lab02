import cs1.SimpleURLReader;

public class MySimpleURLReader extends SimpleURLReader{
    String url ="";


    //Constructor
    public MySimpleURLReader(String url){
        super(url);
        this.url =url;
    }


    //Methods
    public String getUrl(){
        return url;
    }

    public int getLineCount(){
        int lineCount;
        lineCount = super.getLineCount();
        
        return lineCount;
    }   
public static void main(String[] args){
        HtmlScraperTest obj = new HtmlScraperTest("http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt");
        System.out.println(obj.getLineCount());
    }
}
