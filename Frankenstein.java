
/**
 * Write a description of class Frankenstein here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
                             
    String[] randomResponses = {
    "Tell me more of that which you speak.",
    "I do not understand the intent of your speech.",
    "Elaborate on your subject.",
    "I am intrigued, please do tell me more",
    "How might you follow through with this?",
    "Why does this subject matter interest your mind?",
    "You are of of the best conversationalists, please tell me more of that which you speak.",
    "I must learn more about this subject matter."
    };
                             
    public Frankenstein()
    {
        int x=5;
    }
    
    public int findKeyword(String statement)
    {
        
        for (int i=0; i<keywords.length; i++)
        {
            if (statement.toLowerCase().indexOf(keywords[i])>0)
            {
                return i;
            }
        }
        return -1;
        
    }
    
    public String getRandomResponse(){
        int randnum = (int)(Math.random()*8);
        return randomResponses[randnum];
    }
    
    public String returnResponse(String statement) {
        if (findKeyword(statement)>0) {
            return responses[findKeyword(statement)];
        }
        
        return getRandomResponse();
    }
    
    
}
