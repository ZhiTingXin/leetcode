public class theMaxLengthOfSubstring {
    public int lengthOfLongestSubstring(String s) {
        //�ҵ��㷨����һ��ʱ��̫��
//        HashMap hash = new HashMap();
//        Integer i = 0;
//        if (s.length()==0){
//            return 0;
//        }else {
//            char[] m = s.toCharArray();
//            int[] len = new int[m.length];
//            for (int j = 0; j < m.length; j++) {
//                hash.clear();
//                i = 0;
//                for (int k = j; k < m.length; k++) {
//                    if (!hash.containsValue(m[k])) {
//                        hash.put(i, m[k]);
//                        i++;
//                    } else {
//                        break;
//                    }
//                }
//                len[j] = hash.size();
//            }
//            int max = len[0];
//            for (int num = 1; num < s.length(); num++) {
//                if (len[num] > max) {
//                    max = len[num];
//                }
//            }
//
//            return max;
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
                //j��Զ��ǵĶ��ǲ��ظ�char�Ŀ�ʼλ�ã�i��ʾ�ǽ���char��λ��
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
        }

    public static void main(String args[]){
        theMaxLengthOfSubstring s = new theMaxLengthOfSubstring();
        System.out.print(s.lengthOfLongestSubstring("abcdfadmdn"));
    }
}
