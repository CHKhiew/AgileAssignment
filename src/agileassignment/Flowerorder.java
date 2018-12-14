package agileassignment;

import agileassignment.ProductInterfaceOrder;





public class Flowerorder implements ProductInterfaceOrder{

    private String ProductName;    
    private int ProductQuantity;
    private double ProductAmount;
    private double PromotionPrice;
    
    public Flowerorder(){
    }
    
    public Flowerorder(String ProductName,int ProductQuantity,double ProductAmount,double PromotionPrice){
        this.ProductName = ProductName;
        this.ProductQuantity = ProductQuantity;
        this.ProductAmount = ProductAmount;
        this.PromotionPrice = PromotionPrice;
    }

    
    public String getProductName() {
        return ProductName;
    }

    
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    
    public int getProductQuantity() {
        return ProductQuantity;
    }

    
    public void setProductQuantity(int ProductQuantity) {
        this.ProductQuantity = ProductQuantity;
    }

    
    public double getProductAmount() {
        return ProductAmount;
    }

    
    public void setProductAmount(double ProductAmount) {
        this.ProductAmount = ProductAmount;
    }

    
    public double getPromotionPrice() {
        return PromotionPrice;
    }

    
    public void setPromotionPrice(double PromotionPrice) {
        this.PromotionPrice = PromotionPrice;
    }

    
    
      
    
}

