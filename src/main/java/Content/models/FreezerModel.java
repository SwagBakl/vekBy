package Content.models;

public class FreezerModel {

    private String modelName;
    private String energyClass;
    private Integer capacity;
    private Double price;

    public FreezerModel(String modelName, String energyClass, Integer capacity, Double price) {
        this.modelName = modelName;
        this.energyClass = energyClass;
        this.capacity = capacity;
        this.price = price;
    }

    public FreezerModel(String modelName, Double price) {
        this.modelName = modelName;
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getEnergyClass() {
        return energyClass;
    }

    public void setEnergyClass(String energyClass) {
        this.energyClass = energyClass;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
