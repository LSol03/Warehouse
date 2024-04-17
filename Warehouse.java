import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private final int capacity;
    private int loadingSize;
    private Map<String, WarehouseMaterial> elements = new HashMap<>();
    public Warehouse(int capacity){
        this.capacity = capacity;
    }
    public Warehouse(){
        capacity = 100;
    }
    public void addMaterial(String material, int count) {


    }
    public void removeMaterial(String material, int count) {

    }
    public void moveMaterial(){

    }
    private class WarehouseMaterial{   
        private int count;
        private int maxCount = 10;
        Material material;
        int addMaterial(int addCount){
            if (count + addCount > maxCount) {
                int returnCount = maxCount - count;
                count = maxCount;
                return returnCount * material.getSize();
            }
            else {
                count += addCount;
                return addCount * material.getSize();
            }
        }
        int removeMaterial(int removeCount) throws EmptyWarehouseExeption {
            if (count <= removeCount) { throw new EmptyWarehouseExeption(); }
            else {
                count -= removeCount;
                return removeCount * material.getSize();
            }
        }
        WarehouseMaterial(Material material, int count){
            this.material = material;
            this.count = count;
        }
    }
}