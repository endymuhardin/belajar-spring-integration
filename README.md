# Contoh Kode Program Spring Integration #

## Kebutuhan Software ##

* Java 6
* Maven 3
* [RabbitMQ](http://www.rabbitmq.com/download.html)

## Cara Menjalankan ##

1. Pastikan RabbitMQ sudah aktif dan admin console bisa digunakan.
2. Secara umum, perintah untuk menjalankan aplikasi adalah sebagai berikut

```
mvn clean package exec:java -Dexec.mainClass=nama.package.NamaClass
```

`nama.package.NamaClass` akan diganti sesuai dengan contoh yang akan dijalankan


## Daftar Contoh dan Nama Class ##

1. Mengirim message ke RabbitMQ : `com.muhardin.endy.belajar.spring.integration.Pengirim`
2. Menerima message dari RabbitMQ : `com.muhardin.endy.belajar.spring.integration.Penerima`


