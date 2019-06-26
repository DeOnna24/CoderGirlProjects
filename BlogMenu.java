
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class BlogMenu {

private ArrayList<Post> postLog;

public BlogMenu() {

    ArrayList<String> List = new ArrayList<>();
    List.add("toStringPost");

    this.postLog = new ArrayList<>();

}

public void run(){

    welcome();

    int selection;
    Scanner keyboard = new Scanner(System.in);
do{
    System.out.println("What would you like to do today?");
    System.out.println("1. Make a new complaint");
    System.out.println("2. Check an existing complaint");
    System.out.println("0. Quit");
    selection = keyboard.nextInt();
    keyboard.skip("\n");
    if (selection == 1){

        DisplayGenerator generatePostObject = new DisplayGenerator();
        generatePostObject.generatePost();
        processSelection(selection);
    }
    if (selection == 2) {

        BlogMenu generateViewPosts = new BlogMenu();
        generateViewPosts.viewPosts();
        processSelection(selection);
    }
}while(selection != 0);

    System.out.println("We appreciate your feedback! Someone will (probably not) be in touch!");
}

    private void welcome() {
        System.out.println("Hello! Welcome to the Complaints Department!");
    }

    //TODO Add new complaints to the log
    private void processSelection(int selection) {
        switch (selection){
            case 1:
                DisplayGenerator displayGenerator = new DisplayGenerator();
                Post newPost = displayGenerator.generatePost();
                postLog.add(newPost);
                break;
            case 2:
                viewPosts();
                break;
        }
    }

    private void viewPosts(){
        for(Post post : this.postLog){
            System.out.println("------------------------------------------");
            System.out.println(post.toStringPost());
        }
        System.out.println("------------------------------------------");
        System.out.println("");
    }
}
