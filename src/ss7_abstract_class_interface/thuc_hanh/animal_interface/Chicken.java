package ss7_abstract_class_interface.thuc_hanh.animal_interface;

public class Chicken extends Animal implements Edible{
    @Override
    public void makeSound() {
        System.out.println("aaaaa");
    }

    @Override
    public String howToEat() {
        return "ăn bằng miệng";
    }
}
