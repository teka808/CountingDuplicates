package co.kr.ibeauty.codewars;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        String dublicates = "";
        char[] s = text.toLowerCase().toCharArray();
        for(int i=0; i<s.length; i++){
            for(int j=i+1; j<s.length; j++){
                if(s[i] == s[j]){
                    if(!dublicates.contains(String.valueOf(s[j])))
                        dublicates += s[j];
                }
            }
        }
        return dublicates.length();
    }
}
