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

 
public class WordSearch extends HTMLFilteredReader {

        //Empty Constructor
        public WordSearch (String url){
            super(url);
        }
   

        /**
         * method to check page if the site contains the word.
         *  @return void   
         */
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

    
    
