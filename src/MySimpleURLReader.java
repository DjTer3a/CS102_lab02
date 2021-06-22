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
        String UnfilteredPageContent;
        String Filtered= "";
        UnfilteredPageContent = super.getPageContents();
        boolean check =true;
        for(int i =0; i< UnfilteredPageContent.length(); i++){
            if(UnfilteredPageContent.charAt(i) == '<'){
                check = false;
            }
            else if(UnfilteredPageContent.charAt(i) == '>'){
                check =true;
            }
            else if (check == true){
                Filtered+=UnfilteredPageContent.charAt(i);
            }
            else{
                check = false;
            }
        }
        return Filtered;
    }

    public int getNumberOfCSSLinks(){
        int count;
        String UnfilteredPageContent;
        UnfilteredPageContent = super.getPageContents();
        count = 0;
        if(UnfilteredPageContent.contains(".css")){
            for(int i =0; i< UnfilteredPageContent.length(); i++){
                        if(UnfilteredPageContent.charAt(i) == '.' && UnfilteredPageContent.charAt(i+1) == 'c' && UnfilteredPageContent.charAt(i+2) == 's' && UnfilteredPageContent.charAt(i+3) == 's'){
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
    
    public String getUnfilteredPageContents(){
        String UnfilteredPageContent;
        UnfilteredPageContent = super.getPageContents();
        return UnfilteredPageContent;
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
