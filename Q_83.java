package OCA_11;

public class Q_83 {
    class Person {
        private String name = "Joe Bloggs";

        public Person(String name) {
            this.name = name;
        }

        public String toString() {
            return name;
        }

        //and

    }
}

    class Tester {
        public static void main(String[] args) {
            Person p1 = new Person (); // line 1
            System.out.println(p1);
        }
    }

//        What is the result?
//        A. null
//        B. Joe Bloggs
//        C. The compilation fails due to an error in line 1.
//        D. p1

//  Answer : C

