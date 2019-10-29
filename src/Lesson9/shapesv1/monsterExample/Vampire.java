package Lesson9.shapesv1.monsterExample;

public class Vampire implements Monster{
    
    private String name;
    public Vampire(String n){
        name = n;
    }

    @Override
    public void attack() {
        System.out.println("I am biting your shaft");
    }

    @Override
    public String identify() {
        return ("I am " + name + " the Vampire!"); 
    }
    
}
