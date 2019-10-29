
package Lesson9.shapesv1.monsterExample;
 
public class HauntedHouse {
 
    public static void main(String[] args) {
        Monster m[] = new Monster[4]; //running constructor of the array class, NOT a new variable
        
        for (int i = 0; i < m.length; i++) {
            m[i] = i <2? new Zombie("Zombie " + i) : new Vampire("Vampire " + i);
        }
        
        System.out.println("Here come the Monsters!");
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i].identify());
        }
        System.out.println("And now for the attack!");
        //let x be each monster in the Monster array "m"
        for (Monster x : m) {
            x.attack();
        }
    }
    
}
