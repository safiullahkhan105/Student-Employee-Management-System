public class Person {
    public String name ;
    public int age ;
    public String address ;

    Person(String name , int age , String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    void displayInfo(){
        System.out.println("Name         : "+name);
        System.out.println("Age          : "+age);
        System.out.println("Address      : "+address);
    }
}

