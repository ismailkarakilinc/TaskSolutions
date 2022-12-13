package day31_methodOverriding;

public class States {

    private String name;
    private String abbreviation;
    private String politicalParty;
    private String governor;
    private String senator;
    private int population;
    private double stateTax;

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank() || name == null){
            System.err.println("Name can not be empty,blank or null !!!");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation.isBlank() || abbreviation.isEmpty() || abbreviation == null){
            System.err.println("Abbreviation can not be empty,blank or null !!!");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty.isEmpty() || politicalParty.isBlank() || politicalParty == null){
            System.err.println("Political party can not be empty , blank or null !!!");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if (governor.isBlank() || governor.isEmpty() || governor == null){
            System.err.println("Governor can not be empty, blank or null !!!");
            System.exit(1);
        }
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator.isEmpty() || senator.isBlank() || senator == null){
            System.err.println("Senator can not be empty, blank or null !!!");
            System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population<0){
            System.err.println("Population can not be less than zero !!!");
            System.exit(1);
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if (stateTax<0){
            System.err.println("State tax can not be less than zero !!!");
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
/*
statesTask:
    1. Create a class named States:
            variables:
                name, abbreviation, politicalParty, Governor, senator, population, stateTax

            Encapsulate all the fields

            Add a constructor that can set all the fields

                        Conditions:
                            1. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            2. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            3. taxRate can not be negative
                            4. Population can not be zero or negative

            Methods:
                toString()
 */
