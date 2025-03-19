public class Employee {
    String name;
    int id;
    String city;

    Employee(String name, int id, String city){
        this.name=name;
        this.id=id;
        this.city=city;
    }

    public String getCity()
    {
        return this.city;
    }
    public void setCity(String city){
        this.city=city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString()
    {
     return "name: "+name+" id: "+id+" city: "+city;
    }
}
