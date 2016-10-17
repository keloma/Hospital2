package classes;



import interfaces.Employee;
import java.util.Objects;

public class Doctor extends Person implements Employee {

    private Integer salary;

    private String specialisation;

    public Doctor() {
    }

    public Doctor(String fistname, String lastname, String code) {
        super(fistname, lastname, code);
    }

    public Doctor(Integer salary, String specialisation, String fistname, String lastname, String code) {
        super(fistname, lastname, code);
        this.salary = salary;
        this.specialisation = specialisation;
    }

    @Override
    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Doctor other = (Doctor) obj;
        if (!Objects.equals(this.salary, other.salary)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\n Doctor{" + "\n name: " +super.getFistname()+" "+super.getLastname()+" " 
                + "\n salary: " + salary + 
                "\n specialisation: " + specialisation + "\n" + '}';
    }

    
    
    
}
