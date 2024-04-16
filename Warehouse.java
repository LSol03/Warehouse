import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private final int size;
    private int currentSize;
    private Map<Material, Integer> elements = new HashMap<>();
    public Warehouse(int size){
        this.size = size;
    }
    public void addMaterial(Material material, int count) throws SpecifiedQuantityExeption, FullWarehouseExeption {
        WarehouseMaterial wm = new WarehouseMaterial(material, count);
        wm.addMaterial(count);
        if(currentSize > size){
            throw new FullWarehouseExeption();
        }
        if(currentSize + count > size){
            elements.put(material, size - currentSize);
            throw  new FullWarehouseExeption();
        }else{
            elements.put(material, count);
        }
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
        WarehouseMaterial(Material material, int count){
            this.material = material;
            this.count = count;
        }
    }
}
