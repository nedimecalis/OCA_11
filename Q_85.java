package OCA_11;

public class Q_85 {

    class Main{

        public static void checkConfiguration (String filename) {

            File file = new File (filename);
            if(!file.exists()) {
                throw new Error ("Fatal Error: Configutation File, "
                        + filename + "is missing.");
            }
        }

        public static void main(String[] args) {
            checkConfiguration ("App.config");
            System.out.println("Configuration is OK");
        }
    }
}

//    If file "App.config" is not found, what is the result?
//        A. Configuration is OK
//        B. The compilation fails.
//        C. Exception in thread "main" java.lang.Error:Fatal Error: Configuration File, App.config, is missing.
//        D. nothing
//
//    Answer: B
