package week5;

public class ElementaryStudent {

    private  String name;
    private  int age;

    public ElementaryStudent() {


        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    /*
    setName method should check is the name is null or empty,if it is the case
    then should throw an IllegalArgument exception
     */

    public void setName(String name) throws IllegalAccessException {
        if (name==null || name.isEmpty()){
            throw  new IllegalAccessException("Name can not be empty or null");  // if it goes inside here then
            // throws exception
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }
     // check for ages between 5 and 12
    public void setAge(int age) throws IllegalAccessException {

        if (age<5 || age>12){
            throw  new IllegalAccessException("Age can not be less than 5 or greater than 12");
        }
        this.age = age;
    }
}
