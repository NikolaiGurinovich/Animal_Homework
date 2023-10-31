public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.eat("Meat"));
        Tiger tiger = new Tiger();
        System.out.println(tiger.eat("MEAT"));
        Rabbit rabbit = new Rabbit();
        System.out.println(rabbit.voice("grass"));


    }
}