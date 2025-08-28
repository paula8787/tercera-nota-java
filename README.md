### Context:

*"Imagine you are working in a small online store project. The system must manage products: we need to register a product, sell units, add new stock and show the product information."*

### Task (in English):

1. Create a class called **Product** with the following attributes: `name`, `price`, `quantity`.
2. Implement the following methods:
    - `sell(int amount)` → decreases quantity if enough stock is available.
    - `restock(int amount)` → increases quantity.
    - `showProduct()` → prints product info.
3. Create two **objects** of type Product with different values.
4. Test all the methods.

### Bonus (for fast students):

Add a condition in `sell()` to print a message when the stock is not enough.