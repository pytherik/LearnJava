# LearnJava

# Contants

Das final keyword macht eine Variable unveränderbar,  
Großschreibweise ist Konvention.
```java
final double PI = 3.1415
```

# .toString()

Wenn in einer Klasse die toString method vorhanden ist,  
werden Instanzen dieser Klasse bei der Ausgabe nicht als  
Speicheradresse, sonder wie im return angegeben ausgegeben.  
```java
// class Foo
public String toString() {
    return String.format("Attribut 1: %s\nAttribute 2:",
        this.attr1, this.attr2);
```

```java
// main
System.out.println(myFoo)
```

# access modifiers (public, protected, private)


# static keyword

> static = modifier. A single copy of a variable/method  
> is created and shared. The Class owns the static member.   


