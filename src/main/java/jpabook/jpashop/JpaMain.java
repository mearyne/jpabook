package jpabook.jpashop;

public class JpaMain {
    public static void main(String[] args) {

        Hello hello = new Hello();
        hello.setId("1");
        hello.setName("조길동");

        System.out.println("hello = " + hello);
        System.out.println("hello = " + hello.getId());
        System.out.println("hello.getName() = " + hello.getName());
    }
}
