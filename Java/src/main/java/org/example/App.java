package org.example;

public class App {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        System.out.println("Ім'я \n" +myCat.getName()+"\nВік: \n"+myCat.getAge());
        System.out.println(String.format("%s", "~~~" + myCat.getAge() + "~~~").replace("-", ""));
        //Або можливо так
            myCat.age=7;
            System.out.println(String.format(String.valueOf("~~~"+ myCat.age + "~~~")));

    }
}
