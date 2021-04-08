package OCA_11;

public class Q_88 {

    //Automobil.java
    abstract class Automobile {         //line 1
        abstract void wheels();
    }

    //Car.java
    class Car extends Automobile {
                                        //line 2
        void wheels (int i) {           //line 3
            System.out.print(4);
        }

        public static void main(String[] args) {
            Automobile ob = new Car (); //line 4
            ob.wheels();
        }
    }
}

//    What must you do so that the code prints 4?
//        A. Remove the parameter from wheels method in line 3.
//        B. Add @Override annotation in line 2.
//        C. Replace the code in line 2 with Car ob = new Car();
//        D. Remove abstract keyword in line 1.
//
//    Answer : B