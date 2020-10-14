package chapter10;

public class Zoo {

    public static void main(String[] arg){
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog();
        sasha.makeSound();
        feed(sasha);

        sasha = new Cat();
        sasha.makeSound();
        ((Cat) sasha).scratch();
        feed(sasha);

    }

    public static void feed(Animal animal){
        if (animal instanceof Dog){
            System.out.println("Here is your dog food. Good boy!");
        }
        else if (animal instanceof Cat){
            System.out.println("Here is your cat food, lovely scratchy cat!");
        }
    }
}
