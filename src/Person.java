package entities;

public class Person implements PLayable {
    static private int id;
    private String name;
    private String surname;


    public Person(int id, String name, String surname) {
        setId(id);
        setName(name);
        setSurname(surname);
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
    public double getPaymentAmount() {
        return 0.00;
    }




    @Override
    public String getPosition(){
        return "";
    }
}
}