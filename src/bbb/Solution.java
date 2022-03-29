package bbb;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        String pattern = "abba";
        String str = "北京 杭州 杭州 北京";
        System.out.println(wordPattern(pattern, str));
    }

    public static boolean wordPattern(String pattern, String str) {
        boolean target = true;
        HashMap<Character, String> hashMap = new HashMap<>();
        char[] chararray = pattern.toCharArray();
        String[] s1 = str.split(" ");
        if (chararray.length <= s1.length) {
            for (int i = 0; i < chararray.length; i++) {
                hashMap.put(chararray[i],s1[i]);
            }
        }
        if (chararray.length <= s1.length) {
            for (int i = 0; i < chararray.length; i++) {
                if (hashMap.get(chararray[i])!=hashMap.put(chararray[i],s1[i])){
                    target=false;
                }
            }
        }
        return target;
    }
    public boolean hasCycle(ListNode head) {
        boolean target=false;
        ListNode n1=head;
        ListNode n2=n1.next;
        while (n2!=null){
            if (n2.next==n1){
                target=true;
                break;
            }
            n1=n1.next;
        }
        return target;
    }
}
