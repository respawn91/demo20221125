public class Employee extends Person {
    
    public int salary;
    public int experience;
    public boolean isEducated;
    public boolean isHappy;
    public Laptop device;
    public Manager mentor;
    
    public Employee(String name, int age, String sex) {
        super(name, age, sex);
    }

    public Employee(String name, int age, String sex, int salary, int experience, boolean isEducated) {
        super(name, age, sex);
        this.salary = salary;
        this.experience = experience;
        this.isEducated = isEducated;
        
        if(sex == "female") {
            this.isHappy = true;
        }
        else {
            if(salary > 50000) {
                this.isHappy = true;
            }
            else {
                this.isHappy = false;
            }
        }
    }
    
    public void print() {
        System.out.printf("Hello! My Name is %s. I am %d y.o. %s employee\n", this.name, this.age, this.sex);
        System.out.printf("Also, my Salary is %d, my experience is %d. Education? %b. Happy? %b\n", this.salary, this.experience, this.isEducated, this.isHappy);
    }
    
}
