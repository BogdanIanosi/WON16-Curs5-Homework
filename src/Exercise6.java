public class Exercise6 {
    public static void main(String[] args) {
        String input = "Ana are mere. Afara este cald. Maine este Joi.";
        printPropozitii(input);
    }

    public static void printPropozitii(String input) {
        String[] propozitii = input.split("\\.");
        for (String propozitie : propozitii) {
            propozitie = propozitie.trim();
            if (!propozitie.isEmpty()) {
                System.out.println(propozitie + ".");
            }
        }
    }
}