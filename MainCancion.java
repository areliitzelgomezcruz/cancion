import java.util.Scanner;

public class MainCancion {

    public static void main(String[]args) {
        Scanner leer = new Scanner(System.in);
        Cancion c1 = new Cancion();
        System.out.println("Ingrese el titulo de la cancion");
        c1.setTitulo(leer.next());
        System.out.println("Ingrese el autor");
        c1.setAutor(leer.next()); 
        System.out.println(c1);

        c1.getTitulo();
        c1.getAutor();
        
    }
}
