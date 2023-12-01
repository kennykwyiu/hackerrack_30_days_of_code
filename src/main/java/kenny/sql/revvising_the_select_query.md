## Query
Query all columns for all American cities in the CITY table with populations larger than 100000. The CountryCode for America is USA.

The CITY table is described as follows:

![img.png](img.png)


```roomsql
select *
from city
where population > 100000 and countrycode like 'USA';
```

## Query

Query the NAME field for all American cities in the CITY table with populations larger than 120,000. The CountryCode for America is USA.

```roomsql
SELECT NAME
FROM CITY
WHERE Population > 120000 AND CountryCode = 'USA';
```