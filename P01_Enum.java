enum Color{
    RED("red"), GREEN("green"), BLUE("blue");

    private String value;
    Color(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
public class P01_Enum {
    public static void main(String[] args){
        Color c1 = Color.RED;

        System.out.println("Red Enum Name: "+c1.name());
        System.out.println("Red enum value: "+c1.getValue());

        for(Color color : Color.values()){
            System.out.println("Enum values: "+color.getValue());

        }
    }
}