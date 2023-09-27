package product;

public class product {
    public String name;
    public Double price;
    public int quantity;

    public product(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

        public Double totalValueInStock() {
        return this.price * this.quantity;
    }

    public void AddProduct(int quantity) {
        this.quantity += quantity;
    }

    public void RemoveProducts(int quantity) {
        this.quantity -= quantity;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return
                "name of product = " + this.name + '\n' +
                        "price = $" + String.format("%.2f", this.price) + '\n' +
                        "quantity: " + this.quantity + '\n'+
                        "total = $" + String.format("%.2f", totalValueInStock());
    }
}
