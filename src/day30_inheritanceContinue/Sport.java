package day30_inheritanceContinue;

public class Sport {

    private String name;
    private int numberOfPlayers;
    private int numberOfReferre;
    private String rules;

    public Sport(String name, int numberOfPlayers, int numberOfReferre, String rules) {
        setName(name);
        setNumberOfPlayers(numberOfPlayers);
        setNumberOfReferre(numberOfReferre);
        setRules(rules);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        if (numberOfPlayers <= 0){
            System.err.println("Number of players can not be set zero or negative!!!");
            System.exit(1);
        }
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfReferre() {
        return numberOfReferre;
    }

    public void setNumberOfReferre(int numberOfReferre) {
        if (numberOfReferre <= 0){
            System.err.println("Number of referre can not be set zero or negative!!!");
            System.exit(1);
        }
        this.numberOfReferre = numberOfReferre;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferre=" + numberOfReferre +
                ", rules='" + rules + '\'' +
                '}';
    }

    public void play(){
        System.out.println("Ismail is playing " + name );
    }
}
/*

sportTask:
	1. Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfReferre, rules

			Encapsulate all the fields
					Conditions:
						1. numberOfPlayers can not be set to zero or negative
						2. numberOfReferre can not be set to zero or negative

			Add a constructor that can set all the fields

			methods:
				play()
				toString()

		2. create the following sub classes of Sport:
				1. Basketball
				2. Baseball
				3. Football
				4. AmericanFootball

			Add any missing variables or methods

			Note: you can search them on google

 */
