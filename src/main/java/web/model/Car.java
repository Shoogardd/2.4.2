package web.model;

public class Car {
    String сarBrand;
    String country;
    int age;

    public Car() {
    }

    public Car(String сarBrand, String Jopka, int age) {
        this.сarBrand = сarBrand;
        this.country = Jopka;
        this.age = age;
    }

    public String getCarBrand() {
        return сarBrand;
    }

    public void setСarBrand(String сarBrand) {
        this.сarBrand = сarBrand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
                ", сarModel='" + country + '\'' +
                ", age=" + age +
                '}';
    }
}

