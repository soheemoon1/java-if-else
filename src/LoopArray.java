public class LoopArray {
    public static void main(String[] args) {

        String[] users = new String [4];
        users[0] = "steven";
        users[1] = "thomas";
        users[2] = "daniel";
        users[3] = "marie";

        for(int i = 0; i < users.length; i++){
            System.out.println("최" + users[i] + "강");
        }
    }
}
