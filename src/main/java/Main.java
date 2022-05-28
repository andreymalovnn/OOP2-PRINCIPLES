public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "1234 № 567890";
        post.patronymic = "Иванович";
        post.phone = "+7 (951) 907-07-07";
        post.surname = "Иванович";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
    }
}