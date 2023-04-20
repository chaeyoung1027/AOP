package kr.hs.study.beans;

public class TestBean {
    public void method1(){
        int a = 100/0;
        //비즈니스 로직
        System.out.println("TestBean의 method1 호출");
    }
}
