class Employee {

    // write fields
    String name;
    String email;
    int experience;

    public Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getExperience() {
        return experience;
    }
// write constructor

    // write getters
}

class Developer extends Employee {

    // write fields
    String mainLanguage;
    String[] skills;
    // write constructor

    public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return skills;
    }
// write getters
}

class DataAnalyst extends Employee {

    // write fields

    boolean phd;
    String[] methods;

    // write constructor
    public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods;

    }


    // write getters


    public boolean isPhd() {
        return phd;
    }

    public String[] getMethods() {
        return methods;
    }
}