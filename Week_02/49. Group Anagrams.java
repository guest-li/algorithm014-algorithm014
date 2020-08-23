class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists=new ArrayList<>();
        if (strs==null||strs.length==0) return lists;
        Map<String,List<String>> maps=new HashMap<>();
        for (int i=0;i<strs.length;i++){
            char[] chars=strs[i].toCharArray();
            Arrays.sort(chars);
            String key=String.valueOf(chars);
            if (!maps.containsKey(key)) {
                maps.put(key, new ArrayList<>());
            }
            maps.get(key).add(strs[i]);
        }
        return new ArrayList<>(maps.values());
    }
}