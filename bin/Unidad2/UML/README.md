
# Project Title

+-----------------------+          +-------------------+
|    Category           |<>------->|     Product       |
+-----------------------+          +-------------------+
| - name: String        |          | - name: String    |
| - description: String |          | - price: double   |
+-----------------------+          +-------------------+
| +getInfo(): String    |          | +getInfo(): String |
+-----------------------+          +------------------+
        ↑
        |
        |  (composition)
        |
+--------------------------------+
|      Order                     |
+--------------------------------+
| - date: String                 |
| - total: double                |
| - products: List<Product>      |
+--------------------------------+
| +addProduct(p: Product): void  |
| +getInfo(): String             |
+--------------------------------+
        ↑
        |
        |  (association)
        |
+------------------------------+
|    Customer                  |
+------------------------------+
| - name: String               |
| - email: String              |
| - orders: List<Order>        |
+------------------------------+
| +placeOrder(o: Order): void  |
| +getInfo(): String           |
+------------------------------+


