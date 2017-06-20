# Kotlin for Swift Developers

This project focus only on Kotlin, not Android Application Developement with Kotlin. I feel the need to learning Kotlin basics and building a string Kotlin foundation before jumping into Android Development.

> PS: If you are looking to develop Android application with Kotlin, then this is not the project for you.  

## Table Of Content

-	[Requirements](#requirement)
- 	[Kotlin](#kotlin)
	-	[Data Types](#data-types)
	- 	[Casting](#casting)
	-	[Strings](#strings)
- 	[TODO](#todo)
	

## Requirements
-	Sound knowledge of computer programming
-	Either macbook or laptop running on macOS/Window repectively

- Softwares
	- [JAVA Runtime](http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html)
	- [IntelliJ IDEA CE](https://www.jetbrains.com/idea/download/)
	
## Kotlin
	
As per wiki, Kotlin is a statically-typed programming language that runs on the Java Virtual Machine and also can be compiled to JavaScript source code or uses the LLVM compiler infrastructure. Its primary development is from a team of JetBrains programmers based in Saint Petersburg, Russia.[3] While the syntax is not compatible with Java, Kotlin is designed to interoperate with Java code and is reliant on Java code from the existing Java Class Library, such as the collections framework.

The name comes from Kotlin Island, near St. Petersburg. Andrey Breslav mentioned that the team decided to name it after an island just like Java was named after the Indonesian island of Java.

### Data Types

- [Source Code](/src/DataTypes.kt)

In Kotlin, everything is an object in the sense that we can call member functions and properties on any variable. Some types are built-in, because their implementation is optimized, but to the user they look like ordinary classes.git s

	
### Casting

- [Source Code](/src/Casting.kt)

In Kotlin, you can convert a data type into another form, such as Floating number to `Int`, `Char` to `Int` & vice-versa


### Strings

- [Source Code](/src/Strings.kt)

Strings are represented by the type String. Strings are immutable. Elements of a string are characters that can be accessed by the indexing operation: s[i]. A string can be iterated over with a for-loop:

```
	for (c in str) {
   	 	println(c)
	}
```

#### String Literals

Kotlin has two types of string literals: escaped strings that may have escaped characters in them and raw strings that can contain newlines and arbitrary text. An escaped string is very much like a Java string:

`val s = "Hello, world!\n"`

## TODO

- [x] Install
- [x] Data Types
- [x] Casting
- [x] Strings
- [ ] Arrays
- [ ] Ranges
- [ ] Conditionals
- [ ] If
- [ ] When
- [ ] For
- [ ] While
- [ ] Functions
- [ ] Higher Order Functions
- [ ] Collection Operators
- [ ] Exception Handling
- [ ] Lists
- [ ] Maps
- [ ] Classes
- [ ] Inheritance
- [ ] Interfaces
- [ ] Null Safety
