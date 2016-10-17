/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import classes.Depatment;
import classes.Doctor;
import classes.Nurse;
import classes.Pacient;
import classes.Palata;
import classes.Sanitar;
import java.util.ArrayList;


/**
 *
 * @author pupil
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor(120000, "Хирург", "Петр", "Петров", "39909022220");
        Doctor doctor2 = new Doctor(120000, "Ортопед", "Николай", "Николаев", "37002022154");
        Nurse nurse1 = new Nurse(100000, "Старшая медсестра", "Анна", "Сидорава", "48010124435");
        Nurse nurse2 = new Nurse(800000, "Медсестра", "Василиса", "Васльева", "48612124455");
        Sanitar sanitar1 = new Sanitar(600000, "Мария", "Велигоцская", "48902033454");
        Sanitar sanitar2 = new Sanitar(600000, "Ольга", "Санитарова", "47901034544");
        Palata palata1 = new Palata("12a");
        Palata palata2 = new Palata("12b");
        Pacient pacient1 = new Pacient("Болезнь 1", "Хирургия", "17.10.2016", "29.10.2016", "Пантелей", "Пантелеев", "35001024325");
        
        
        Depatment depatment = new Depatment("Хирургия", 
                new ArrayList<Doctor>(), new ArrayList<Nurse>(), 
                new ArrayList<Pacient>(), new ArrayList<Sanitar>(),
                new ArrayList<Palata>());
        
 
        depatment.addDoctor(doctor1);
        depatment.addDoctor(doctor2);
        depatment.addNurse(nurse1);
        depatment.addNurse(nurse2);
        depatment.addSanitar(sanitar1);
        depatment.addSanitar(sanitar2);
        depatment.addPacient(pacient1);
        System.out.println(depatment.toString());
        

       
    }
    
}
