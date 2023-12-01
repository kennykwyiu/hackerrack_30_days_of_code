Query the list of CITY names from STATION that do not end with vowels. Your result cannot contain duplicates.

![img_1.png](img_1.png)


```roomsql
select distinct city from station
where not (city like '%a'
or city like '%e'
or city like '%i'
or city like '%o'
or city like '%u');
```
