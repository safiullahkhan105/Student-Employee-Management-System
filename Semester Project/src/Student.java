class Student extends Person {
    protected String studentID ;
    private String major ;

    Student (String name , int age , String address , String studentID ,String major){
        super(name,age,address);
        this.studentID=studentID;
        this.major=major;
    }
    void updateInfo(String name , int age , String address ,String major){
        this.name=name;
        this.age=age;
        this.address=address;
        this.major=major;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Student ID   : "+studentID);
        System.out.println("Major        : "+major);
    }
}

