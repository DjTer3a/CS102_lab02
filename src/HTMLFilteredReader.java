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



public class HTMLFilteredReader extends MySimpleURLReader{
    String url ="";


    //Empty Constructor
    public HTMLFilteredReader(String url) {
        super(url);
        this.url =url;
    }

    /**
     * method to return page contents without html code.
     *  @return String Filtered   
     */
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
}
