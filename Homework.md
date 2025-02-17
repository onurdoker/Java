# Sorular:

---
### Maven nedir?
Maven, Java projelerini oluşturmak, yönetmek ve otomatikleştirmek için kullanılan bir build automation (inşa otomasyonu) aracıdır. Apache"
"tarafından geliştirilmiştir ve özellikle Java projelerinde bağımlılık yönetimi, derleme, test etme ve dağıtım süreçlerini kolaylaştırır. Maven, XML tabanlı bir yapılandırma dosyası olan pom.xml kullanarak projenin yapılandırmasını ve bağımlılıklarını yönetir.

---
### Mavenin avantajları nelerdir?
Bağımlılık Yönetimi: Projeye eklenmesi gereken kütüphaneleri otomatik olarak indirir.
Proje Yapılandırması: Projeyi standart bir yapıda düzenler.
Otomatik Derleme: Projeyi derler (mvn compile).
Test Çalıştırma: JUnit ve TestNG gibi test araçlarıyla testleri çalıştırır (mvn test).
Paketleme: Projeyi jar veya war formatında paketler (mvn package).
Dağıtım Yönetimi: Uygulamayı uzak sunuculara veya depolara gönderir (mvn deploy).

---
### Mavenin komutları nelerdir?

---
### pom.xml dosyası nedir?
`pom.xml` **(Project Object Model)** dosyası, Maven projelerinin merkezi yapılandırma dosyasıdır. Projenin bağımlılıklarını, sürüm bilgilerini, eklentilerini ve yapılandırmalarını içerir.

Örnek bir pom.xml dosyası:

```
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
### Java nedir?
Java, **nesne yönelimli (OOP), platform bağımsız, güvenli, çok iş parçacıklı (multithreading) ve taşınabilir** bir programlama dilidir.<br>
- 1995’te Sun Microsystems tarafından geliştirildi.
- "Bir kere yaz, her yerde çalıştır" (Write Once, Run Anywhere - WORA) prensibiyle çalışır.
- Mobil, web, masaüstü ve büyük ölçekli sistemlerde kullanılır.

---
### Java özelikleri nedir?
- Platform Bağımsızdır. (JVM sayesinde her yerde çalışır)
- Nesne Yönelimli Programlama (OOP) Desteği vardır.
- Güvenlidir. (Bellek yönetimi ve güvenlik mekanizmaları içerir)
- Çok İş Parçacıklı (Multithreading) çalışmayı destekler.
- Otomatik Bellek Yönetimi (Garbage Collection) yapar.
- Dağıtık ve Ağ Tabanlı Uygulamaları Destekler.

---
### JDK nedir?
**JDK (Java Development Kit)**, Java ile uygulama geliştirmek için kullanılan geliştirme ortamıdır. İçerisinde:

JRE (Java Runtime Environment) (Çalışma zamanı ortamı)
JVM (Java Virtual Machine) (Java Sanal Makinesi)
Java Compiler (javac) (Java derleyicisi)
Java Debugger (jdb) (Hata ayıklayıcı)
Java API ve kütüphaneleri bulunur.

**JDK olmadan Java kodu yazılamaz ve çalıştırılamaz.**

---
### JRE nedir?
JRE (Java Runtime Environment), Java uygulamalarını çalıştırmak için gereken ortamdır. İçerisinde:

JVM (Java Virtual Machine) bulunur.
Java Kütüphaneleri içerir.
Çalışma zamanı dosyaları bulunur.

**Eğer sadece Java programlarını çalıştırmak istiyorsanız, JDK yerine sadece JRE yükleyebilirsiniz, ancak JRE Java kodu yazmak veya derlemek için yeterli değildir.**

---
### JVM nedir?
**JVM (Java Virtual Machine)**, Java programlarını çalıştıran sanal bir makinedir. JVM sayesinde Java platform bağımsızdır çünkü Java kodu her işletim sisteminde çalışabilecek bayt koduna (.class dosyalarına) çevrilir.

**JVM’in Görevleri:**<br>
Bayt kodunu çalıştırır.<br>
Bellek yönetimini yapar (Garbage Collection).<br>
Çoklu iş parçacığını (multithreading) destekler.<br>
Platform bağımsızlığı sağlar.<br>

---
### Compiler nedir?
**Compiler (Derleyici)**, insan tarafından yazılan yüksek seviyeli programlama dillerini makine koduna veya bayt koduna dönüştüren bir programdır. Java’da derleyici javac olarak adlandırılır.

**Java'da Çalışma Süreci:**<br>
Java kodu yazılır: `MyClass.java`<br>
Derleyici (javac) çalıştırılır: `javac MyClass.java`<br>
Bayt kodu (.class dosyası) oluşturulur: `MyClass.class<br>
JVM bayt kodunu çalıştırır.<br>

---
### Interpreter nedir? 
**Interpreter (Yorumlayıcı),** programın satır satır çalıştırılmasını sağlayan bir programdır.
Java’da **JVM içerisinde yer alan yorumlayıcı (interpreter)**, bayt kodlarını satır satır çalıştırır.

---
### Interpreter ile Compiler arasındaki farklar nelerdir?
**Compiler (Derleyici):** Programı bir seferde derler ve hata varsa program çalıştırılmadan önce hataları gösterir. Derleme sonucunda makine kodu veya bayt kodu oluşturur.<br>
**Interpreter (Yorumlayıcı):** Programı satır satır yorumlar ve çalıştırır. Hata varsa program çalıştırılırken hatalar gösterilir. 

---
### Data türleri nedir?

### primitive type nedir?

### wrapper type nedir?

### Stack Memory nedir?
### Heap Memory nedir?

### Escape karakterler nedir?

### Scanner Class nedir?
