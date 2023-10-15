package studentaccessportal;

public abstract class EmployeeDetail {
    protected String name;
    protected int age;
    protected String email;
    protected int position;
    protected int ID;
    protected float salary;
    protected long contact;
    //default constructor
    public EmployeeDetail() {
        this.name = name;
        this.age = age;
        this.email= email;
        this.position = position;
        this.ID = ID;
        this.salary = salary;
        this.contact = contact;
    }
    //constructor
    public EmployeeDetail(String name, int age, String email, int position, int ID, float salary, long contact){
        this.name = name;
        this.age = age;
        this.email= email;
        this.position = position;
        this.ID = ID;
        this.salary = salary;
        this.contact = contact;
    }
    //getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getID() {
        return ID;
    }
    public String getEmail() {
        return email;
    }
    public int getPosition() {
        return position;
    }
    public long getContact() {
        return contact;
    }
    public float getSalary() {
        return salary;
    }
    //setters
    // set Name
    public void setName(String name) {
        this.name = name;
    }
    // set Age
    public void setAge(int age) {
        this.age = age;
    }
    // set Email
    public void setEmail(String email) {
        this.email = email;
    }
    // set Position
    public void setPosition(int position) {
        this.position = position;
    }
    // set ID
    public void setID(int ID) {
        this.ID = ID;
    }
    // set Salary
    public void setSalary(float salary) {
        this.salary = salary;
    }
    // set Contact
    public void setContact(long contact) {
        this.contact = contact;
    }
    // abstract method
    public abstract void employee_detail();

}