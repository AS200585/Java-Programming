package com.escapesequences;

public class EscapeSequences {
    public static void main(String[] args) {
        String message = "Namaste \"Ananay\"";  // Double quotes within double quotes using \"...\"
        System.out.println(message);
        String windows = "C:\\Windows\\Java-Programming\\__";  // Double backslash(\\) for displaying single backslash(\)
        System.out.println(windows);
        String backN = "Hello...\n...Josh";
        System.out.println(backN);  // \n for new line
        String backT = "Hola.\t_Amigo";
        System.out.println(backT);  // \t for tab
    }
}
