
package agileassignment;


public class Flower implements ProductInterface{

    private String ProductName;    
    private int ProductQuantity;
    private double ProductAmount;
    private double PromotionPrice;
    
    public Flower(){
    }
    
    public Flower(String ProductName,int ProductQuantity,double ProductAmount,double PromotionPrice){
        this.ProductName = ProductName;
        this.ProductQuantity = ProductQuantity;
        this.ProductAmount = ProductAmount;
        this.PromotionPrice = PromotionPrice;
    }

    @Override
    public String getProductName() {
        return ProductName;
    }

    @Override
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    @Override
    public int getProductQuantity() {
        return ProductQuantity;
    }

    @Override
    public void setProductQuantity(int ProductQuantity) {
        this.ProductQuantity = ProductQuantity;
    }

    @Override
    public double getProductAmount() {
        return ProductAmount;
    }

    @Override
    public void setProductAmount(double ProductAmount) {
        this.ProductAmount = ProductAmount;
    }

    @Override
    public double getPromotionPrice() {
        return PromotionPrice;
    }

    @Override
    public void setPromotionPrice(double PromotionPrice) {
        this.PromotionPrice = PromotionPrice;
    }

    
    
      
    
}

