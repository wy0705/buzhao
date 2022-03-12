package aaa;

import java.util.ArrayList;
import java.util.Scanner;
class Cai{
    private int n;
    private int m;
    private ArrayList<Integer> arrayList=new ArrayList<Integer>();

    public Cai(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public void diancai(int n){
        //ArrayList<Integer> cc=spit(s);
        arrayList.add(n);
    }
    public int toplan(){
        int t=arrayList.size()/2+1;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i+1; j < arrayList.size(); j++) {
                if (arrayList.get(i)==arrayList.get(j)) {
                    t--;
                    if (i%2==1){
                        i++;
                    }
                }
            }
        }
        return t;
    }
    public ArrayList<Integer> spit(String s){
        ArrayList<Integer> cc=new ArrayList<Integer>();
        char result[]=s.toCharArray();
        for (int i = 0; i < result.length; i++) {
            cc.add(Integer.valueOf(result[i]));
        }
        return cc;
    }
}
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Cai cai = new Cai(n, m);
        for (int i = 0; i < cai.getN() * 2; i++) {
            cai.diancai(scanner.nextInt());
        }
        System.out.println(cai.toplan());

    }

}
