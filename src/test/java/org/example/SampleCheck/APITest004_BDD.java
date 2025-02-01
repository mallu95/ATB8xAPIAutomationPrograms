package org.example.SampleCheck;

public class APITest004_BDD {

    public APITest004_BDD step1(){
        System.out.println("Step 1");
        return this;
    }
    public APITest004_BDD step2(){
        System.out.println("Step 2");
        return this;
    }
    public  APITest004_BDD step3(String name){
        System.out.println("Step 3");
        System.out.println("My name  is "+name);
        return this;
    }

    public static void main(String[] args) {
        APITest004_BDD st=new APITest004_BDD();
        st.step1().step2().step3("Mallu");
    }
}
