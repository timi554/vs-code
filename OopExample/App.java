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

        //creating an array of dogs
        Dog[] dogs = new Dog[3];
        System.out.println(dogs[0]);
        dogs[0] = d1;
        dogs[1] = new Dog("Bob","Pug", true, 90);
        dogs[2] = new Dog();
        for (int i = 0; i<dogs.length; i++){
            System.out.println(dogs[i]);
        }
    

    }
}