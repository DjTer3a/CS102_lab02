
public class WordSearch extends HTMLFilteredReader {
        public WordSearch (String url){
            super(url);
        }
   
        public void check(String word){
            String text = super.getPageContents();
            int counter = 0;

            if(text.contains(word)){
                for(int i = 0;  i<(text.length()-word.length()); i++ ){
                if(text.substring(i, i+word.length()).equals(word)){
                    
                    counter++;
                    int idx = i;
                    System.out.println("Found the word ("+word+") at the index "+ idx + " and ends at the index of "+ (idx+word.length()-1)   );
                }
                }
                System.out.println("The word was repeated this many times:-"+counter);
            }
            else{
                System.out.println("Word not found in the text!!");
            }
        
    
        }

 }

    
    
