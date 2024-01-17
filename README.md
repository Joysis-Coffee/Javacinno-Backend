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
| **status** | The status of the transaction (e.g., completed, refunded). |
| **total** | The total amount of the transaction. |

