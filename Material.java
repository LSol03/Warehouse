public class Material{
    private String name;
    private String description;
    private String icon;
    private int maxCapacity;
    public String getName() { return name; }
    public void setDescription(String desc) { description = desc; }
    public String getDescription() { return description; }
    public void setIcon(String icon) { this.icon = icon; }
    public String getIcon() { return icon; }
    public int getMaxCapacity() { return maxCapacity; }
    public Material() {}
    public Material(String name, String desc, String icon, int maxCapacity){
        this.name = name;
        description = desc;
        this.icon = icon;
        this.maxCapacity = maxCapacity;
    }

}
