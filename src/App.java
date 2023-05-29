import java.util.Random;
import java.util.Scanner;
import com.mojang.character.Character;
import com.mojang.mob.hostilemob.Enderman;
import com.mojang.mob.pacificmob.Sheep;

public class App {
    public static void main(String[] args) throws Exception {


        Scanner keyboard = new Scanner(System.in);

        int dead = 0;
        int totalTurns = 0;
        Random rngAction = new Random();
        
        
        System.out.println("Bienvenido al asombroso mundo de maincrah, ahora Seleccione su arma");
        System.out.println("1. ninguna (1 de fuerza)");
        System.out.println("2. Espada de madera (2 de fuerza)");
        System.out.println("3. Espada de hierro (3 de fuerza)");
        System.out.println("4. Espada de diamante (5 de fuerza)");
        int sword = keyboard.nextInt();
        
        System.out.println("Qué armadura llevará el personaje en esta ronda?");
        System.out.println("1. ninguna (0 de defensa)");
        System.out.println("2. De cuero (1 de defensa)");
        System.out.println("3. De hierro (2 de defensa)");
        System.out.println("4. De diamante (3 de defensa)");
        int armor = keyboard.nextInt();

        

        Character Steve = new Character(armor, sword);

        Enderman anEnderman = new Enderman(14);

        while (dead < Steve.getHealth() || dead < anEnderman.getHealth()) {

            anEnderman.getAttack(Steve.attack());

            int randomAction = rngAction.nextInt(2);
            switch (randomAction) {
                case 0:
                    Steve.getAttack(anEnderman.attack());
                    break;
            
                case 1:
                    anEnderman.move();
                    break;
                default:
                    break;
            }
            totalTurns++;
        }
        


        System.out.println("El total de turnos ha sido: " + totalTurns);

        if(Steve.getHealth() > 0 && anEnderman.getHealth()<= 0){
            System.out.println("El ganador es Steve!!!");
        }else{
            System.out.println("Mi loco usted perdió xd");
        }
        keyboard.close();
    }
}