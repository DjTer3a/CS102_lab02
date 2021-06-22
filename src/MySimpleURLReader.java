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

    public String getName(){
        int idx = url.lastIndexOf('/');
        int len = url.length();
        String name;
        name =url.substring(idx+1, len);
        return name;
    }

    public String getPageContents(){
        String pageContent;
        pageContent = super.getPageContents();
        return pageContent;
    }

    public int getLineCount(){
        int lineCount;
        lineCount = super.getLineCount();
        
        return lineCount;
    }   
public static void main(String[] args){
        HtmlScraperTest obj = new HtmlScraperTest("http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt");
        System.out.println(obj.getUrl());
        System.out.println(obj.getName());
        System.out.println(obj.getPageContents());
        System.out.println(obj.getLineCount());
    }
}
