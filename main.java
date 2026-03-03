class Principal {

    public static void main(String[] args) {


        Persona autor = new Persona("Gabriel García Márquez", "Colombiano");
        Persona director = new Persona("Christopher Nolan", "Británico");


        Material libro1 = new Libro("L001", "Cien Años de Soledad", 1967, autor, 417);
        Material dvd1 = new DVD("D001", "Inception", 2010, director, 148);


        Material[] materiales = {libro1, dvd1};


        ((Prestable) libro1).prestar();
        ((Prestable) dvd1).prestar();
        ((Prestable) libro1).devolver();

        System.out.println("\n--- ESTADO FINAL ---\n");


        for (Material m : materiales) {
            m.mostrarDetalles();
            System.out.println("--------------------------");
        }
    }
}
