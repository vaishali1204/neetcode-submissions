SELECT seller_name
FROM seller
LEFT JOIN orders
ON seller.seller_id = orders.seller_id
AND sale_date >= '2020-01-01'
AND sale_date < '2021-01-01'
WHERE orders.seller_id IS NULL
ORDER BY seller_name ASC;