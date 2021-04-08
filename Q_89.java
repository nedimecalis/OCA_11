package OCA_11;

public class Q_89 {

    /*
    Given:
    /code/a/Test.java
    containing:

    package a;
    import b.Best
    public class Test {
            public static void main(String[] args) {
                Best b = new Best ();
            }
    }

    and

    /code/b/Best.java
    containing:
    package b;
    public class Best { }

    Which is the valid way to generate bytecode for all classes?
    A. java /code/a/Test.java
    B. javac –d /code /code/a/Test
    C. java /code/a/Test.java /code/b/Best.java
    D. java –cp /code a.Test
    E. javac –d /code /code/a/Test.java /code/b/Best.java F. javac –d /code /code/a/Test.java


    Answer : E

    */
}
