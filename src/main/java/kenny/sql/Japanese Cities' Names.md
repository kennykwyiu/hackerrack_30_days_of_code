Query the names of all the Japanese cities in the CITY table. The COUNTRYCODE for Japan is JPN.
The CITY table is described as follows:


![img.png](img.png)


```roomsql
select name from city
where countrycode = "JPN";
```