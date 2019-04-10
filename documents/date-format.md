#### [date-operation](../templates/date-operation.postfixTemplates)
> Templates for operate on the old fashioned `Date/Calendar` API
- Utility classes preferred to use if available for these templates
    - `org.apache.commons.lang3.time.DateFormatUtils`
    - `org.apache.commons.lang3.time.FastDateFormat`
    - `org.apache.commons.lang.time.DateFormatUtils`
- Required the `Apache Commons Lang` library available, `Apache Commons Lang 3.x` is recommended. Choose one of the follows
    - [Apache Commons Lang 3.x](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3)
    ```xml
      <!-- https://mvnrepository.com/artifact/org.apache.commons/commons-lang3 -->
      <dependency>
          <groupId>org.apache.commons</groupId>
          <artifactId>commons-lang3</artifactId>
          <version>3.8.1</version>
      </dependency>
    ```
    - [Apache Commons Lang 2.6](https://mvnrepository.com/artifact/commons-lang/commons-lang)
    ```xml
      <!-- https://mvnrepository.com/artifact/commons-lang/commons-lang -->
      <dependency>
          <groupId>commons-lang</groupId>
          <artifactId>commons-lang</artifactId>
          <version>2.6</version>
      </dependency>
    ```
- Available postfix 
    - `Apache Ccommons Lang 2.5+ and 3.x`
        - `.format`
        - `.formatToMillisecond` Use `yyyy-MM-dd HH:mm:ss SSS` date format
        - `.formatToSecond` Use `yyyy-MM-dd HH:mm:ss` date format
        - `.formatToMinute` Use `yyyy-MM-dd HH:mm` date format
        - `.formatToHour` Use `yyyy-MM-dd HH` date format
        - `.formatToDay` Use `yyyy-MM-dd` date format
        - `.formatToMonth` Use `yyyy-MM` date format
        - `.formatToYear` Use `yyyy` date format
    - `Apache Ccommons Lang 3.x Only`
        - `.parseToDate`
        - `.parseToDateFromMillisecond` Use `yyyy-MM-dd HH:mm:ss SSS` date format
        - `.parseToDateFromSecond` Use `yyyy-MM-dd HH:mm:ss` date format
        - `.parseToDateFromMinute` Use `yyyy-MM-dd HH:mm` date format
        - `.parseToDateFromHour` Use `yyyy-MM-dd HH` date format
        - `.parseToDateFromDay` Use `yyyy-MM-dd` date format
        - `.parseToDateFromMonth` Use `yyyy-MM` date format
        - `.parseToDateFromYear` Use `yyyy` date format