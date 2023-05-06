REM   Script: Activity 
REM   IBM SDET SQL-Activity8

select customer_id,max(purchase_amount) as highest_amount from orders
group by customer_id,purchase_amount;


select salesman_id,max(purchase_amount) as highest_amount from orders
where order_Date='17-aug-2012'
group by salesman_id,purchase_amount;

select customer_id,order_Date,max(purchase_amount) as highest_amount from orders
group by customer_id,order_Date,purchase_amount
having max(purchase_amount) between 2000 and 6000;


