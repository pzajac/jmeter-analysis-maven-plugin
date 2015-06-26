Simple JMeter Result Analysis
=============================
This project is based on https://github.com/afranken/jmeter-analysis-maven-plugin/ maven plugin. It was forked in order to generate reports without using maven. It's usefull especially when is analyzed performance at custumer. The biggest advantage of *JMeter Rest Analysis* is ability process subresults from jmeter `jtl` file.


How to build
------------
```
mvn install
```
Artifacts (built jar files) are in `target` folder:
```
jmeter-analysis-maven-plugin-*.jar
dependency-jars/*
```
How to generate reports
-----------------------
```
cd target
java -jar jmeter-analysis-maven-plugin-*.jar "report.jtl" "output folder"
```

Features
--------
* Text and HTML output of certain statistics (minimum, maximum, average, standard deviation, quantiles) for response duration and response size
* Output is rendered with [Freemarker][4] and can be customized
* Chart containing request duration and average of all requests
* CSV file containing durations of all response (by URL)
* CSV file containing sizes of all responses (by URL)
* Statistics and charts can be generated per request group. Request groups are defined by URL patterns.
