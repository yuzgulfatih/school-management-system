public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Create new teacher
     * @param id id for the teacher
     * @param name name of the teacher
     * @param salary salary of the teacher
     */
    public Teacher(int id , String name ,int salary ){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }

    /**
     * set the salary
     * @param salary
     */
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }
    @Override
    public String toString() {
        return "Teacher : " + name +
                " Total fees paid so far " + salary + " TL.";
    }

}
