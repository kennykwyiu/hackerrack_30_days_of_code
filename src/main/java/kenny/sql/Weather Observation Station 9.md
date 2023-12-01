Query the list of CITY names from STATION that do not start with vowels. Your result cannot contain duplicates.

![img_1.png](img_1.png)


```roomsql
SELECT DISTINCT CITY
FROM STATION
WHERE CITY REGEXP '^[^aeiouAEIOU]';
```

```roomsql

SELECT DISTINCT CITY
FROM STATION
WHERE NOT (CITY LIKE 'A%' 
           OR CITY LIKE 'E%' 
           OR CITY LIKE 'I%' 
           OR CITY LIKE 'O%' 
           OR CITY LIKE 'U%');
```

```roomsql

SELECT DISTINCT CITY
FROM STATION
WHERE SUBSTRING(CITY, 1, 1) NOT IN ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
```
