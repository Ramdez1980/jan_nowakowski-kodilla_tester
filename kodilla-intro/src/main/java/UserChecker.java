public class UserChecker {
 private User user;

 public UserChecker(User user) {
     this.user = user;
 }
 public void process() {
     if (user.hasName()) {
        if (user.isOlder (30) && user.isHigher(160)){
            System.out.println("User is oldeer than 30 and higher than 160 cm");
        } else {
            System.out.println("USer is 30 (or younger) or 160cm (or shorter)");
        }
     }
 }


}
