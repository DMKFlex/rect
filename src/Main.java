public class Main {
    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle("Blue",50,40);
        Rectangle rectangle1=new Rectangle("Blue",50,40);
        System.out.println(rectangle.equals(rectangle1));
        System.out.println(rectangle.hashCode());
        System.out.println(rectangle1.hashCode());
    }
}
