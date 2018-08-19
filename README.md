# Belajar-Spring-Framework-Fundamental
Semua hasil belajar Spring Framework Fundamental

## BAB II
Untuk compile membuat file jar dengan dependencies-nya gunakan command berikut.
```
mvn clean compile assembly:single
```

## BAB III
## Setter Injection dan Constructor Injection
Setter Injection proses injeksinya dilakukan lewat setter method sedangkan, Constructor Injection proses injeksinya
dilakukan lewat constructor. Dan kedua-duanya bisa digabungkan penggunaan-nya. Setter Injection pakai tag `<property>`
sedangkan Constructor Injection pakai tag `<constructor-arg>`

## Autowiring by XML
Di Spring Framework ada istilah autowiring dimana, fungsinya adalah untuk melakukan injeksi lewat setter dan constructor secara implisit. Kalau pada modul sebelumnya Anda melakukan injeksi secara eksplisit dimana, ciri-ciri injeksi secara eksplisit adalah ada syntax `ref` yang memberitahukan bahwa nilai tersebut di injek dari bean yang mana. Namun, berbeda dengan autowiring dimana, injeksinya tidak diberitahu berasal dari bean yang mana. Dan autowiring hanya berlaku untuk objek atau reference yang didefinisikan dalam program. Dan ini tidak berlaku untuk tipe data primitif seperti `byte`, `int`, `float`, `double`, `char`, `boolean` bahkan `String`. Ada 3 tipe autowiring yaitu: `constructor`, `byName`, dan `byType`.
- `constructor` merupakan metode autowiring dengan cara mencari nama bean yang dideklarasikan di dalam `Beans.xml` yang sama namanya didalam parameter constructor yang diinjeksi.
- `byName` merupakan metode autowiring dengan mencari nama bean yang didekalarikan didalam `Beans.xml` yang sama namanya didalam parameter `setter` yang diinjeksi.
- `byType` merupakan metode autowiring dengan mencari tipe bean yang dideklarasikan didalam `Beans.xml` yang sama tipenya didalam parameter `setter` yang diinjeksi. Untuk autowiring `byType` wajib didalam `Beans.xml` harus ada 1 class yang memiliki tipe berbeda dengan bean yang lain karena injeksinya dilakukan `byType` sehingga jika ada 2 atau lebih bean yang sama tipe-nya dideklarasikan didalam `Beans.xml` maka, proses injeksinya akan gagal karena, ia bingung ada 2 tipe bean yang sama. <br />
Repository terkait: [Repository Autowiring by XML](https://github.com/CoderJava/Spring-Framework-Autowiring-by-XML)
