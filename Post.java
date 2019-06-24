public class Post {

    private static int userPostCount = 1;
    private int id;
    private User user;
    private String userPostTitle;
    private String userPost;
    private String webAddress;
    private boolean closed;

    public Post(String User, String userPostTitle, String userPost) {

        userPostCount++;
        this.user = user;
        this.id = userPostCount;
        this.userPostTitle = userPostTitle;
        this.userPost = userPost;
        this.closed = false;
    }

    public Post() {

        userPostCount++;
        this.id = userPostCount;
    }

    public Post(User user, String userPost, String webAddress) {

        userPostCount++;
        this.user = user;
        this.id = userPostCount;
        this.userPost = userPost;
        this.webAddress = webAddress;
    }

    public int getUserPostCount(){
        return this.userPostCount;
    }

    public void setUserPostCount(int userUserName) {
        this.userPostCount = userPostCount;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public String getUserPost() {
        return userPost;
    }

    public void setUserPost(String userPost) {
        this.userPost = userPost;
    }

    public String getUserPostTitle() {
        return userPostTitle;
    }

    public void setUserPostTitle(String userPostTitle) {
        this.userPostTitle = userPostTitle;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    public String toStringPost() {

        User generateUserObj = new User();

        return "Post ID:" + this.id + "\n" +
                "User: " + this.getUser() + "\n" +
                "Post: " + this.userPost + "/n" +
                "Web Address" + this.getWebAddress();

    }
}