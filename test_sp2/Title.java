package test_sp2;

public abstract class Title {
    private String title;
    private final String literatureType;
    protected int copies;
    protected final double  rate = 0.67574;

    // initializing the variables title, literatureType, copies
    public Title(String title,String literatureType,int copies){
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    // calling the method that calculates point and multiplying it with the rate
    public double calculateRoyalty(){
        return calculatePoints() * this.rate;
    }

    // these two methods are abstract and can therefore not be instantiated in the main later
    protected abstract double calculatePoints();
    protected abstract double calculateLiteraturePoints();

    public String getLiteratureType(){
        return this.literatureType;
    }
}
