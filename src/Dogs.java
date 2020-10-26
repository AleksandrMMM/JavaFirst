public class Dogs {
    private String name;
    private double weight;
    private int age;
    private int minWeight;
    private int maxWeigth;

    public Dogs(String name,int age ){
        this.name = name;
        this.weight = weight;
        this.age = age;
        weight = 20;
        minWeight = 0;
        maxWeigth = 30;
    }
    public double getWeigth(){
        return weight;
    }
    public void laet(){
        System.out.println("gaw gaw");
        weight--;
    }
    public void getStatus(){
        if (weight < minWeight){
            System.out.println("dogs death");
        }
        if(weight > maxWeigth){
            System.out.println("dogs BUM");
        }
    }
    public void eat(double calorii){
        weight += calorii;
    }

}

