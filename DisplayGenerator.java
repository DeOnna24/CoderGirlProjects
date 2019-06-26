import java.util.Scanner;
import java.util.*;


public class DisplayGenerator {

    private Scanner keyboard;

    public DisplayGenerator() {this.keyboard = new Scanner(System.in);
    }

public Post generatePost() {
        String validate;
        Post newPost;
        User newUser = createUser();



do {

    createUser();

    newPost = createPost(newUser);
    System.out.println("\n" + newPost.toStringPost() + "\n");
    System.out.println("Is this correct? (Enter \"y\" for yes)");
    validate = keyboard.nextLine();
}
while(!validate.toLowerCase().equals("y"));
    return new Post();
}

//TODO get the user info from the user
private User createUser() {
    User newUser = new User();
    System.out.println("What is your username?");
    newUser.setUserUserName(keyboard.nextLine());
    System.out.println("What is your first name?");
    newUser.setUserFirstName(keyboard.nextLine());
    System.out.println("What is your last name?");
    newUser.setUserLastName(keyboard.nextLine());
    System.out.println("What is your Url?");
    newUser.setUserUrl(keyboard.nextLine());
    System.out.println("What is your email?");
    newUser.setUserEmail(keyboard.nextLine());
return newUser;
}

    //TODO Change this to store each value in the correct field as it is entered
    public Post createPost(User newUser){
        Post newPost = new Post();
        newPost.setUser(newUser);
        System.out.println("How would you like to title your post?");
        newPost.setUserPostTitle(keyboard.nextLine());
        System.out.println("What is your post?");
        newPost.setUserPost(keyboard.nextLine());
        return newPost;
    }

}