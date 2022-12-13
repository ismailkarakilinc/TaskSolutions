package day29_inheritence;

public class Developer extends Employee{

    private String programmingLanguage;

    public void coding(){
        System.out.println(getName() + " is coding " + getProgrammingLanguage());
    }

    public void Developer(String programmingLanguage) {
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if ((programmingLanguage.equalsIgnoreCase("Java")||programmingLanguage.equalsIgnoreCase("JavaScript")||
                programmingLanguage.equalsIgnoreCase("Python")||programmingLanguage.equalsIgnoreCase("Ruby")||
                programmingLanguage.equalsIgnoreCase("C#")||programmingLanguage.equalsIgnoreCase("C++")||
                programmingLanguage.equalsIgnoreCase("Swift"))){
            this.programmingLanguage = programmingLanguage;
        }else {
            System.err.println("programming language can only be set to one of the followings:\n" +
                    "\t\t\t\t\t\t{\"Java\", \"JavaScript\", \"Python\", \"Ruby\", \"C#\", \"C++\", \"Swift\"}");
            System.exit(1);
        }

    }


    public String toString() {
        return "Developer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
