public class TesteCoca {
    public static void main(String[] args) {

        Coca coca1 = new Coca(600, 3.99);
        Coca coca2 = new Coca(600, 5.99);

        if (coca1.equals(coca2)){
            System.out.println("é a mesma coca");
        } else {
            System.out.println("são cocas diferentes");
        }





    }

}
