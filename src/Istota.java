public class Istota {
    Istota(){
        System.out.println("Istota stworzona");
    }
}
class Czlowiek extends Istota{
    Czlowiek(){
        System.out.println("Czlowiek stworzony");
    }

}
class Programista extends Czlowiek{
    Programista(){
        System.out.println("Programista Stworzony");
    }

}
