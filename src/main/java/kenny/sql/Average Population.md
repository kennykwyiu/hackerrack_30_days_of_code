Query the average population for all cities in CITY, rounded down to the nearest integer.

![img.png](img.png)


```roomsql
select floor(avg(population)) as AvgPopulation 
from city
```
