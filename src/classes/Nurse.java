package classes;


import classes.Person;
import interfaces.Employee;
import java.util.Objects;

public class Nurse extends Person implements Employee {

    private Integer salary;

    private String status;

    public Nurse(String fistname, String lastname, String code) {
        super(fistname, lastname, code);
    }

    public Nurse(Integer salary, String status, String fistname, String lastname, String code) {
        super(fistname, lastname, code);
        this.salary = salary;
        this.status = status;
    }

    @Override
    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.salary);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nurse other = (Nurse) obj;
        if (!Objects.equals(this.salary, other.salary)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\nNurse{" + "\n name: " +super.getFistname()+" "+super.getLastname()+" "+
                "\n salary: " + salary + 
                "\n status: " + status + "\n" + '}';
    }
    
    
    
}
