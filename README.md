# Steamflat4j
Jextract generated Panama bindings for steamworks_flat_api

## Step 1: Generate C API header
```sh
java -classpath gson-2.10.1.jar C_API.java
```
See output in `steam_api.h`

## Step 2: Generate Java FFI
jextract -t steamflat4j --header-class-name SteamFlat4j --output src/main/java/steamflat4j steam_api.h

## Requirements
JDK 22 (Panama)
Jextract
Gradle 8.7-rc-1 (jdk 22 support)
