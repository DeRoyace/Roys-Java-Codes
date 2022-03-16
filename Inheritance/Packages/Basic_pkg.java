package myPack1;
public class Basic_pkg {
    public static void main(String[] args) {
        System.out.println("This is my first package.");
    }
}

/**
 * To create a package we use package keyword.
 * when we compile such programs we must create a packakage while compiling as shown:
 * javac -d . Basic_pkg.java => this cmd will create the package myPack1 in the current directory
 * myPack1 package/ folder will contain Basic_pkg.class file i.e., the bytecodes
 * for running the program : java myPack1.Basic_pkg
 */