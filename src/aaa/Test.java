package aaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Numb{
    ArrayList<Integer> arrayList=new ArrayList<Integer>();
    public String numb(int n){
        String result="no";
        int t=0;
        arrayList.clear();
        spit(n);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)==1)
                t++;
        }
        if (n%11==0||t>=2){
            result="yes";
        }
        return result;
    }
    public ArrayList<Integer> spit(int num){
        while (num/10!=0) {
            arrayList.add(num % 10);
            num=num/10;
        }
        arrayList.add(num);
        return arrayList;
    }
}
public class Test {
    public static void main(String[] args) {
        Numb numb=new Numb();
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int nums[]=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(numb.numb(nums[i]));
        }
    }
}
