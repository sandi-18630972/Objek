public class Main {
    public static void main(String[] args) {
        //instance
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();


        animal1.userName = "Harimau";
        animal1.score = 350;
        animal1.length = 5;

        animal2.userName = "Jaguar";
        animal2.score = 450;
        animal2.length = 3;

        animal1.lajuAnimal();

        System.out.println(animal1.score);
        animal1.lajuOther(animal2);
        System.out.println(animal1.score);
    }
}
