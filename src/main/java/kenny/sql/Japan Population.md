Query the sum of the populations for all Japanese cities in CITY. The COUNTRYCODE for Japan is JPN.

![img.png](img.png)


```roomsql
select sum(population)
from city
where countrycode = 'JPN';
```
