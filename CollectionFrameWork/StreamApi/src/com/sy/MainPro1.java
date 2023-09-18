package com.sy;

public class MainPro1 {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 2000; i++) {
            int rev = 0;
            int n = i;
            int temp=i;
          
            while (temp> 0) {
                int rem = temp % 10;
                rev = (rev * 10) + rem;
                temp = temp / 10;
            }
            if (n == rev) {
                count++;
            }
        }

        System.out.println(count);
    }
}
