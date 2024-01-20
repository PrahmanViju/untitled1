public class Student  extends Person{
    public class Student {
        static private int id;
        private String name;
        private String surname;
        private double gpa;

        private static int counter = 0;
        Student(){
            id = ++counter;
        }


        Student(int id,String name, String surname,double  gpa){
            setId(++counter);
            setName(name);
            setSurname(surname);
            setGpa(gpa);


        }

        public int getId(){
            return id;
        }

        public void setId(int id){
            this.id = id;
        }

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }

        public String getSurname(){
            return surname;
        }

        public void setSurname(String surname){
            this.surname = surname;
        }


        public double getGpa(){
            return gpa;
        }
        public void setGpa(double gpa){
            this.gpa = gpa;
        }

        public String toString(){
            return id + ": " + name  + " " + surname + " - " + gpa;
        }

        @Override
        public double getPaymentAmount() {
            return (gpa > 2.67) ? 36660.00 : 0.00;
        }
    }
}
