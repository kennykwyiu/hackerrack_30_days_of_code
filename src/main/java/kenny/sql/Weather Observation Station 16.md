Query the smallest Northern Latitude (LAT_N) from STATION that is greater than 38.778. 
Round your answer to 4 decimal places.

![img_1.png](img_1.png)


```roomsql
select round(min(lat_n), 4)
from station
where lat_n > 38.778;
```