import java.util.*;

public class SortFreqStr {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        String str;
        System.out.println("Enter the String to be operated");
        str=myObj.nextLine();
        List<String> storeStr = storeString(str);
        System.out.println("The Elements Entered are = "+storeStr);
        sortedWordsInString(storeStr);
        freqOfWords(storeStr);
    }

    public static List storeString(String str){
        String[] splittedString = str.split(" ");
        List<String> listOfStr = new ArrayList<String>();

        for(int i=0;i<splittedString.length;i++)
        {
            listOfStr.add(splittedString[i]);
        }

        return listOfStr;
    }

    public static void sortedWordsInString(List lt)
    {
        Collections.sort(lt);
        System.out.println("Elements of array in sorted Order :"+lt);
    }
    public static void freqOfWords(List lt)
    {
        Set<String> uniqueSet = new HashSet<String>(lt);
        for(String temp:uniqueSet){
            System.out.println(temp+" : "+Collections.frequency(lt,temp) );
        }
    }

}
