public class PruebaHerencia {
    public static void main(String[] args) {
        // Crear una instancia de la subclase Perro
        Perro miPerro = new Perro("LUPE ");

        // Acceder a los métodos de la superclase Animal
        miPerro.comer();
        miPerro.dormir();

        // Acceder al método de la subclase Perro
        miPerro.ladrar();
    }
}
