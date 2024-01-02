import java.io.File;
import java.util.Scanner;

/* KJ, Allen, & Krish
 * Reading Level -- Returns the level of the text from given text file
 * 10/18/23
 * 5th Period
 */

public class Main {
    // make sure you upload a file into replit called samplePassage.txt with the text you want to use!
    private static final String fileName = "samplePassage.txt";

    public static void main(String[] args) {
      // declare variables
      String textFile = textToString(fileName);
      int numOfWords = 0;
			
			int numOfKindergarten = 0;
      int numOfElementary = 0;
      int numOfMiddle = 0;
			int numOfHigh = 0;
      int numOfAdvanced = 0;

			String kindergartenWords = "";
			String elementaryWords = "";
			String middleWords = "";
			String highWords = "";
			String advancedWords = "";

      double averageWord = 0;
    
      

			//Before running, replace all punctuation with whitespace
      //1: get the index of the first letter of the first word (x)
			//2: run until whitespace and get that index 
			//3: store that value in a variable
			//4: y - x to get the length of the word and sort accordingly
			//5: run again from the beginning of next word

			String newTextFile = removePunctuation(textFile);
			int begChar = 0;
			
      for(int i = 0; i <= newTextFile.length() - 1; i++){

				if(Character.isWhitespace(newTextFile.charAt(i))){
					numOfWords++;
					String word = new String(newTextFile.substring(begChar, i));

					if (word.length() <= 4){
						numOfKindergarten++;
						kindergartenWords += " " + word;
					}
					else if (word.length() > 4 && word.length() <= 6){
						numOfElementary++;
						elementaryWords += " " + word;
					}
					else if (word.length() > 6 && word.length() <= 10){
						numOfMiddle++;
						middleWords += " " + word;
					}
					else if (word.length() > 10 && word.length() <= 14){
						numOfMiddle++;
						highWords += " " + word;
					}
					else {
						numOfAdvanced++;
						advancedWords += word;
					}
					begChar = i + 1;
				}
				else {continue;}
				
			}

			//Print out the result

      System.out.println("---------- ORIGINAL TEXT ----------");
      System.out.println(textFile);

      System.out.println("\n\n--------- Level Breakdowns ---------");
      System.out.println("This text contains:");
      System.out.println("    - " + numOfKindergarten + " kindergarden-level words.");
      System.out.println("    - " + numOfElementary + " elementary-level words.");
      System.out.println("    - " + numOfMiddle + " middle-level words.");
      System.out.println("    - " + numOfHigh + " high-level words.");
      System.out.println("    - " + numOfAdvanced + " advanced-level words.\n");

      
      System.out.println("\n\n------ Words In Each Category ------");
      if (numOfKindergarten > 0){System.out.println("Kindergarden-level words: " + kindergartenWords + "\n");}
      
      if (numOfElementary > 0){System.out.println("Elementary-level words: " + elementaryWords + "\n");}
      
      if (numOfMiddle > 0){System.out.println("Middle-level words: " + middleWords + "\n");}
      
      if (numOfHigh > 0) {System.out.println("High-level words: " + highWords + "\n");}
      
      if (numOfAdvanced > 0) {System.out.println("Advanced-level words: " + advancedWords + "\n");}      


       /*
      averageWord = ((double) numOfKindergarten + numOfElementary + numOfMiddle + numOfHigh + numOfAdvanced) / 5;

      if (averageWord <= 4) {System.out.println("This text is of the kindergarten-level.");}
      else if (averageWord <= 6) {System.out.println("This text is of the elementary school level.");}
      else if (averageWord <= 10) {System.out.println("This text is of the middle school level.");}
      else if (averageWord <= 14) {System.out.println("This text is of the high school level.");}
      else {System.out.println("This text is of the advanced level.");}
      */

      /*
      System.out.println("Let's take a look at the level of words used in the text!");

      System.out.println("The kindergarden to 5th grade level words used in the text are: " + kindergartenWords);

      System.out.println("")

      System.out.println("K5: " + kindergartenWords + " elementary: " + elementaryWords + " middle: " + middleWords + " high: " + highWords + " advanced: " + advancedWords); 

      System.out.println("Num K5: " + numOfKindergarten + " Num elementary: " + numOfElementary + " Num middle: " + numOfMiddle + " Num high: " + numOfHigh + " Num advanced: " + numOfAdvanced);
      */
      
   
		}





  
  

    // ------------------- PROVIDED HELPER METHODS -------------------
    // ------------ DO NOT EDIT ANYTHING BELOW THIS POINT ------------

    /**
     * returns a string containing all of the text in fileName (including punctuation),
     * with words separated by a single space
     */
    private static String textToString(String fileName) {
        String temp = "";
        try {
            Scanner input = new Scanner(new File(fileName));

            //add 'words' in the file to the string, separated by a single space
            while (input.hasNext()) {
                temp = temp + input.next() + " ";
            }
            input.close();

        } catch (Exception e) {
            System.out.println("Unable to locate " + fileName);
        }
        //make sure to remove any additional space that may have been added at the end of the string.
        return temp.trim();
    }

    /**
     * Returns the ending punctuation of a string, or the empty string if there is none
     */
    public static String getPunctuation(String word) {
        String punc = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            if (!Character.isLetterOrDigit(word.charAt(i))) {
                punc = punc + word.charAt(i);
            } else {
                return punc;
            }
        }
        return punc;
    }

    /**
     * Returns the word after removing any beginning or ending punctuation
     */
    public static String removePunctuation(String word) {
        while (word.length() > 0 && !Character.isAlphabetic(word.charAt(0))) {
            word = word.substring(1);
        }
        while (word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length() - 1))) {
            word = word.substring(0, word.length() - 1);
        }

        return word;
    }
}
