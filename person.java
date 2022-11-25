public class Person {
    
    public String name;
    public int age;
    public String sex;
    
    public Person(String name) {
        this.name = name;
    }
    
    public Person(String name, int age, String sex) {
        this.name = name;
        
        if(age < 18) {
            this.age = 18;
        }
        else {
            this.age = age;
        }
        
        if((sex == "male") || (sex == "female")) {
            this.sex = sex;
        }
        else {
            this.sex = null;
        }
    }
    
    public void print() {
        System.out.printf("Hello! My name is %s. I am %d y.o. %s person\n", this.name, this.age, this.sex);
    }
    
}
