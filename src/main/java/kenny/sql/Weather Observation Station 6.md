Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u) from STATION. Your result cannot contain duplicates.

![img_1.png](img_1.png)


```roomsql
select distinct city from station
where city like 'a%'
or city like 'e%'
or city like 'i%'
or city like 'o%'
or city like 'u%';
```
