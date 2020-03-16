#### [commons-lang.argument](../templates/commons-lang.argument.postfixTemplates)
> Argument check for `Array/Collection/Map/String/Boolean`
- Utility classes preferred to use if available, otherwise using JDK methods.
    - `org.apache.commons.lang3.Validate`
    - `org.apache.commons.lang.Validate`
    - `com.google.common.base.Preconditions`
    - `org.springframework.util.Assert`
- Available postfix    
    - `.requireTrue` Check the `Boolean` argument to be true.
    - `.requireNotFalse` Check the `Boolean` argument not to be false.
    - `.requireNotBlank` Check the `String`  argument not to be blank.
    - `.requireNotNull` Check the `Non-Void` argument not to be null.
    - `.requireNotEmpty` Check the `Array/Collection/Map` argument not to be empty.
    - `.requireNotContainsNull` Check the `Array/Collection` argument not contains null element.
