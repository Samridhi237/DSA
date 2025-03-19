public class Employee1 {

    String name, city;
    int id, age;

    Employee1(String name, String city, int id, int age) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.id = id;
    }

    void setCity(String city) {
        this.city = city;
    }

    String city() {
        return city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "Name: "+name+" | City: "+city+" | ID: "+id+" | Age: "+age;
    }
}
