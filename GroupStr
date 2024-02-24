class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String ele : strs)
        {
            char ch[] = ele.toCharArray();
            Arrays.sort(ch);
            String ss = new String(ch);
            
            map.putIfAbsent(ss, new ArrayList<>());
            map.get(ss).add(ele);
        }

        return new ArrayList<>(map.values());


    }
}
