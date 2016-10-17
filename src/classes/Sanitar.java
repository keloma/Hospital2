package classes;

import interfaces.Employee;
import java.util.Objects;

public class Sanitar extends Person implements Employee {

    private Integer salary;

    public Sanitar() {
    }

    public Sanitar(Integer salary) {
        this.salary = salary;
    }

    public Sanitar(Integer salary, String fistname, String lastname, String code) {
        super(fistname, lastname, code);
        this.salary = salary;
    }

    @Override
    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.salary);
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
        final Sanitar other = (Sanitar) obj;
        if (!Objects.equals(this.salary, other.salary)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\nSanitar{" + "\n name: " +super.getFistname()+" "+super.getLastname()+" " + 
                "\n salary: " + salary + "\n" + '}';
    }
    
    
    
}
