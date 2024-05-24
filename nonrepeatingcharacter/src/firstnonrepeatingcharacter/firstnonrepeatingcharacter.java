package firstnonrepeatingcharacter;
import java.util.LinkedHashMap;
import java.util.Map;

public class firstnonrepeatingcharacter
   {

    public static char findFirstNonRepeatingChar(String str)
       {
       
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();        
        		for (char ch : str.toCharArray())
        		{
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet())
        {
            if (entry.getValue() == 1)
            {
                return entry.getKey();
            }
        }
        return '\0';  
    }

    public static void main(String[] args) {
        String str = "pooja";
        char result = findFirstNonRepeatingChar(str);

        if (result != '\0')
        {
            System.out.println("The first non-repeating character is: " + result);
        }
        else
        {
            System.out.println("No non-repeating character found.");
        }
    }
}
