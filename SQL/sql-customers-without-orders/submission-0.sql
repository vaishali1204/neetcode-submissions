Select c.name from customers c left join orders o on c.id=o.customer_id

WHERE o.customer_id IS NULL;;