import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private int size;
    private Map<String, Integer> elements = new HashMap<>();
    public void addMaterial(){
        
    }
    public void removeMaterial(){

    }
    public void moveMaterial(){

    }
    private class WarehouseMaterial{
        int count;
        Material material;
        void addMaterial(int count) throws SpecifiedQuantityExeption {
            if(count > material.getMaxCapacity()){
                throw new SpecifiedQuantityExeption();
            }
            this.count += count;
        }
        void removeMaterial(int count) throws NotExistExeption {
            if(this.count == 0){
                throw new NotExistExeption();
            }
            this.count -= count;
        }
    }
}
