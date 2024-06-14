package recursion.basic.backtrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyPadComboPassBackTrack {
    public static void main(String[] args) {
        String question="143";
        Map<Character,String> numAlphabetMap=new HashMap<>();
        numAlphabetMap.put('1',"abc");
        numAlphabetMap.put('2',"def");
        numAlphabetMap.put('3',"ghi");
        numAlphabetMap.put('4',"jkl");
        numAlphabetMap.put('5',"mno");
        numAlphabetMap.put('6',"pqrs");
        numAlphabetMap.put('7',"tuv");
        numAlphabetMap.put('8',"wxyz");
        List<String> ans=getKeyPadCombinations(question,0,new StringBuilder(),new ArrayList<String>(),numAlphabetMap);
        System.out.println(ans.size());
    }

    private static List<String> getKeyPadCombinations(String question, int curIndex, StringBuilder currentAns, List<String> finalAns, Map<Character, String> numAlphabetMap) {
        if(curIndex>=question.length()) {
            finalAns.add(currentAns.toString());
            return finalAns;
        }
        String alphabetsForCurrentNumber=numAlphabetMap.get(question.charAt(curIndex));
        for(int i=0;i<alphabetsForCurrentNumber.length();i++){
            currentAns.append(alphabetsForCurrentNumber.charAt(i));
            getKeyPadCombinations(question,curIndex+1,currentAns,finalAns,numAlphabetMap);
            currentAns.deleteCharAt(currentAns.length()-1);

        }
        return finalAns;

    }
}
