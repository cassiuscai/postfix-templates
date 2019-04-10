#### [date-operation](../templates/date-operation.postfixTemplates)
> Templates for operate on the old fashioned `Date/Calendar` API
- Utility classes preferred to use if available for these templates
    - `org.apache.commons.lang3.time.DateUtils`
    - `org.apache.commons.lang.time.DateUtils`
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
    - `.addMilliseconds`
    - `.addSeconds`
    - `.addMinutes`
    - `.addHours`
    - `.addDays`
    - `.addWeeks`
    - `.addMonths`
    - `.addYears`
    - `.setMilliseconds`
    - `.setSeconds`
    - `.setMinutes`
    - `.setHours`
    - `.setDays`
    - `.setWeeks`
    - `.setMonths`
    - `.setYears`
    - `.ceilMillisecond`
    - `.ceilSecond`
    - `.ceilMinute`
    - `.ceilHour`
    - `.ceilDay`
    - `.ceilMonth`
    - `.ceilYear`
    - `.floorMillisecond`
    - `.floorSecond`
    - `.floorMinute`
    - `.floorHour`
    - `.floorDay`
    - `.floorMonth`
    - `.floorYear`
    - `.roundMillisecond`
    - `.roundSecond`
    - `.roundMinute`
    - `.roundHour`
    - `.roundDay`
    - `.roundMonth`
    - `.roundYear`
    - `.toCalendar`
    - `.toCalendarWithTimeZone`