package OCA_11;

import com.sun.xml.internal.bind.util.Which;

import java.util.ArrayList;
import java.util.List;

public class Q_175 {

    class Main {
        public static void main(String[] args) {
            List 1 = new ArrayList();
            1.add ("hello");
            1.add ("world");
            print(1);
        }
        private static void print (List<String>... args){
            for (List<String> str : args) {
                System.out.println(str);
            }
        }
    }
}

//  Which annotation should be used to remove warnings from compilation?
//
//  A. @SuppressWarnings on the main and print methods
//  B. @SuppressWarnings(“unchecked”) on main and @SafeVarargs on the print method
//  C. @SuppressWarnings(“rawtypes”) on main and @SafeVarargs on the print method
//  D. @SuppressWarnings(“all”) on the main and print methods
//
//  Answer : B



