package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char[] c={'a','b','c','d','e'};
        for(int i=0,l=c.length;i<l;++i)
        {
            char res= (char) (c[i]-32);
            System.out.println(res);
        }
    }
}