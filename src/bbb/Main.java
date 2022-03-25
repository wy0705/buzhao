package bbb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


class Text{
    public void test(ArrayList<String> arrayList){
        String s=null;
        for (int i = 0; i < arrayList.size(); i++) {
            s= arrayList.get(i);
            if (s.length()>12||s.length()<6){
                System.out.println("illegal length");
                continue;
            }
            if (!isEnglish(s)){
                System.out.println("illegal charactor");
                continue;
            }
            HashMap hashMap=new HashMap();
            boolean isre=true;
            for (int j = 0; j <= i; j++) {
                if (hashMap.put(arrayList.get(j),j)!=null) {
                    System.out.println("acount existed");
                    isre=false;
                    break;
                }
            }
            if (!isre)
                continue;
            System.out.println("registration complete");
        }

    }
    public boolean isEnglish(String s){
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i)>='A'&&s.charAt(i)<='Z')&&!(s.charAt(i)>='a'&&s.charAt(i)<='z')){
                return false;
            }
        }
        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        for (int i = 0; i < t; i++) {
            arrayList.add(scanner.next());
        }
        Text text=new Text();
        text.test(arrayList);
    }
}
