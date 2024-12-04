import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        boolean con= true;
        Scanner sc= new Scanner(System.in);
        while (con) {
            System.out.println("Il tuo fornitore:  ");

            System.out.println("Nome:  ");
            String Nome = sc.nextLine();

            System.out.println("Categoria:  ");
            System.out.println("0 - PIANTE");
            System.out.println("1 - VASELLAME");
            System.out.println("2 - CONCIME");
            System.out.println("3 - GIARDINAGGIO");
            byte CategoriaNum= sc.nextByte();
            CATEGORIA categoria= CATEGORIA.values()[CategoriaNum];
            sc.nextLine();
            

            System.out.println("pIVa:   ");
            String pIva = sc.nextLine();

            System.out.println("Luogo:  ");
            String luogo = sc.nextLine();

            System.out.println("Telefono:  ");
            String Telefono = sc.nextLine();

            System.out.println("email:  ");
            String email = sc.nextLine();

            System.out.println(" linguaPrincipale:  ");
            String linguaPrincipale = sc.nextLine();

            System.out.println("iban:  ");
            String iban = sc.nextLine();

            System.out.println("nomeReferente:  ");
            String nomeReferente = sc.nextLine();

            System.out.println("note:  ");
            String note = sc.nextLine();

            System.out.println(" Vuoi consultare ancora il tuo iper-mega fornitore? (true/false):");
            con = sc.nextBoolean();
            sc.nextLine();

            System.out.println("Fine disponibilita':");

            System.out.println("");
            System.out.println("--------------------------------------");
            System.out.println("");
            System.out.println("Il tuo fornitore;  ");

            System.out.println("Nome: " + Nome);
            System.out.println("Categoria: " + CategoriaNum);
            System.out.println("pIva: " + pIva);
            System.out.println("Luogo: " + luogo);
            System.out.println("Telefono: " + Telefono);
            System.out.println("email: " + email);
            System.out.println("linguaPrincipale': " + linguaPrincipale);
            System.out.println("iban: " + iban);
            System.out.println("nomeReferente: " + nomeReferente);
            System.out.println("note:  " +note);

            System.out.println("");
            System.out.println("--------------------------------------");
            System.out.println("");
}


        sc.close();
        System.out.println("Grazie per aver scelto questo fornitore! ");

    }


}
