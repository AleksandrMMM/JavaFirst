public class Main {
    public static void main(String[] args) {
        Dogs dog1 = new Dogs("Ser", 1);
        System.out.println(dog1.getWeigth());
        for (; dog1.getWeigth() > 0;){
            dog1.laet();
        }
        dog1.getStatus();

    }
}
