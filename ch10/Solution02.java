import java.util.*;

public class Solution02 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        List<List<String>> ret = new ArrayList<List<String>>();
        Arrays.sort(strs);
        for(String str : strs) {
            char[] chs = str.toCharArray();
            //use sorted string as key
            Arrays.sort(chs);
            String s = new String(chs);
            if(map.containsKey(s)){
                List list = ret.get(map.get(s));
                list.add(str);
            }else{
                List list = new ArrayList();
                list.add(str);
                ret.add(list);
                //map key to the number of list that stores anagrams.
                map.put(s, ret.size()-1);
            }
        }
        return ret;
    }


    public static void main(String[] args) {
    }

}
