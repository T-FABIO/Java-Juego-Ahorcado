import java.util.Scanner;

public class Ahoracado {

    public static void main(String[] args) throws Exception {
        
        // Clase scanner que nos permita que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Estructura de control tipo iterativa (bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            
        }

        // Estructura de control tipo iterativa (bucle)
        
        while (!palabraAdivinada  && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras).");

            // Usamos clase scanner para pedir una letra
            System.out.print("Introduce una letra, porfavor: ");
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                // Estructura de control condicional
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra; 
                    letraCorrecta = true;
                }

            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("¡Incorrecto! te quedan " + (intentosMaximos - intentos) + " intentos.");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("!Felicidades¡ has adivinado la palabra secreta: " + palabraSecreta);
            }

        }
        
        if (!palabraAdivinada) {
            System.out.println("!Te has quedado sin intentos has perdido¡");      
        }

        scanner.close();
    }
}
