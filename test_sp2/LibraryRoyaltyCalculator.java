package test_sp2;

public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {
        // the author instantiate
        Author author = new Author("Peter Marcher");

        //add initiated books three to the list
        author.addTitle(new PrintedBook("Harry Potter", "SKØN", 700, 557));
        author.addTitle(new PrintedBook("The jungle book", "BI", 400, 20));
        author.addTitle(new AudioBook("Bible", "FAG", 100, 80));

        System.out.println("Author: " + author.getName() + " : " + author.calculateTotalPay());
    }
}
