class Person {
    Person() {
        System.out.println("Person");
    }
}

class Student extends Person {
    Student() {
        System.out.println("Student");
    }
}

class Postgrad extends Student {
    Postgrad() {
        System.out.println("Postgrad");
    }
}

// in main:
new Postgrad();