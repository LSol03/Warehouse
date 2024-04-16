public class Material extends MaterialType{
    private MaterialType materialType;
    private int count;
    public void setMaterialType(MaterialType mt) { this.materialType = mt; }
    public MaterialType getMaterialType() { return materialType; }
    public void setCount(int count) { this.count = count; }
    public int getCount() {return count; }
}
