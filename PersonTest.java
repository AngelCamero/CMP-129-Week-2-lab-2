public class PersonTest {
     public static void main(String [] args){
        Person p1 = new Person();
        p1.setName("Micheal Colon");
        p1.setEmail("mc42@gmail.com");
        p1.setAge(50);
        System.out.println(p1.displayInfo());

        Person p2 = new Person();
        p2.setName("mizuki shiraboshi");
        p2.setEmail("Mizukis55@gmail.com");
        p2.setAge(25);
        System.out.print(p2.displayInfo());
    }
}
