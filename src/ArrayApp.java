public class ArrayApp {
    public static void main(String[] args) {


        String[] users = new String [4];
        users[0] = "steven";
        users[1] = "thomas";
        users[2] = "daniel";
        users[3] = "marie";

        System.out.println(users[1]);                // 두번째 자리에 있는 데이터 가져오기
        System.out.println(users.length);            // 배열의 크기

        //배열을 생성할때 값을 담아서 생성

        int[] scores = {50, 40, 100, 20};
        System.out.println(scores[1]);
        System.out.println(scores.length);



    }
}
