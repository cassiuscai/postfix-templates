# Templates for plugin [Custom Postfix Templates](https://plugins.jetbrains.com/plugin/9862-custom-postfix-templates)

## Table of Contents

* Java templates
    * Library based templates
        * [slf4j](#slf4j)
        * [assertj-core](#assertj-core)
        * [mockito](#mockito)
        * [guava-string](#guava-string)
        * [guava-collection](#guava-collection)
        * [commons-lang3](#commons-lang3)
    * Functions based templates
        * [Check the Array/Collection/Map/String is or not empty](documents/misc-empty.md)
        * [Argument check for Array/Collection/Map/String/Boolean](documents/misc-argument.md)
        * [Operations for the Date/Calendar API](documents/commons-lang.date.md)
        * [Format Date to String and Parse String to Date](documents/date-format.md)

****

### [slf4j](https://www.slf4j.org/)
- [`org.slf4j.LoggerFactory`](templates/slf4j.postfixTemplates)
    - `.getLogger`
- [`org.slf4j.Logger`](templates/slf4j.postfixTemplates)
    - `.logTrace`
    - `.logDebug`
    - `.logInfo`
    - `.logWarn`
    - `.logError`

### [assertj-core](http://joel-costigliola.github.io/assertj/)
- [`org.assertj.core.api.Assertions`](templates/assertj-core.postfixTemplates)
    - `.assertThat`
    - `.assertThatCode`
    - `.assertThatObject`
    - `.assertThatThrownBy`
    - `.assertThatExceptionOfType`
    - `.assertThatIOException`
    - `.assertThatIllegalArgumentException`
    - `.assertThatIllegalStateException`
    - `.assertThatNullPointerException`
    - `.assertThatRuntimeException`

### [mockito](https://site.mockito.org/)
- [`org.mockito.Mockito`](templates/mockito.postfixTemplates)
    - `.mock`
    - `.mockWithName`
    - `.mockWithAnswer`
    - `.spy`
    - `.when`
    - `.verify`
    - `.verifyWithMode`
    - `.reset`
    - `.clearInvocations`
    - `.doThrow`
    - `.doNothing`
    - `.doAnswer`
    - `.doReturn`

### [guava-string](https://github.com/google/guava/wiki/StringsExplained)
- [`com.google.common.base.Joiner`](templates/guava-string.postfixTemplates)
    - `.join`
    - `.joinSkipNulls`
    - `.joinReplaceNull`

- [`com.google.common.base.Splitter`](templates/guava-string.postfixTemplates)
    - `.split`
    - `.splitByRegexp`
    - `.splitToFixedLength`
    - `.splitWithLimitSize`
    - `.splitToList`
    - `.splitToListByRegexp`
    - `.splitToListWithFixedLength`
    - `.splitToListWithLimitSize`
    - `.splitToMap`
    - `.splitToMapByRegexp`

- [`com.google.common.base.Strings`](templates/guava-string.postfixTemplates)
    - `.repeat`
    - `.padStart`
    - `.padEnd`
    - `.nullToEmpty`
    - `.emptyToNull`

- [`com.google.common.base.CharMatcher`](templates/guava-string.postfixTemplates)
    - `.formatToOneLine`
    - `.removeExtraWhitespace`
    - `.removeWhitespace`
    - `.trimWhitespace`
    - `.replaceWhitespace`

### [guava-collection](https://github.com/google/guava/wiki/CollectionUtilitiesExplained)

- [`com.google.common.collect.Iterables`](templates/guava-collection.postfixTemplates)
    - `.split`
    - `.splitWithSameSize`
    - `.limit`
    - `.addAllTo`
    - `.removeAll`
    - `.removeIf`
    - `.retainAll`
    - `.contains`
    - `.get`
    - `.getOrDefault`
    - `.getFirstOrDefault`
    - `.getLast`
    - `.getLastOrDefault`
    - `.getOnly`
    - `.getOnlyOrDefault`
    - `.size`
    - `.toArray`
    - `.toString`
    - `.isEmpty`
    - `.frequency`
    - `.toImmutableIterable`

- [`com.google.common.collect.Iterators`](templates/guava-collection.postfixTemplates)
    - `.split`
    - `.splitWithSameSize`
    - `.limit`
    - `.addAllTo`
    - `.removeAll`
    - `.removeIf`
    - `.retainAll`
    - `.contains`
    - `.get`
    - `.getOrDefault`
    - `.getLast`
    - `.getLastOrDefault`
    - `.getOnly`
    - `.getOnlyOrDefault`
    - `.size`
    - `.toArray`
    - `.toString`
    - `.isEmpty`
    - `.frequency`
    - `.toImmutableIterator`

- [`com.google.common.collect.Lists`](templates/guava-collection.postfixTemplates)
    - `.asList`
    - `.newArrayList`
    - `.newLinkedList`
    - `.newCopyOnWriteArrayList`
    - `.toArrayList`
    - `.toLinkedList`
    - `.toCopyOnWriteArrayList`
    - `.reverse`
    - `.partition`
    - `.split`

- [`com.google.common.collect.ImmutableList`](templates/guava-collection.postfixTemplates)
    - `.newImmutableList`
    - `.newImmutableSortedList`
    - `.toImmutableList`
    - `.toImmutableSortedList`

- [`com.google.common.collect.Sets`](templates/guava-collection.postfixTemplates)
    - `.union`
    - `.intersection`
    - `.difference`
    - `.symmetricDifference`
    - `.combinations`
    - `.powerset`
    - `.cartesianProduct`
    - `.newIdentityHashSet`
    - `.newHashSet`
    - `.newConcurrentHashSet`
    - `.newLinkedHashSet`
    - `.newTreeSet`
    - `.newCopyOnWriteArraySet`
    - `.asSet`
    - `.toHashSet`
    - `.toConcurrentHashSet`
    - `.toLinkedHashSet`
    - `.toTreeSet`
    - `.toCopyOnWriteArraySet`

- [`com.google.common.collect.ImmutableSet`](templates/guava-collection.postfixTemplates)
    - `.newImmutableSet`
    - `.toImmutableSet`

- [`com.google.common.collect.ImmutableSortedSet`](templates/guava-collection.postfixTemplates)
    - `.newImmutableSortedSet`
    - `.toImmutableSortedSet`
### [commons-lang3](https://commons.apache.org/proper/commons-lang/)
- [`org.apache.commons.lang3.exception.ExceptionUtils`](templates/commons-lang3.postfixTemplates)
    - `.getMessage`
    - `.getRootCause`
    - `.getRootCauseMessage`
    - `.getRootCauseStackTrace`
    - `.getStackFrames`
    - `.getThrowableCount`
    - `.getThrowableList`
    - `.getThrowableArray`
    - `.getStackTraceAsString`
    - `.printRootCauseStackTrace`
    - `.rethrow`
    - `.wrapAndThrow`