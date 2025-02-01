package org.example.SampleCheck;

public class APITest003_NonBDD {
    public void step1(){
        System.out.println("Step1");
    }
    public void step2(){
        System.out.println("Step2");
    }
    public void step3(){
        System.out.println("Step3");
    }
    public static void main(String[] args) {
        APITest003_NonBDD Test=new APITest003_NonBDD();
        Test.step1();
        Test.step2();
        Test.step3();

        ///Test.step1().step2().step3();  Not supported

    }
}
