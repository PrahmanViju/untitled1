package entities;

public class Employee {
    static private int id;
    private String name;
    private String surname;
    private String position;
    private double salary;
    public Employee(){

    }

    public Employee(String name, String surname) {
        //setId(id);
        setName(name);
        setSurname(surname);
    }

    public Employee(int id, String name, String surname) {
        this(name, surname);
        setId(id);
    }

    public int getId(){
        return id;}



    public void setId(int id ){
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname (String surname){
        this.surname = surname;
    }


    @Override
    public String toString() {
        return "student:" + id +  name + surname;
    }




    @Override
    public String getPosition(){
        return "";
    }
}

