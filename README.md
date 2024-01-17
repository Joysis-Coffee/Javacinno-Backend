## UML DIAGRAM
![image](https://github.com/Joysis-Coffee/Javacinno-Backend/assets/65775625/280fb114-b78a-4b8e-a33f-0673aaf3d6e0)

## Product
The Product table keeps the information about each cod product.

| Field | Description |
| --- | --- |
| **id** | A unique number for each product. |
| **name** | The name of the product. |
| type | The type or category of the product. |
| **small_price** | The price of the product in small size. |
| **medium_price** | The price of the product in medium size. |
| **large_price** | The price of the product in large size. |
| **revenue** | The total revenue generated from the product. |
| **total_items_sold** | The total number of items sold of the product. |

## Cashier
This table contains details about the cashier.

| Field | Description |
| --- | --- |
| **id** | A unique number for each cashier. |
| **user_name** | The login name for the cashier. |
| **full_name** | The full name of the cashier. |
| **password** | The password for the cashier's account. |

## Sales
Records details of each sale transaction.

| Field | Description |
| --- | --- |
| **id** | A unique number for each sale record. |
| **transaction_id** | A reference to the transaction this sale is part of. |
| **product_id** | The identifier for the product being sold. |
| **size** | The size of the product sold. |
| **price** | The price at which the product is sold. |
| **subtotal** | The total price for all items before any discounts or taxes. |
| **quantity** | The number of items of the product sold. |

## Transaction
Keeps a record of each transaction made.

| Field | Description |
| --- | --- |
| **id** | A unique number for each transaction. |
| **transaction_date** | The date when the transaction occurred. |
| **cashier_id** | The identifier for the cashier who processed the transaction. |
| **customer_name** | The name of the customer involved in the transaction. |
| **cash** | The amount of cash given by the customer. |
| **change_amount** | The amount of change returned to the customer. |
| **time_served** | The time it took to serve the customer. |
| **status** | The status of the transaction (e.g., true: completed, false: Queeing). |
| **total** | The total amount of the transaction. |



# Product API Documentation

## Endpoints

### POST - Create a New Product
`POST /api/v1/products`

**Input**
```json
{
    "name": "hot tea",
    "type": "tea",
    "small_price": "20",
    "medium_price": "30",
    "large_price": "40"
}
```

**Output**
```json
{
    "id": 5,
    "name": "hot tea",
    "type": "tea",
    "small_price": 20,
    "medium_price": 30,
    "large_price": 40,
    "revenue": 0,
    "total_items_sold": 0
}
```

### GET - Retrieve All Products
`GET /api/v1/products`

**Output**
```json
[
    {
        "id": 1,
        "name": "thrdy",
        "type": "espresso",
        "small_price": 20.00,
        "medium_price": 30.00,
        "large_price": 10.00,
        "revenue": 0.00,
        "total_items_sold": 0.00
    },
    ...
]
```

### PUT - Update Product Details
`PUT /api/v1/products/3`

**Input**
```json
{
    "name": "Espressp",
    "type": "Latte",
    "small_price": "40",
    "medium_price": "50",
    "large_price": "60"
}
```

**Output**
```json
{
    "id": 3,
    "name": "Espressp",
    "type": "Latte",
    "small_price": 40,
    "medium_price": 50,
    "large_price": 60,
    "revenue": 0.00,
    "total_items_sold": 0.00
}
```

### GET - Retrieve Product by ID
`GET /api/v1/products/5`

**Output**
```json
{
    "id": 5,
    "name": "hot tea",
    "type": "tea",
    "small_price": 20.00,
    "medium_price": 30.00,
    "large_price": 40.00,
    "revenue": 0.00,
    "total_items_sold": 0.00
}
```

### DELETE - Delete a Product
`DELETE /api/v1/products/2`

**No content is returned upon successful deletion.**



