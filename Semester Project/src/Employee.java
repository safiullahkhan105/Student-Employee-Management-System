class Employee extends Person{
    protected String employeeID ;
    private String department ;

    Employee(String name, int age, String address, String employeeID ,String department){
        super(name,age,address);
        this.employeeID=employeeID;
        this.department=department;
    }
    void updateInfo(String name, int age, String address, String department){
        this.name=name;
        this.age=age;
        this.address=address;
        this.department=department;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Employee ID : "+employeeID);
        System.out.println("Department  : "+department);
    }
}

