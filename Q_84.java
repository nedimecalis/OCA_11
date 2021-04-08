package OCA_11;

import com.sun.xml.internal.bind.util.Which;

public class Q_84 {

    class DNASynth {
        int aCount;
        int tCount;
        int cCount;
        int gCount;

        int getACount(int aCount) {
            return aCount;
        }

        int getTCount(int tCount) {
            return this.tCount;
        }

        int getCCount() {
            return getTotalCount() - this.aCount - getTCount(0) - gCount;
        }

        int getGCount() {
            return getGCount();
        }

        int getTotalCount() {
            return aCount +getTCount(0) + this.cCount + this.gCount;
        }

    }

}

//    Which two methods facilitate valid ways to read instance fields? (Choose two.)
//        A. getTCount
//        B. getACount
//        C. getTotalCount D. getCCount
//        E. getGCount
//
//    Answer: C, D