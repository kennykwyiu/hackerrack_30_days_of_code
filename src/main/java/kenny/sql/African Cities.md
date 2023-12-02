Given the CITY and COUNTRY tables, query the names of all cities where the CONTINENT is 'Africa'.

Note: CITY.CountryCode and COUNTRY.Code are matching key columns.

![img_4.png](img_4.png)
![img_5.png](img_5.png)

```roomsql
select c.name
from city as c
join country as cou on c.CountryCode = cou.code
where cou.continent = 'Africa';
```