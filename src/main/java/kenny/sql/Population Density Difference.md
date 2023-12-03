Query the difference between the maximum and minimum populations in CITY.


![img.png](img.png)


```roomsql
select (max(population) - min(population))
from city;
```