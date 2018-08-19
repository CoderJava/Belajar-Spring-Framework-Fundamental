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

## Autowiring used Annotation
Selain autowiring menggunakan file konfigurasi XML, ada cara lainnya untuk melakukan autowiring dalam program Java, menggunakan annotation `@Autowired`. Annotation ini dapat digunakan untuk melakukan autowiring sebuah bean ke setter, constuctor, atau field. Cara kerja `@Autowired` mirip dengan autowiring byType yaitu Spring mencari referensi bean yang tipe-nya atau class-nya sama dengan tipe dari parameter setter, parameter conscructor atau field. Untuk mendukung penggunaan annotation @Autowired, header dari file **Beans.xml** harus diberi header dimana bentuknya ada 2 dan pilih salah satu bentuknya (bisa Anda lihat di file **pom.xml**).

Catatan:
1. Untuk annotation pada field, secara default `@Autowired` akan melakukan dependency checking untuk memastikan referensi bean yang ingin disuntik ditemukan. Jika referensi bean yang dimaksud tidak ditemukan maka, Spring akan melemparkan exception. 
Untuk menghindari munculnya pesan kesalahan tersebut maka dependency checking harus diset menjadi false. Jadi, saat 
referensi bean tidak ditemukan, field tersebut tidak akan disuntik atau tetap bernilai null.
2. Jika ditemukan lebih dari satu referensi bean dengan tipe atau class yang sama maka, programmer harus memerintahkan Spring
untuk memilih bean yang akan digunakan dan jika tidak maka, hasil eksekusinya menjadi tidak terprediksi. Untuk memerintahkan
Spring memilih salah satu referensi bean, gunakan annotation `@Qualifier` diikuti nama referensi bean yang dimaksud. <br />
Repository terkait: [Repository Autowired use Annotation](https://github.com/CoderJava/Spring-Framework-Autowiring-used-Annotation)

