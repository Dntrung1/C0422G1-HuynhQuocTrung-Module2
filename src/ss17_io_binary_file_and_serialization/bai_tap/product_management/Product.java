package ss17_io_binary_file_and_serialization.bai_tap.product_management;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
    private int codeProduct;
    private String nameProduct;
    private String Producer;
    private double price;
    private String describe;
    private static final long serialVersionUID = -9136183976601393476L;

    public Product() {
    }

    public Product(int codeProduct, String nameProduct, String product, double price, String describe) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        Producer = product;
        this.price = price;
        this.describe = describe;
    }

    public int getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(int codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getProducer() {
        return Producer;
    }

    public void setProducer(String producer) {
        Producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return codeProduct == product.codeProduct && Objects.equals(nameProduct, product.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeProduct, nameProduct);
    }

    @Override
    public String toString() {
        return "Product{" +
                "codeProduct=" + codeProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", Producer='" + Producer + '\'' +
                ", price=" + price +
                ", describe='" + describe + '\'' +
                '}';
    }
}
