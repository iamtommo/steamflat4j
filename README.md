# Steamflat4j
Jextract generated Panama bindings for steamworks_flat_api

## Usage
First load the Steam dll
```java
static {
    System.load(Path.of("path/to/steam_api64.dll").toAbsolutePath().toString());
}
```

And use the `_flat` Steam APIs:


## Building
### Requirements
JDK 22 (Panama)
Jextract
Gradle 8.7-rc-1 (jdk 22 support)

### Step 1: Generate C API header
```sh
java -classpath gson-2.10.1.jar C_API.java
```
See output in `steam_api.h`

### Step 2: Generate Java FFI
jextract -t steamflat4j --header-class-name SteamFlat4j --output src/main/java/steamflat4j steam_api.h
