public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean teen;

    public Person() {
        age = 0;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            teen = true;
            return teen;
        } else {
            teen = false;
            return teen;
        }
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }

    public String toString() {
        return "The full name of person1 is " + this.getFullName() + ". He/She is " + this.age
                + " years old. The teen status for this individual is " + teen + ".";
    }
}
