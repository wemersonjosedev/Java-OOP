package De03.entites;

public class People {

    public String name;
    public int age;
    public double height;

    
    public People(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public double getHeight() {
        return height;
    }


    public void setHeight(double height) {
        this.height = height;
    }


    
}
