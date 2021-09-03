package web.model;

public class Car {
    String сarBrand;
    String cantry;
    int age;

    public Car() {
    }

    public Car(String сarBrand, String cantry, int age) {
        this.сarBrand = сarBrand;
        this.cantry = cantry;
        this.age = age;
    }

    public String getCarBrand() {
        return сarBrand;
    }

    public void setСarBrand(String сarBrand) {
        this.сarBrand = сarBrand;
    }

    public String getCantry() {
        return cantry;
    }

    public void setCantry(String cantry) {
        this.cantry = cantry;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "сarBrand='" + сarBrand + '\'' +
                ", сarModel='" + cantry + '\'' +
                ", age=" + age +
                '}';
    }
}

