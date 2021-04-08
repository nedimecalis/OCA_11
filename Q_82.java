package OCA_11;

import com.sun.xml.internal.bind.util.Which;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Q_82 {

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
        Collection<String> c = new ArrayList<>();

            }

//    Which three are true? (Choose three.)
//        A. b1.foo(c) prints Bonjour le monde! B. f1.foo(c) prints Hello world!
//        C. f1.foo(c) prints Olá Mundo!
//        D. b1.foo(c) prints Hello world!
//        E. f2.foo(c) prints Olá Mundo!
//        F. b1.foo(c) prints Olá Mundo!
//        G. f2.foo(c) prints Bonjour le monde! H. f2.foo(c) prints Hello world!
//        I. f1.foo(c) prints Bonjour le monde!
//
//  Answer : B, F, G