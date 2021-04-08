package OCA_11;

import java.io.Serializable;

public class Q_120 {

    enum Color implements Serializable {
        R(1) , G(2) , B(3);
        int c;
        public Color (int c) {
            this.c = c
        }
    }
}

//    What action ensures successful compilation?
//        A. Replace public Color(int c) with private Color(int c).
//        B. Replace int c; with private int c;.
//        C. Replace int c; with private final int c;.
//        D. Replace enum Color implements Serializable with public enum Color. E. Replace enum Color with public enum Color.
//
//      Answer : A
