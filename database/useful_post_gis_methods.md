# **Few useful PostGIS methods**

</br>

[Learn PostGIS](https://postgis.net/ "postgis.net")

</br>

## 1. ST_MakePoint

Set a geometry point from value ([Learn More](https://postgis.net/docs/ST_MakePoint.html))

```sql
--Return point with unknown SRID
SELECT ST_MakePoint(-71.1043443253471, 42.3150676015829);

--Return point marked as WGS 84 long lat
SELECT ST_SetSRID(ST_MakePoint(-71.1043443253471, 42.3150676015829),4326);
```

</br>

## 2. ST_PointFromText

Set a geometry point from value ([Learn More](https://postgis.net/docs/ST_PointFromText.html))

```sql
SELECT ST_PointFromText('POINT(-71.064544 42.28787)');

SELECT ST_PointFromText('POINT(-71.064544 42.28787)', 4326);
```

</br>

## 3. ST_GeomFromText

Set a geom from value ([Learn More](https://postgis.net/docs/ST_GeomFromText.html))

```sql
SELECT ST_GeomFromText('LINESTRING(-71.160281 42.258729,-71.160837 42.259113,-71.161144 42.25932)',4269);

SELECT ST_GeomFromText('MULTILINESTRING((-71.160281 42.258729,-71.160837 42.259113,-71.161144 42.25932))');

SELECT ST_GeomFromText('POINT(-71.064544 42.28787)');

SELECT ST_GeomFromText('POLYGON((-71.1776585052917 42.3902909739571,-71.1776820268866 42.3903701743239,
-71.1776063012595 42.3903825660754,-71.1775826583081 42.3903033653531,-71.1776585052917 42.3902909739571))');
```

</br>

## 4. ST_AsGeoJSON

Returns a geometry as a GeoJSON "geometry" ([Learn More](https://postgis.net/docs/ST_AsGeoJSON.html))

```sql
-- wkb_geometry is a geom column name
ST_AsGeoJSON(wkb_geometry) 
```
