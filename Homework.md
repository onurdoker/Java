# Sorular:

---
## Maven nedir?
```sh
echo "Maven, Java projelerini oluşturmak, yönetmek ve otomatikleştirmek için kullanılan bir build automation (inşa otomasyonu) aracıdır. Apache \ tarafından geliştirilmiştir ve özellikle Java projelerinde bağımlılık yönetimi, derleme, test etme ve dağıtım süreçlerini kolaylaştırır. Maven, XML tabanlı bir yapılandırma dosyası olan pom.xml kullanarak projenin yapılandırmasını ve bağımlılıklarını yönetir."
```

---
## Mavenin avantajları nelerdir?
```Shell
Bağımlılık Yönetimi: Projeye eklenmesi gereken kütüphaneleri otomatik olarak indirir.
Proje Yapılandırması: Projeyi standart bir yapıda düzenler.
Otomatik Derleme: Projeyi derler (mvn compile).
Test Çalıştırma: JUnit ve TestNG gibi test araçlarıyla testleri çalıştırır (mvn test).
Paketleme: Projeyi jar veya war formatında paketler (mvn package).
Dağıtım Yönetimi: Uygulamayı uzak sunuculara veya depolara gönderir (mvn deploy).
```

---
## Mavenin komutları nelerdir?
```Shell
```

---
## pom.xml dosyası nedir?
```Shell
`pom.xml` (Project Object Model) dosyası, Maven projelerinin merkezi yapılandırma dosyasıdır. Projenin bağımlılıklarını, sürüm bilgilerini, eklentilerini ve yapılandırmalarını içerir.

Örnek bir pom.xml dosyası:

<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId>
    <artifactId>my-app</artifactId>
    <version>1.0-SNAPSHOT</version>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <version>2.7.4</version>
        </dependency>
    </dependencies>
</project>
```

---
## Java nedir?
```Shell
```

---
## Java özelikleri nedir?
```Shell
```

---
## JDK nedir?
```Shell
```
JDK (Java Development Kit), Java ile uygulama geliştirmek için kullanılan geliştirme ortamıdır. İçerisinde:

JRE (Java Runtime Environment) (Çalışma zamanı ortamı)
JVM (Java Virtual Machine) (Java Sanal Makinesi)
Java Compiler (javac) (Java derleyicisi)
Java Debugger (jdb) (Hata ayıklayıcı)
Java API ve kütüphaneleri bulunur.

---
## JRE nedir?
```Shell
```
JRE (Java Runtime Environment), Java uygulamalarını çalıştırmak için gereken ortamdır. İçerisinde:

JVM (Java Virtual Machine) bulunur.
Java Kütüphaneleri içerir.
Çalışma zamanı dosyaları bulunur.

---
## JVM nedir?
```Shell
```
JVM (Java Virtual Machine), Java programlarını çalıştıran sanal bir makinedir. JVM sayesinde Java platform bağımsızdır çünkü Java kodu her işletim sisteminde çalışabilecek bayt koduna (.class dosyalarına) çevrilir.

**JVM’in Görevleri:**
Bayt kodunu çalıştırır.
Bellek yönetimini yapar (Garbage Collection).
Çoklu iş parçacığını (multithreading) destekler.
Platform bağımsızlığı sağlar.

---
## Compiler nedir?
```Shell
```
Compiler (Derleyici), insan tarafından yazılan yüksek seviyeli programlama dillerini makine koduna veya bayt koduna dönüştüren bir programdır. Java’da derleyici javac olarak adlandırılır.

**Java'da Çalışma Süreci:**

Java kodu yazılır: MyClass.java
Derleyici (javac) çalıştırılır: javac MyClass.java
Bayt kodu (.class dosyası) oluşturulur: MyClass.class
JVM bayt kodunu çalıştırır.

---
## Interpreter nedir? 
```Shell
```

---
## Data türleri nedir?
```Shell
```

## primitive type nedir?
```Shell
```

## wrapper type nedir?
```Shell
```

## Stack Memory nedir?
## Heap Memory nedir?
```Shell
```

## Escape karakterler nedir?
```Shell
```

## Scanner Class nedir?
```Shell
```

```Shell
```

```Shell
```

```Shell
```

```Shell
```

```Shell
```

```Shell
```
