import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private final int capacity;
    private int loadingSize;
    private Map<String, WarehouseMaterial> elements = new HashMap<>();
    public Warehouse(int capacity){
        this.capacity = capacity;
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
        private Material material;
        int addMaterial(int c) throws SpecifiedQuantityExeption {
            int materialSize = 0;
            try{
                if(c + count <= maxCount){
                    materialSize =  (c + count) * material.getSize();
                    if ( c + count == maxCount) throw new SpecifiedQuantityExeption();
                } else{
                    materialSize = (maxCount) * material.getSize();
                }
            }catch (SpecifiedQuantityExeption e){
                //
            }
            return materialSize;
        }
        int removeMaterial(int c) {
            int materialSize = 0;
            try{
                if( count - c >= 0 ){
                    materialSize = (count - c) * material.getSize();
                    if(count == 0) throw new NotExistExeption();
                }else{
                    materialSize = count * material.getSize();
                }
            }catch (NotExistExeption e){
                //
            }
            return materialSize;
        }
        WarehouseMaterial(Material material, int count){
            this.material = material;
            this.count = count;
        }
    }
}