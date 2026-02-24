package day1;

public class friendTest {
    public static void main(String[] args) {
        Friend friend1 = new Friend();
        friend1.setName("张三");
        friend1.setAge(18);
        friend1.setGender("男");
        System.out.println(friend1.getName());
        System.out.println(friend1.getAge());
        System.out.println(friend1.getGender());
    }
}
