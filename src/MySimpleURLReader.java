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

    public int getNumberOfCSSLinks(){
        int count;
        String PageContent;
        PageContent = super.getPageContents();
        count = 0;
        if(PageContent.contains(".css")){
            for(int i =0; i< PageContent.length(); i++){
                        if(PageContent.charAt(i) == '.' && PageContent.charAt(i+1) == 'c' && PageContent.charAt(i+2) == 's' && PageContent.charAt(i+3) == 's'){
                            count++;
                        }
                    }

        }
        else{
            count = 0;
        }
        
        return count;
    }

    public int getLineCount(){
        int lineCount;
        lineCount = super.getLineCount();
        
        return lineCount;
    }
    
    public String getPageContents(){
        String PageContent;
        PageContent = super.getPageContents();
        return PageContent;
    }
    


public static void main(String[] args){
        MySimpleURLReader obj = new MySimpleURLReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
        System.out.println(obj.getUrl());
        System.out.println(obj.getName());
        System.out.print(obj.getPageContents());

        System.out.println(obj.getLineCount());
        System.out.println(obj.getNumberOfCSSLinks());
    }
}
