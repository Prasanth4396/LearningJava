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

        System.out.println(myStudent.age);
        System.out.println(myStudent1.lastname);

    }
}
