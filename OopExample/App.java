public class App{
    public static void main(String[] args) throws Exception{
        Dog d1 = new Dog("Chad","Pitbull", true, 70);
        Dog d2 = new Dog("Charles","Poodle", false, 15);
        Dog d3 = new Dog();
        d3.setName("Rufus");
        System.out.println(d3.getName());
        d2.setWeight(-3);
        System.out.println(d2.getWeight());
        System.out.println(d1);
        d1.makeSound();
        System.out.println(d2);
        d2.makeSound();
        System.out.println(d3);
        d3.makeSound();
        System.out.println("Done");


    }
}