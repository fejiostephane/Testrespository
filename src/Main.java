public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        FirstClass myObjet = new FirstClass();
        System.out.println(myObjet.x);
        FirstClass myObjet2 = new FirstClass();
        System.out.println((myObjet2.x)*2);
        SecondClass mySObjet = new SecondClass();
        System.out.println(mySObjet.x);

        Etudiant Stephane = new Etudiant();
        System.out.println("je m'appele :"+Stephane.nom + Stephane.prenom+ ",j'ai " +Stephane.age+"ans" +",je reste à " +Stephane.ville+ ",mon mail est " + Stephane.email);
    }
}