package test_sp2;

public class AudioBook extends Title {
    private final int durationInMinutes;

    // constructor making a super call to access the variables from the class Titles constructor
    // and initializing the durationInMinutes variable
    public AudioBook(String title,String literatureType,int copies,int durationInMinutes) {
        super(title,literatureType,copies);
        this.durationInMinutes = durationInMinutes;
    }

    // calculating points based on time in minutes
    @Override
    protected double calculatePoints() {
        // (duration in minutes x 0,5) x literatureType x examples
        return (this.durationInMinutes * 0.5) * calculateLiteraturePoints() * copies;
    }

    // calculating the literature points based of that literatureType returning points per minutes
    @Override
    protected double calculateLiteraturePoints() {
        switch (getLiteratureType()) {
            case ("BI"), ("Te"):
                return 1.5;
            case ("LYRIK"):
                return 3;
            case ("SKØN"):
                return 0.85;
            case("Fag"):
                return 0.5;
            default:
                System.out.println("Invalid");
        }
        return 0.0;
    }

}
