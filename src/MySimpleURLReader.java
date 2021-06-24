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


import cs1.SimpleURLReader;


public class MySimpleURLReader extends SimpleURLReader{
    String url ="";


    //Empty constructor
    public MySimpleURLReader(String url){
        super(url);
        this.url =url;
    }


    /**
     * method to get the URL.
     *  @return String url  
     */
    public String getUrl(){
        return url;
    }


    /**
     * method to get the name of the site.
     *  @return String name of the site  
     */
    public String getName(){
        int idx = url.lastIndexOf('/');
        int len = url.length();
        String name;
        name =url.substring(idx+1, len);
        return name;
    }


    /**
     * method to get the number of CSS links in the site.
     *  @return int count  
     */
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


    /**
     * method to get the number of lines in the site.
     *  @return int lineCount  
     */
    public int getLineCount(){
        int lineCount;
        lineCount = super.getLineCount();
        
        return lineCount;
    }
    

    /**
     * method to get the page contents of the site with html code.
     *  @return String PageContent  
     */
    public String getPageContents(){
        String PageContent;
        PageContent = super.getPageContents();
        return PageContent;
    }
    

}
