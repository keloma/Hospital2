package classes;

import java.util.Objects;



public class Pacient extends Person {

    private String diagnos;

    private String department;

    private String timeArrival;

    private String timeDeparture;


    public Pacient() {
    }

    public Pacient(String fistname, String lastname, String code) {
        super(fistname, lastname, code);
    }

    public Pacient(String diagnos, String department, String timeArrival, String timeDeparture, String fistname, String lastname, String code) {
        super(fistname, lastname, code);
        this.diagnos = diagnos;
        this.department = department;
        this.timeArrival = timeArrival;
        this.timeDeparture = timeDeparture;
        
        
    }

    public String getDiagnos() {
        return diagnos;
    }

    public void setDiagnos(String diagnos) {
        this.diagnos = diagnos;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTimeArrival() {
        return timeArrival;
    }

    public void setTimeArrival(String timeArrival) {
        this.timeArrival = timeArrival;
    }

    public String getTimeDeparture() {
        return timeDeparture;
    }

    public void setTimeDeparture(String timeDeparture) {
        this.timeDeparture = timeDeparture;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.diagnos);
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
        final Pacient other = (Pacient) obj;
        if (!Objects.equals(this.diagnos, other.diagnos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\nPacient{" + "\n name: " +super.getFistname()+" "+super.getLastname()+" " +
                "\n diagnos: " + diagnos + ""
                + "\n department: " + department + ""
                + "\n timeArrival: " + timeArrival + ""
                + "\n timeDeparture: " + timeDeparture + "\n" + '}';
    }

   

    
    
    
    
}
