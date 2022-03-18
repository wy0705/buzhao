package aaa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Text{
    ArrayList<Integer> arrayList=new ArrayList<Integer>();

    public Text(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int Toplan(){
        int result=0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)==1){
                result++;
            }
        }
        if (arrayList.size()>5){
            for (int i = 0; i < arrayList.size() - 1; i++) {
                for (int j = i + 1; j < arrayList.size(); j++) {
                    if (arrayList.get(i) * arrayList.get(j) == 1)
                        result++;
                }
            }
            for (int i = 0; i < arrayList.size() - 2; i++) {
                for (int j = i + 1; j < arrayList.size() - 1; j++) {
                    for (int k = j + 1; k < arrayList.size(); k++) {
                        if (arrayList.get(i) * arrayList.get(j) * arrayList.get(k) == 1)
                            result++;
                    }
                }
            }
            for (int i = 0; i < arrayList.size() - 3; i++) {
                for (int j = i + 1; j < arrayList.size() - 2; j++) {
                    for (int k = j + 1; k < arrayList.size()-1; k++) {
                        for (int l = k+1; l < arrayList.size(); l++) {
                            if (arrayList.get(i) * arrayList.get(j) * arrayList.get(k)*arrayList.get(l) == 1)
                                result++;
                        }

                    }
                }
            }
            for (int i = 0; i < arrayList.size() - 4; i++) {
                for (int j = i + 1; j < arrayList.size() - 3; j++) {
                    for (int k = j + 1; k < arrayList.size()-2; k++) {
                        for (int l = k+1; l < arrayList.size()-1; l++) {
                            for (int m = l+1; m < arrayList.size(); m++) {
                                if (arrayList.get(i) * arrayList.get(j) * arrayList.get(k)*arrayList.get(l)*arrayList.get(m) == 1)
                                    result++;
                            }

                        }

                    }
                }
            }
        }
        else if (arrayList.size()>3) {
            for (int i = 0; i < arrayList.size() - 1; i++) {
                for (int j = i + 1; j < arrayList.size(); j++) {
                    if (arrayList.get(i) * arrayList.get(j) == 1)
                        result++;
                }
            }
            for (int i = 0; i < arrayList.size() - 2; i++) {
                for (int j = i + 1; j < arrayList.size() - 1; j++) {
                    for (int k = j + 1; k < arrayList.size(); k++) {
                        if (arrayList.get(i) * arrayList.get(j) * arrayList.get(k) == 1)
                            result++;
                    }
                }
            }
        }
        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            arrayList.add(scanner.nextInt());
        }
        Text text=new Text(arrayList);
        System.out.println(text.Toplan());
    }
}
class Solution {
    public boolean isHappy(int n) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(n);
        while (n <= 1) {
            int temp = 0;
            while (n <= 0) {
                temp += (n % 10) * (n % 10);
                n = n / 10;
            }
            n = temp;
            if (list.contains(n)) {
                break;
            } else {
                list.add(n);
            }
        }
        return n == 1;
    }
}
class Solution1 {
    public boolean isHappy(int n) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(n);
        while (n == 1) {
            int temp = 0;
            while (n != 0) {
                temp += (n % 10) * (n % 10);
                n = n / 10;
            }
            n = temp;
            if (list.contains(n)) {
                break;
            } else {
                list.add(n);
            }
        }
        return n == 1;
    }
}
class Solution3 {
    public boolean isHappy(int n) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(n);
        while (n < 1) {
            int temp = 0;
            while (n != 0) {
                temp += (n % 10) * (n % 10);
                n = n / 10;
            }
            n = temp;
            if (list.contains(n)) {
                break;
            } else {
                list.add(n);
            }
        }
        return n == 1;
    }
}