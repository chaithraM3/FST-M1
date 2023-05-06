REM   Script: Activity 
REM   IBM SDET SQL-Activity10

select c.order_no,a.salesman,b.customer_id,b.customer_name
from salesman a,customers b,orders c
where a.salesman_id=b.salesman_id
and b.customer_id=c.customer_id
and b.customer_id=3007;


select c.order_no,a.salesman,b.customer_id,b.customer_name
from salesman a,customers b,orders c
where b.customer_id=c.customer_id
and a.salesman_city=b.city
and b.city='Newyork';



