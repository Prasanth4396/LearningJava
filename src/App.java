public class App {
    public static void main(String[] args) {


        Student myStudent = new Student();
        myStudent.firstname = "jim";
        myStudent.lastname = "parker";
        myStudent.age = 29;
        myStudent.major = "Business";
        myStudent.probation=false;

        Student myStudent1 = new Student();
        myStudent1.firstname = "kim";
        myStudent1.lastname = "young";
        myStudent1.age = 27;
        myStudent1.major = "Associate";
        myStudent1.probation=true;


        Student myStudent2 = new Student();
        myStudent2.firstname = "john";
        myStudent2.lastname = "kris";
        myStudent2.age = 22;
        myStudent2.major = "employee";
        myStudent2.probation=true;

        System.out.println(myStudent.age);
        System.out.println(myStudent1.lastname);
        System.out.println(myStudent2.age);
        System.out.println(myStudent2.major);

     myStudent2.dancing();
     myStudent1.eating();

    }
}
