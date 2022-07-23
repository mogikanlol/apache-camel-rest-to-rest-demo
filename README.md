# Apache Camel proxy http server

## 1. Build the project
```console
gradlew.bat clean build
```

## 2. Start server
```console
gradlew.bat server:bootRun
```

## 3. Start camel proxy
```console
gradlew.bat camel-proxy:bootRun
```

## 4. Run client
```console
gradlew.bat client:bootRun 
```

## 5. Expected result
```console
Response = body from server from Transform
```