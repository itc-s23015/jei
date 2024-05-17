//s23015
//ポリモフィズムの課題
//アニマルクラスで作ったmakeSound()をDog,Cat クラスに継承して、それぞれの動物の鳴き声を出力するコード

class Animal {
    public void makeSound() {
        System.out.println("動物の音");	
    }
    public void test(){
	System.out.println("テスト出力");
    }
}

class Dog extends Animal {
    public void makeSound() {
	System.out.println("ワンワン");
    }
}

class Cat extends Animal {
    public void makeSound() {
  	System.out.println("ニャー");
    }
}

public class d48Q2kadai {
    public static void main(String[] agrs) {
	Animal a = new Dog();
	Animal c = new Cat();
	a.makeSound();
  	a.test();
	c.makeSound();
    }
}
