public class Person {
    private String name;
    private String email;
    private int age;

    public Person() {
        this.name = "N/A";
        this.email = "N/A";
        this.age = 0;
    }

    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String displayInfo() {
        return "Name: " + this.name + "" +", Age: " + this.age +  ", Email: " + this.email;
        
    }
}
