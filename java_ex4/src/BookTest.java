public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Ivan", "Old egg", 1984);

        System.out.println(book.getAfter());
        System.out.println(book.getName());
        System.out.println(book.getYears());
        book.setYears(2006);
        System.out.println(book.getYears());
    }
}
