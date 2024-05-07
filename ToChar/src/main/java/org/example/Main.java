package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name="raghusaiVEMURi";
StringBuilder builder=new StringBuilder();
        char[] c=name.toCharArray();
        for(int i=0,l=c.length;i<l;++i)
        {
            boolean conditon=true;
            if (Character.isLowerCase(c[i]))
            {
                conditon=false;
                char res= (char) (c[i]-32);
                builder.append(res);
            }
            if(conditon)
            {
                builder.append(c[i]);
            }
        }
        System.out.print(builder);
    }
}
