package test_sp2;

public class PrintedBook extends Title {
    private final int pages;

    // constructor making a super call to access the variables from the class Titles constructor
    // and initializing the pages variable
    public PrintedBook(String title,String literatureType,int copies,int pages){
        super(title,literatureType,copies);
        this.pages = pages;
    }

    @Override
    protected double calculatePoints() {
        return this.pages * calculateLiteraturePoints() * copies;
    }

    @Override
    protected double calculateLiteraturePoints() {
        switch (getLiteratureType()) {
            case("BI"),("TE"):
                return 3;
            case("LYRIK"):
                return 6;
            case("SKØN"):
                return 1.7;
            case("FAG"):
                return 1;
            default:
                System.out.println("Invalid");
        }
        return 0.0;
    }
}
