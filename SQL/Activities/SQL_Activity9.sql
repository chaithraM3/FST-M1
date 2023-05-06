REM   Script: Activity 
REM   IBM SDET SQL-Activity9

select a.salesman_id,a.salesman,b.customer_id,b.customer_name
from salesman a,customers b
where a.salesman_id=b.salesman_id;

select a.salesman_id,a.salesman,b.customer_id,b.customer_name,b.grade
from salesman a,customers b
where a.salesman_id=b.salesman_id
and b.grade<300
order by 2;

select a.salesman_id,a.salesman,b.customer_id,b.customer_name,a.commission
from salesman a,customers b
where a.salesman_id=b.salesman_id
and a.commission>12;

select a.order_no,a.order_date,a.purchase_Amount,b.customer_name,c.commission
from orders a,customers b,salesman c
where a.salesman_id=b.salesman_id and a.salesman_id=c.salesman_id;


