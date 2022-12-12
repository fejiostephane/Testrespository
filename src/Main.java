public class Main {
    // main method
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

        Enseignant Foyet = new Enseignant();
        System.out.println("je m'appele :"+Foyet.nom + Foyet.prenom+ ",j'ai " +Foyet.age+"ans" +",je reste à " +Foyet.ville+ ",mon mail est " + Foyet.email);

        myMethod();
        myStaticMethod();
       // myPublicMethod(); on peut pas l'appeler dans une static method

        Main Brayane = new Main();
        Brayane.myPublicMethod();

        Main myCar = new Main();
        myCar.fullThrottle();
        myCar.speed(200);


    }
    static void myMethod() {
        System.out.println("hello word");

    }
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");

    }
    public  void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);

    }

}