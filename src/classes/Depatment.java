package classes;

import java.util.List;
import java.util.Objects;

public class Depatment {

    private String name;

    private List<Doctor> doctors;

    private List<Nurse> nurses;

    private List<Pacient> pacients;

    private List<Sanitar> sanitars;

    private List<Palata> palats;

    public Depatment() {
    }

    public Depatment(String name, List<Doctor> doctors, List<Nurse> nurses, List<Pacient> pacients, List<Sanitar> sanitars, List<Palata> palats) {
        this.name = name;
        this.doctors = doctors;
        this.nurses = nurses;
        this.pacients = pacients;
        this.sanitars = sanitars;
        this.palats = palats;
    }

    public void addDoctor(Doctor doctor){
        this.doctors.add(doctor);
    }
    public void removeDoctor(Doctor doctor){
        for (int i = 0; i < this.doctors.size(); i++){
            if(this.doctors.get(i).equals(doctor)){
                this.doctors.remove(i);
            }
        }
    }
    
    public void addNurse(Nurse nurse){
        this.nurses.add(nurse);
    }
    public void removeNurse(Nurse nurse){
        for (int i = 0; i < this.nurses.size(); i++){
            if(this.nurses.get(i).equals(nurse)){
                this.nurses.remove(i);
            }
        }
    }
    
    public void addSanitar(Sanitar sanitar){
        this.sanitars.add(sanitar);
    }
    public void removeSanitar(Sanitar sanitar){
        for (int i = 0; i < this.sanitars.size(); i++){
            if(this.sanitars.get(i).equals(sanitar)){
                this.sanitars.remove(i);
            }
        }
    }
    
    public void addPacient(Pacient pacient){
        this.pacients.add(pacient);
    }
    public void removePacient(Pacient pacient){
        for (int i = 0; i < this.pacients.size(); i++){
            if(this.pacients.get(i).equals(pacient)){
                this.pacients.remove(i);
            }
        }
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<Nurse> getNurses() {
        return nurses;
    }

    public void setNurses(List<Nurse> nurses) {
        this.nurses = nurses;
    }

    public List<Pacient> getPacients() {
        return pacients;
    }

    public void setPacients(List<Pacient> pacients) {
        this.pacients = pacients;
    }

    public List<Sanitar> getSanitars() {
        return sanitars;
    }

    public void setSanitars(List<Sanitar> sanitars) {
        this.sanitars = sanitars;
    }

    public List<Palata> getPalats() {
        return palats;
    }

    public void setPalats(List<Palata> palats) {
        this.palats = palats;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
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
        final Depatment other = (Depatment) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        String strDoctor = "";
        for (int i = 0; i < this.doctors.size(); i++) {
            strDoctor += this.doctors.get(i).toString();
        }
        String strNurses = "";
        for (int i = 0; i < this.nurses.size(); i++) {
            strNurses += this.nurses.get(i).toString();
        }
        String strPacients = "";
        for (int i = 0; i < this.pacients.size(); i++) {
            strPacients += this.pacients.get(i).toString();
        }
        String strPalats = "";
        for (int i = 0; i < this.palats.size(); i++) {
            strPalats += this.palats.get(i).toString();
        }
        String strSanitars = "";
        for (int i = 0; i < this.sanitars.size(); i++) {
            strSanitars += this.sanitars.get(i).toString();
        }

        return "Depatment{" + "\n name: " + name + "\n}" +
                "\n doctors: " + strDoctor + 
                "\n nurses: " + strNurses + 
                "\n pacients: " + strPacients + 
                "\n sanitars: " + strSanitars + 
                "\n palats: " + strPalats + '}';
    }

}
