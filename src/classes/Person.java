package classes;

import java.util.Objects;
import util.ParseCode;

public class Person {

    private String fistname;

    private String lastname;

    private String code;

    private Integer age;

    private String birthdey;

    private String sex;

    private Integer day;

    private Integer month;

    private Integer year;

    private ParseCode parseCode;

 
    public Person() {
    }

    public Person(String fistname, String lastname, String code) {
        this.parseCode = new ParseCode(code);
        this.fistname = fistname;
        this.lastname = lastname;
        this.code = code;
        this.setAge();
        this.setBirthdey();
        this.setDay();
        this.setMonth();
        this.setYear();
        this.setSex();
    }

    public String getFistname() {
        return fistname;
    }

    public void setFistname(String fistname) {
        this.fistname = fistname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge() {
        this.age = parseCode.getAge();
    }

    public String getBirthdey() {
        return birthdey;
    }

    public void setBirthdey() {
        this.birthdey = parseCode.getBirthday();
    }

    public String getSex() {
        return sex;
    }

    public void setSex() {
        this.sex = parseCode.getSex();
    }

    public Integer getDay() {
        return day;
    }

    public void setDay() {
        this.day = parseCode.getDay();
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth() {
        this.month = parseCode.getMonth();
    }

    public Integer getYear() {
        return year;
    }

    public void setYear() {
        this.year = parseCode.getYear();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.fistname);
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
        final Person other = (Person) obj;
        if (!Objects.equals(this.fistname, other.fistname)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "\nPerson{" + "\n fistname: " + fistname + 
                "\n lastname: " + lastname + 
                "\n code: " + code + 
                "\n age: " + age + 
                "\n birthdey: " + birthdey + 
                "\n sex: " + sex + 
                "\n day: " + day + 
                "\n month: " + month + 
                "\n year: " + year + 
                "\n parseCode: " + parseCode + '}';
    }


 
    
    
}
