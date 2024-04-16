public class MaterialType {
    private String name;
    private String description;
    private String icon;
    private int maxCap;

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public void setDescription(String desc) { description = desc; }
    public String getDescription() { return description; }
    public void setIcon(String icon) { this.icon = icon; }
    public String getIcon() { return icon; }
    public void setMaxCap(int maxCap) { this.maxCap = maxCap; }
    public int getMaxCap() { return maxCap; }
    public MaterialType() {}
    public MaterialType(String name, String desc, String icon, int maxCap){
        this.name = name;
        description = desc;
        this.icon = icon;
        this.maxCap = maxCap;
    }
}
