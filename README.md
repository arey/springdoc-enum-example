# Example project for springdoc enum bug after upgrade from 1.6.6

Change springdoc version in build.gradle.kts to test this.

Build with ./gradlew clean build and then run with java -jar build/libs/

### In 1.6.6 there is drop-down (so enum from @schema-annotation is generated correctly)

```
[{"name":"fooBar","in":"path","required":true,"schema":{"type":"string","enum":["foo","bar"]}}]
```

![img_166.png](img_166.png)

### In 1.6.8 there isn't drop-down (so enum from @schema-annotation isn't generated as expected)

```
[{"name":"fooBar","in":"path","required":true,"schema":{"type":"string"}}]
```

![img_168.png](img_168.png)
