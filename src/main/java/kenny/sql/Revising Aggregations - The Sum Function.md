Query the total population of all cities in CITY where District is California.

![img.png](img.png)


```roomsql
select sum(population)
from city
where district = 'California';
```
