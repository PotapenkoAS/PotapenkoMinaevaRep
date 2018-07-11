package main.java;

public class Evklid {
    public int nod(int a, int b){
        if (a>=0 && b>=0) {
            if (b == 0) {
                return a;
            } else {
                return nod(b, a % b);
            }
        }
        else return -1;
    }
}
