package test_sp2;

import java.util.ArrayList;

public class Author {
    private final String name;
    private final ArrayList<Title> titles;

    // constructor initializing attribute name and creating an ArrayList
    public Author(String name){
        this.name = name;
        this.titles = new ArrayList<>();
    }

    // adding a title to the arraylist created beforehand
    public void addTitle(Title title){
        titles.add(title);
    }

    // calculating the totalPay by getting all royalties for all the titles with a for each loop
    public float calculateTotalPay(){
        float totalPay = 0;
        for(Title title: titles) {
            totalPay = totalPay + (float) title.calculateRoyalty();
        }
        // the variable totalPay is double but the method is of the datatype float
        // to return the totalPay variable we must cast from a float to a double
        return (float) ((double) Math.round(totalPay * 100) / 100); // 2 decimals
    }

    public String getName(){
        return this.name;
    }
}
