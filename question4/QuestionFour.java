package quiz4.question4;

/**
 * Created by Dorji Norbu on 24-Aug-20.
 */

public class QuestionFour {
    public static void main(String[] args) {
        Person person=new Person("Dorji Norbu",nationality.BHUTANESE,shoes.NIKE);
        System.out.println(person.shoe.getSize());
        System.out.println(person.nationality);
    }
}
class Person{
    String name; nationality nationality; shoes shoe;
    Person(String name, nationality nationality,shoes shoe){
        this.name=name;
        this.nationality=nationality;
        this.shoe=shoe;
    }
}
