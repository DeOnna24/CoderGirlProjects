import java.util.Scanner;
import java.util.*;


public class DisplayGenerator {

    private Scanner keyboard;

    public DisplayGenerator() {this.keyboard = new Scanner(System.in);
    }

public Post generatePost() {
        User newUser;
        String validate;
        Post newPost;

do{

    String userUserName;
    System.out.println("What is your username?");
    userUserName = keyboard.nextLine();

    String userFirstName;
    System.out.println("What is your first name?");
    userFirstName = keyboard.nextLine();

    String userLastName;
    System.out.println("What is your last name?");
    userLastName = keyboard.nextLine();

    String userUrl;
    System.out.println("What is your Url?");
    userUrl = keyboard.nextLine();

    String userEmail;
    System.out.println("What is your email?");
    userEmail = keyboard.nextLine();

newPost = new Post();
System.out.println("\n" + newPost.toStringPost() + "\n");
System.out.println("Is this correct? (Enter \"y\" for yes)");
validate = keyboard.nextLine();
}
while(!validate.toLowerCase().equals("y"));
return newPost;
}

//TODO get the user info from the user
private User createUser() {

        int createUser = keyboard.nextInt();

return createUser();
}

    //TODO Change this to store each value in the correct field as it is entered
    public Post createPost(User user){
        System.out.println("How would you like to title your post?");
        String userPostTitle = keyboard.nextLine();
        System.out.println("What is your post?");
        String userPost = keyboard.nextLine();
        return new Post();
    }

}