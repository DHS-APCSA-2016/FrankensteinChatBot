
/**
 * Will look through the users responce and give an apropriate response.
 * 
 * @author Jacob Bratsman and Tim Degerness 
 * @version 11/27/2016
 */
public class Frankenstein
{
 
    String[] keywords = {"elizabeth", "william", "henry", "justine", "geneva", "switzerland", "science", "frankenstein", "mary", "shelley", "sad", "depressed", "london", "england", "monster",
                            "wedding", "weather", "rain", "revenge", "appearance", "looks"};
        
    String[] responses = {"I know of Elizabeth Lavenza--my more than sister--the beautiful and adored companion of all my occupations and my pleasures",
                             "Poor William! Who that had seen him bright and joyous in his young beauty, but must weep over his untimely loss!", 
                             "Have my murderous machinations deprived you also, my dearest Henry, of life? Two I have already destroyed; other victims await their destiny",
                             "When I reflect on the miserable death of Justine Moritz, I no longer see the world and its works as they before appeared to me. She was innocent.",
                             "I must return to Geneva without delay to watch over the lives of those I so fondly love",
                             "I am by birth a Genevese, and my family is one of the most distinguished of that republic.",
                             "The ancient teachers of this science, promised impossibilities, and performed nothing. The modern masters promise very little; they now that the metals cannot be transmuted, and that elixir of life is a chimera",
                             "Frankenstein is my name. Victor Frankenstein. I am not the monster that you might imagine, but I certainly am a monster of a more despciable kind.",
                             "That name sounds familiar... However I do not recall where I have heard it. Do you know what it is from?",
                             "That name sounds familiar... However I do not recall where I have heard it. Do you know what it is from?",
                             "Sadness is a terrible thing. I have experienced it many times in my life, and expect to experience it much more. There is little you can do to fight its ill effects.",
                             "Sadness is a terrible thing. I have experienced it many times in my life, and expect to experience it much more. There is little you can do to fight its ill effects.",
                             "Ah England. The colleges are ancient and picturesque; the streets are almost magnificent; and the lovely Isis, which flows beside it through meadows of exquisite verdure, is spread forth into a placid expanse of waters, which reflects its majestic assemblage of towers, and spires, and domes, embosomed among aged trees.",
                             "Ah England. The colleges are ancient and picturesque; the streets are almost magnificent; and the lovely Isis, which flows beside it through meadows of exquisite verdure, is spread forth into a placid expanse of waters, which reflects its majestic assemblage of towers, and spires, and domes, embosomed among aged trees.",
                             "I know the monster of which you speak. He is a truly vile creature, heartless and unfeeling. He ruined my life and will ruin many others with his evil ways.",
                             "My own wedding night was a nightmare. Let us not speak of such things.",
                             "My mood has always been influenced by the weather. Rain is a particular form that has been ever-present in my dreary life.",
                             "My mood has always been influenced by the weather. Rain is a particular form that has been ever-present in my dreary life.",
                              "Revenge? I need revenge. The monster killed my friends, my family.. He is a terror to us all and must be destroyed.",
                             "The monster had the most grotesque appearance I have ever laid eyes on.. he is truly a monster. Elizabeth was much more beautiful and thus was treated much better.",
                             "The monster had the most grotesque appearance I have ever laid eyes on.. he is truly a monster. Elizabeth was much more beautiful and thus was treated much better."};
                             
    String[] randomResponses = {"Tell me more of that which you speak.",
                                    "I do not understand the intent of your speech.",
                                    "Elaborate on your subject.",
                                    "I am intrigued, please do tell me more",
                                    "How might you follow through with this?",  
                                    "Why does this subject matter interest your mind?",
                                    "You are of of the best conversationalists, please tell me more of that which you speak.",
                                    "I must learn more about this subject matter."};              
    public Frankenstein(){}
    /**
     * Will find the position of a string within a string
     * 
     * @param String where you are finding the keyword
     * @param String of the keyword you are looking for
     * @return The index of the keyword you are trying to find
     */
    private int findKeyword(String statement, String goal, int startPos)
    {
        String phrase = statement.trim();
        //  The only change to incorporate the startPos is in the line below
        int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
        
        //  Refinement--make sure the goal isn't part of a word 
        while (psn >= 0) 
        {
            //  Find the string of length 1 before and after the word
            String before = " ", after = " "; 
            if (psn > 0)
            {
                before = phrase.substring (psn - 1, psn).toLowerCase();
            }
            if (psn + goal.length() < phrase.length())
            {
                after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
            }
            
            //  If before and after aren't letters, we've found the word
            if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
                    && ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
            {
                return psn;
            }
            
            //  The last position didn't work, so let's find the next, if there is one.
            psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
            
        }
        
        return -1;
    }
    /**
     * Generates a random number to choose from the random responses
     * 
     * @return Returns a string with a random response
     */
    public String getRandomResponse(){
        int randnum = (int)(Math.random()*8);
        return randomResponses[randnum];
    }
    /**
     * Will transpose a given responce with the phrase I want
     * 
     * @param String input that is to be transposed
     * @return Returns the transposed statement
     */
    private String transformIWantToStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement.length() - 1);
        }
        int psn = findKeyword (statement, "I want to", 0);
        String restOfStatement = statement.substring(psn + 9).trim();
        return "I wanted to create life, but my ambitions turned into chaos, why would you want " + restOfStatement + "?";
    }
    /**
     * Will transpose a given responce with the phrase you ___ me
     * 
     * @param String input that is to be transposed
     * @return Returns the transposed statement
     */
    private String transformYouMeStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement.length() - 1);
        }
        
        int psnOfYou = findKeyword (statement, "you", 0);
        int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);
        
        String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
        return "What makes you think that I " + restOfStatement + " you? The only thing on my mind is my creation who has been tormenting me since his creation.";
    }
    /**
     * Will transpose a given responce with the phrase I ___ you
     * 
     * @param String input that is to be transposed
     * @return Returns the transposed statement
     */
    private String transformIYouStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement.length() - 1);
        }
        
        int psnOfYou = findKeyword (statement, "I", 0);
        int psnOfMe = findKeyword (statement, "you", psnOfYou + 2);
        
        String restOfStatement = statement.substring(psnOfYou + 2, psnOfMe).trim();
        return "I don't see why you would " + restOfStatement + " me, I have done everything wrong.";
    }
    /**
     * Generates the response by looking at the user statement or going to a random responce
     * 
     * @param String input of the user's statement
     * @return Returns the response to give the user
     */
    public String returnResponse(String statement) {
        if (statement.length() == 0)
        {
            return "Say something, please.";
        }
        
        for(int i = 0; i < keywords.length; i++)
        {
            if (findKeyword(statement.toLowerCase(),keywords[i],0) >= 0) {
                return responses[i];
            }
            else if (findKeyword(statement, "I want to", 0) >= 0)
            {
                return transformIWantToStatement(statement);
            }


            else
            {
                // Look for a two word (you <something> me)
                // pa   ttern
                int psn = findKeyword(statement, "you", 0);
                int psn2 = findKeyword(statement, "I", 0);


                if (psn >= 0  && findKeyword(statement, "me", psn) >= 0)
                {
                    return transformYouMeStatement(statement);
                }
                else if (psn2 >= 0 && findKeyword(statement, "you", psn2) >= 0)
                {
                    return transformIYouStatement(statement);
                }
            }
        }
        
        return getRandomResponse();
    }
    
    
}
