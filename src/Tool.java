public class Tool {
    public String toolName;

    protected Tool(String toolName) { // kostruktor chroniony
        this.toolName = toolName;
    }


}
class Hammer extends Tool{ // klasa dziecidzna
    public Hammer(String toolName){
        super(toolName);
        // konstruktor ktory korzysta z arg z klasy bazowej
    }

}
