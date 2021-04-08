package OCA_11;

import com.sun.xml.internal.bind.util.Which;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Q_87 {

            class Foo {
                public void foo (Collection arg){
                    System.out.println("Bonjour le monde!");
                }
            }

            //and

            class Bar extends Foo {
                public void foo(Collection arg) {
                    System.out.println("Hello world!");
                }

                public void foo(List arg) {
                    System.out.println("Olá Mundo!");
                }
            }

            //and

            Foo f1 = new Foo();
            Foo f2 = new Bar();
            Bar b1 = new Bar();
            List <String> li = new ArrayList<>();

        }

//    Which three are correct? (Choose three.)
//        A. b1.foo(li) prints Hello world!
//        B. f1.foo(li) prints Bonjour le monde! C. f1.foo(li) prints Hello world!
//        D. f1.foo(li) prints Hola Mundo!
//        E. b1.foo(li) prints Bonjour le monde! F. f2.foo(li) prints Hola Mundo!
//        G. f2.foo(li) prints Bonjour le monde! H. b1.foo(li) prints Hola Mundo!
//        I. f2.foo(li) prints Hello world!

// Answer : A,B,H