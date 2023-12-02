Query the average population of all cities in CITY where District is California.

![img.png](img.png)


```roomsql
select avg(population) 
from city
where district = 'California';
```
