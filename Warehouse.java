import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private int size = 0;
    public void addMaterial(MaterialType mt, String s){
        elements.put(mt,s);
    }
    public void removeMaterial(){

    }
    public void moveMaterial(){

    }
    Map<MaterialType, String> elements = new HashMap<>();
}
