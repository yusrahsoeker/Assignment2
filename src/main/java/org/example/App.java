package org.example;

/**
 * Hello world!
 *
 */
public class App 
{

    public void main(String[] args)
    {
        equalityTest();
        identityTest();
        failTest();
    }

    //equality test
    public String equalityTest() {
        String str1 = "Amy";
        String srt2 = "Yusrah";

        if(str1.equals(srt2)) {
            return "true";
        } else {
            return "false";
        }
    }

    //identity test
    public String identityTest(){
        int num1 = 1;
        int num2 = 3;
        if (num1 == num2 ) {
            return "true";
        } else {
            return "false";
        }
    }
    //fail test
    public static void failTest(){
        int num1 = 1;
        int num2 = 3;
        int sum = 7;

        sum = num1 + num2;
    }
}
