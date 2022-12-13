package day30_inheritanceContinue;

public class EBook extends Book{

    private double size;
    private int pages;

    public EBook(String title, String type, String autor, double price) {
        super(title, type, autor, price);
        setSize(size);
        setPages(pages);
    }


    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages <= 0){
            System.err.println("Pages can not be set to zero or negative!!!");
            System.exit(1);
        }
        this.pages = pages;
    }

    public void readBook(){
        System.out.println(getAutor() + "reads his own book.");
    }
}
/*
2 Create a sub class of Book named EBook:
			Extra variables:
				size, pages

			Encapsulate all the extra fields
					Conditions:
						1. pages can not be set to zero or negative

			Add a constructor that can set all the fields

			Extra Methods:
				readBook()
 */
