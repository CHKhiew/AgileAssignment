/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileassignment;

import java.util.Calendar;
import java.util.Date;


public class PickupList {
    private String CustType;
    private Calendar PickupDate;
    private String Name;
    private String PaymentMethod;
    private String ItemSelected1;
    private String ItemSelected2;
    private String ItemSelected3;
    private String ItemSelected4;
    private int ItemQuan1;
    private int ItemQuan2;
    private int ItemQuan3;
    private int ItemQuan4;
    private double ItemTPrice1;
    private double ItemTPrice2;
    private double ItemTPrice3;
    private double ItemTPrice4;
    private double TotalPrice;

    public PickupList(){
    }
    
    public PickupList(String CustType,Calendar PickupDate, String Name,String PaymentMethod,String ItemSelected1,String ItemSelected2,String ItemSelected3,String ItemSelected4,int ItemQuan1,int ItemQuan2,int ItemQuan3,int ItemQuan4,double ItemTPrice1,double ItemTPrice2,double ItemTPrice3, double ItemTPrice4, double TotalPrice){
    this.CustType = CustType;
    this.Name = Name;
    this.PickupDate = PickupDate;
    this.PaymentMethod = PaymentMethod;
    this.ItemSelected1 = ItemSelected1;
    this.ItemSelected2 = ItemSelected2;
    this.ItemSelected3 = ItemSelected3;
    this.ItemSelected4 = ItemSelected4;
    this.ItemQuan1 = ItemQuan1;
    this.ItemQuan2 = ItemQuan2;
    this.ItemQuan3 = ItemQuan3;
    this.ItemQuan4 = ItemQuan4;
    this.ItemTPrice1 = ItemTPrice1;
    this.ItemTPrice2 = ItemTPrice2;
    this.ItemTPrice3 = ItemTPrice3;
    this.ItemTPrice4 = ItemTPrice4;
    this.TotalPrice = TotalPrice;
    }
    public String getCustType() {
        return CustType;
    }

    public void setCustType(String CustType) {
        this.CustType = CustType;
    }

    public Calendar getPickupDate() {
        return PickupDate;
    }

    public void setPickupDate(Calendar PickupDate) {
        this.PickupDate = PickupDate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    public String getItemSelected1() {
        return ItemSelected1;
    }

    public void setItemSelected1(String ItemSelected1) {
        this.ItemSelected1 = ItemSelected1;
    }

    public String getItemSelected2() {
        return ItemSelected2;
    }

    public void setItemSelected2(String ItemSelected2) {
        this.ItemSelected2 = ItemSelected2;
    }

    public String getItemSelected3() {
        return ItemSelected3;
    }

    public void setItemSelected3(String ItemSelected3) {
        this.ItemSelected3 = ItemSelected3;
    }

    public String getItemSelected4() {
        return ItemSelected4;
    }

    public void setItemSelected4(String ItemSelected4) {
        this.ItemSelected4 = ItemSelected4;
    }

    public int getItemQuan1() {
        return ItemQuan1;
    }

    public void setItemQuan1(int ItemQuan1) {
        this.ItemQuan1 = ItemQuan1;
    }

    public int getItemQuan2() {
        return ItemQuan2;
    }

    public void setItemQuan2(int ItemQuan2) {
        this.ItemQuan2 = ItemQuan2;
    }

    public int getItemQuan3() {
        return ItemQuan3;
    }

    public void setItemQuan3(int ItemQuan3) {
        this.ItemQuan3 = ItemQuan3;
    }

    public int getItemQuan4() {
        return ItemQuan4;
    }

    public void setItemQuan4(int ItemQuan4) {
        this.ItemQuan4 = ItemQuan4;
    }

    public double getItemTPrice1() {
        return ItemTPrice1;
    }

    public void setItemTPrice1(double ItemTPrice1) {
        this.ItemTPrice1 = ItemTPrice1;
    }

    public double getItemTPrice2() {
        return ItemTPrice2;
    }

    public void setItemTPrice2(double ItemTPrice2) {
        this.ItemTPrice2 = ItemTPrice2;
    }

    public double getItemTPrice3() {
        return ItemTPrice3;
    }

    public void setItemTPrice3(double ItemTPrice3) {
        this.ItemTPrice3 = ItemTPrice3;
    }

    public double getItemTPrice4() {
        return ItemTPrice4;
    }

    public void setItemTPrice4(double ItemTPrice4) {
        this.ItemTPrice4 = ItemTPrice4;
    }

    public double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(double TotalPrice) {
        this.TotalPrice = TotalPrice;
    }
    
    
}
