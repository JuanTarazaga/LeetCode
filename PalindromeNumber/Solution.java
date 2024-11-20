import java.util.Scanner;

class Solution {
    public static boolean isPalindrome(int x) {
        // Convertir el número a cadena y verificar si es palíndromo
        String string = Integer.toString(x);
        //Aquí vemo la longitud del número en cuestión
        int length = string.length();
        // Después en este bucle "for" lo que hago es indicar que "i" inicia en 
        // el primer carácter, por lo tanto lo que se hace es dividir la cantidad 
        // de númros entre 2 para poder después comparar los primeros números. "i++"
        // sirve para poder pasar a la  siguiente posición
        for (int i = 0; i < length / 2; i++) {
        	
        	// Luego en este bucle se compara el primer número con el último y el 
        	// segundo con el penúltimo, ... Así se puede comprobar si estos son 
        	// iguales y retornar true o false
            if (string.charAt(i) != string.charAt(length - i - 1)) {
                return false; // No es un palíndromo
            }
        }
        return true; // Es un palíndromo
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int x = sc.nextInt(); // Leer el número del usuario

        if (isPalindrome(x)) { // Llamar al método isPalindrome
            System.out.println("El número es palíndromo.");
        } else {
            System.out.println("El número no es palíndromo.");
        }
    }
}


/* 
 * Ejemplo: 12321
 * 
 * Primera iteración (i = 0):
 * 
 * str.charAt(0): Obtiene el carácter en la posición 0 → '1'.
 * str.charAt(len - 0 - 1): Obtiene el carácter en la posición 4 (último carácter) → '1'.
 * Comparación: '1' == '1' → Coinciden.
 * El bucle continúa.
 */




