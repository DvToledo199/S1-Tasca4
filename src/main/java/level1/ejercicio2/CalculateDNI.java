package level1.ejercicio2;

public class CalculateDNI {

    private static final String LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";


    public static char calculateDniLetter(int dniNumber){
        if(dniNumber < 0 || dniNumber > 99999999){
            throw new IllegalArgumentException("Invalid DNI numbre.");
        }
    int remainder = dniNumber % 23;
    char letter = LETTERS.charAt(remainder);
    return letter;
    }

}
