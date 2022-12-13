package day30_inheritanceContinue;

public class Book {

    private String title;
    private String type;
    private String autor;
    private double price;

    public Book(String title, String type, String autor, double price) {
        setTitle(title);
        setType(type);
        setAutor(autor);
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
            System.err.println("The price can not be less than zero!!!");
            System.exit(1);
        }
        this.price = price;
    }


    public String toString() {
        return getClass().getSimpleName()+"{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", autor='" + autor + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
bookTask:
	1. create a class named Book:
			variables:
				title, type, author, price

			Encapsulate all the fields
					Conditions:
						1. price can not be set to negative

			Add a constructor that can set all the fields

			Methods:
				toString()

	2 Create a sub class of Book named EBook:
			Extra variables:
				size, pages

			Encapsulate all the extra fields
					Conditions:
						1. pages can not be set to zero or negative

			Add a constructor that can set all the fields

			Extra Methods:
				readBook()

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
