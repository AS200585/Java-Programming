package switchstatements;

public class SwitchStatements {
    public static void main(String[] args) {
        String role = "moderator";
        /*
        if(role == "admin"){
            System.out.println("You're an admin");
        } else if (role == "moderator"){
            System.out.println("You're a moderator");
        } else {
            System.out.println("You're a guest");
        } */
        //Switch statements are used to execute different parts of code depending on the value of an expression
        switch(role){
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
        }
    }
}
