public class HTMLFilteredReader extends MySimpleURLReader{
    String url ="";

    public HTMLFilteredReader(String url) {
        super(url);
        this.url =url;
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
}
