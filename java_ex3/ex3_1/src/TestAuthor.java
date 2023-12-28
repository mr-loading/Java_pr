public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Alan Polk", "alanPolk@mail.ru", 'm');
        author.setEmail("alanPolk54@gmail.com");
        System.out.println(author.toString());
    }
}