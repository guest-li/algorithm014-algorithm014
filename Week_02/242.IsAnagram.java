public  boolean isAnagram(String s, String t) {
        //长度不相等，则直接返回
        if (s.length()!=t.length()){
        return  false;
        }
        //初始化数据长度（长度为26个基本字符的长度）
        int[] arrs=new int[26];
        for (int i=0;i<s.length();i++){
            //s.charAt(i)为找到字符长度， -'a' 为字符在数组中的位置
        arrs[s.charAt(i) - 'a'] ++;
        arrs[t.charAt(i) - 'a'] --;
        }
        for (int j=0;j<26;j++){
        if (arrs[j]>0) return false;
        }
        return true;
        }
