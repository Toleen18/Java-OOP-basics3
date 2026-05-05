public class Tester {
    public static void main(String[] args) {

        // Question 3
        // empty
        Student MyStudent = new Student();
        // with parameter
        Student s1 = new Student("Toleen", 473838033, 77);
        // copy con
        Student s2 = new Student(s1);
        System.out.println(s1);
        System.out.println(s2);


        // Question 2(car)
        car ca = new car();
        car ca2 = new car("bmw", 109, 2026);
        car ca3 = new car(ca2);
        ca.print();
        System.out.println(ca2);
        System.out.println(ca3);


        // Question 1
        //  (Default Constructor)
        person p = new person();
        // (Constructor with parameters)
        person p2 = new person("Toleen", 19, "Female", 1234567896L, "Jerusalem",
                162.3, 58.1, 26, 6, 2006,
                "Toleensd@gmail.com", "Doctor", "Single", "3238848");

        //  (Copy Constructor)
        person p3 = new person(p2);
        p3.setName("Sami");
        System.out.println(p2.getName());
        System.out.println(p3.getName());
        System.out.println(p2);
        System.out.println(p3);

        // Question 4
        Rectangle2 MyRectangle = new Rectangle2();
        Rectangle2 R = new Rectangle2(14.7, 14.3);
        Rectangle2 R2 = new Rectangle2(R);
        System.out.println(R);
        System.out.println(R2);


    }
}