public class StudentTest {    
    public static void main(String[] args) {
        Student s=new Student();
        Student m=new Student();
        s.name="Peter";
        s.age=21;
        s.id=242131;
        s.validCard=true;
        s.aveGrade=4;
        s.displayAge();
        s.displayName();



        m.name="Krzysiek";
        m.age=24;
        m.id=21342;
        m.validCard=false;
        m.aveGrade=3;
        m.displayAge();
        m.displayName();
    }
        

}