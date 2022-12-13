package day30_inheritanceContinue;

public class AudioBook extends Book{

    private double length;
    private String narrator;

    public AudioBook(String title, String type, String autor, double price, double length, String narrator) {
        super(title, type, autor, price);
        setLength(length);
        setNarrator(narrator);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0){
            System.err.println("Length can not be set to zero or negative!!!");
            System.exit(1);
        }
        this.length = length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public String toString() {
        return "AudioBook{" +
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                '}';
    }
}

/*
3 Create a sub class of Book named AudioBook:
			Extra variables:
				length, narrator

			Encapsulate all the extra fields
					Conditions:
						1. length can not be set to zero or negative

			Add a constructor that can set all the fields

			Extra Methods:
				toString()
 */
