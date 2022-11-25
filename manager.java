public class Manager extends Employee {
    
    public Employee mentee;
    private double bonus;
    
    public Manager(String name, int age, String sex, int salary, int experience, boolean isEducated) {
        super(name, age, sex, salary, experience, isEducated);
        this.bonus = generateBonus();
    }

    public void setMentee(Employee e) {
        this.mentee = e;
        e.mentor = this;
    }
    
    public Employee getMentee() {
        return this.mentee;
    }
    
    private double generateBonus() {
        
        return this.salary * this.age * this.experience / 10;
    }
    
    public double getBonus() {
        return this.bonus;
    }
    
}
