package week8Abstract;
abstract class Animal{
    String name;
    int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract int getAgeInHumanYears();

    public Animal(String name, int age){
        this.name=name;
        this.age=age;
    }
}

public class Dog extends Animal {
	
	public static void main(String[] args) {
		   //TEST YOUR CODE HERE
		   Dog dog = new Dog("maxi",3,"dalmatian");
		   System.out.println(dog.toString());
		  }
	
    String breed;
    int humanYears;


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getHumanYears() {
        return humanYears;
    }

    public void setHumanYears(int humanYears) {
        this.humanYears = humanYears;
    }

    public Dog(String name, int age, String breed) {
        super( name, age );
        this.breed=breed;
    }

    @Override

    public int getAgeInHumanYears() {
        if(age<=2){
            humanYears=age*11;
        }else{
            humanYears= 22 + ((age-2) * 5);
        }
        return humanYears;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" +
        "Breed: " + getBreed() + "\n" +
        "Age in calendar years: " + getAge() + "\n"+
        "Age in human years: " + getAgeInHumanYears();
    }

public boolean equals(Dog dog) {
        
        Dog newDog = dog;
        if (!getName().equals(newDog.getName()))
            return false;
        if (getAge() != (newDog.getAge()))
            return false;
        if (!getBreed().equals(newDog.getBreed()))
            return false;
        return true;
    }

}
