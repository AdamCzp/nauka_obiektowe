public class Komputer {
    public void Uruchom(){
        System.out.println("Komputer Uruchomiony");
    }
}
class Laptop extends Komputer{
@Override
    public void Uruchom(){
        System.out.println("Laptop Uruchomiony");

    }
}