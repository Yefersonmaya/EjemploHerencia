public class Perro extends Animal{
    public Perro(String nombre) {
        // Llamada al constructor de la superclase
        super(nombre);
    }

    public void ladrar() {
        System.out.println(nombre + " está ladrando: ¡Guau!");
    }
}
