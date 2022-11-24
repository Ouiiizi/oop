package models;
public class Stnds {
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getObtmarks() {
        return obtmarks;
    }
    String name;
    int age;
    double obtmarks;
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setObtmarks(double obtmarks) {
        this.obtmarks = obtmarks;
    }
    public Stnds(String name, int age, int obtmarks){
        this.name = name;
        this.age = age;
        this.obtmarks = obtmarks;
    }
    public double getPercent(){
        double total = (this.obtmarks/500)*100;
        return total;
    }
    public String getAeg() {
        String eligible = this.name + " is Good to vote(18+)";
        String non_eligible = this.name + " is not eligible to vote(-18)";

        if ((this.age) >= 18) {
            return eligible;
        } else {
            return non_eligible;
        }

    }
}


