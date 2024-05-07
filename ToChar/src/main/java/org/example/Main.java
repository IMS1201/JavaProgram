package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static String toUpper(String name) {

        if(name==null)
        {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        char[] c = name.toCharArray();
        for (int i = 0, l = c.length; i < l; ++i) {
            boolean conditon = true;
            if (Character.isLowerCase(c[i]) && Character.isAlphabetic(c[i]) ) {
                conditon = false;
                char res = (char) (c[i] - 32);
                builder.append(res);
            }
            if (conditon) {
                builder.append(c[i]);
            }
        }
       return builder.toString();
    }

    static  boolean checking(String excepted,String result)
    {
        return excepted.equals(result);
    }

    public static void main(String[] args) {
        String excepted1="RAGHUSAIVEMURI";
        String name1 = "raghusaiVEMURi";
       String result1= toUpper(name1);
 System.out.println(checking(excepted1,result1));

        String excepted2 = "";
        String name2=null;
        String result2 = toUpper(name2);
        System.out.println(checking(excepted2,result2));


        String excepted3="RAGHU@123";
        String name3="raghu@123";
        String result3=toUpper(name3);
        System.out.println(checking(excepted3,result3));

        String excepted4="SAI@SAI@123";
        String name4="sai@sai@123";
        String result4=toUpper(name4);
        System.out.println(checking(excepted4,result4));

        String excepted5=" SAI@SAI_123";
        String name5=" sai@Sai_123";
        String result5=toUpper(name5);
        System.out.println(checking(excepted5,result5));

        String excepted6=" SAI@ SAI@123 ";
        String name6=" sai@ SAI@123 ";
        String result6=toUpper(name6);
        System.out.println(checking(excepted6,result6));

        String excepted7="1234";
        String name7="1234";
        String result7=toUpper(name7);
        System.out.println(checking(excepted7,result7));


        ///////////////////these cases are duplicate test cases //////////////////////
        //////////////////////////////////////////////////////////////////////////////
        String excepted11 = "HELLO-WORLD";
        String name11 = "hello-world";
        String result11 = toUpper(name11);
        System.out.println(checking(excepted11, result11));

        String excepted12 = "JAVA_IS_FUN";
        String name12 = "java_is_fun";
        String result12 = toUpper(name12);
        System.out.println(checking(excepted12, result12));

        String excepted13 = "HELLO.WORLD";
        String name13 = "hello.world";
        String result13 = toUpper(name13);
        System.out.println(checking(excepted13, result13));

        String excepted14 = "HELLO123WORLD";
        String name14 = "hello123world";
        String result14 = toUpper(name14);
        System.out.println(checking(excepted14, result14));

        String excepted15 = "HELLO-WORLD123";
        String name15 = "hello-world123";
        String result15 = toUpper(name15);
        System.out.println(checking(excepted15, result15));

    }
}
