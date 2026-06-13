# Program Pengecekan Dua Stack Menggunakan Java

## Penggunaan Stack

Program menggunakan struktur data **Stack** yang tersedia pada package `java.util.Stack`.

Stack adalah struktur data yang bekerja dengan prinsip **LIFO (Last In First Out)**, yaitu elemen yang terakhir masuk akan menjadi elemen pertama yang keluar.

Contoh:

```java
Stack<Integer> stack1 = new Stack<>();
```

Perintah untuk menambahkan data ke stack menggunakan method `push()`.

```java
stack1.push(10);
stack1.push(20);
stack1.push(30);
```

Isi stack:

```text
TOP
 ↓
30
20
10
```

Karena Stack bersifat LIFO, maka jika dilakukan `pop()`, nilai yang keluar terlebih dahulu adalah:

```text
30
```

---

# Penjelasan Kode Program

### Import Library

```java
import java.util.Stack;
```

Digunakan untuk mengimpor class Stack dari package Java Collection Framework.

---

### Membuat Class

```java
public class CekStack {
```

Mendefinisikan class utama bernama `CekStack`.

---

### Method Main

```java
public static void main(String[] args) {
```

Method utama yang pertama kali dijalankan saat program dieksekusi.

---

### Membuat Stack Pertama

```java
Stack<Integer> stack1 = new Stack<>();
```

Membuat objek Stack bernama `stack1`.

---

### Membuat Stack Kedua

```java
Stack<Integer> stack2 = new Stack<>();
```

Membuat objek Stack bernama `stack2`.

---

### Mengisi Stack Pertama

```java
stack1.push(10);
stack1.push(20);
stack1.push(30);
```

Menambahkan data ke dalam stack pertama menggunakan method `push()`.

Isi stack pertama:

```text
[10, 20, 30]
```

---

### Mengisi Stack Kedua

```java
stack2.push(10);
stack2.push(20);
stack2.push(30);
```

Menambahkan data ke dalam stack kedua menggunakan method `push()`.

Isi stack kedua:

```text
[10, 20, 30]
```

---

### Membuat Variabel Pembanding

```java
boolean sama = true;
```

Variabel `sama` digunakan untuk menyimpan hasil pengecekan kedua stack.

Nilai awal:

```text
true
```

---

### Perulangan Selama Stack Tidak Kosong

```java
while(!stack1.isEmpty())
```

Perulangan akan berjalan selama stack pertama masih memiliki elemen.

Method:

```java
isEmpty()
```

digunakan untuk memeriksa apakah stack kosong atau tidak.

---

### Mengambil Elemen Teratas

```java
stack1.pop()
```

Mengambil sekaligus menghapus elemen paling atas dari stack pertama.

Contoh:

```text
[10,20,30]
```

Setelah `pop()`:

```text
30 keluar
```

Sisa:

```text
[10,20]
```

---

### Membandingkan Nilai Stack

```java
if(!stack1.pop().equals(stack2.pop()))
```

Membandingkan elemen teratas dari kedua stack.

Contoh:

```text
30 dibandingkan 30
20 dibandingkan 20
10 dibandingkan 10
```

Jika ada nilai yang berbeda maka kondisi bernilai true.

---

### Mengubah Status Menjadi Tidak Sama

```java
sama = false;
```

Jika ditemukan perbedaan nilai, variabel `sama` diubah menjadi `false`.

---

### Menghentikan Perulangan

```java
break;
```

Menghentikan proses pengecekan karena sudah ditemukan perbedaan.

---

### Menampilkan Hasil

```java
if(sama)
```

Jika variabel `sama` masih bernilai `true`, maka program menampilkan:

```text
Kedua Stack Sama
```

---

### Menampilkan Hasil Tidak Sama

```java
else
```

Jika variabel `sama` bernilai `false`, maka program menampilkan:

```text
Kedua Stack Tidak Sama
```

---

# Contoh Output

### Data Sama

```text
Stack 1 : [10,20,30]
Stack 2 : [10,20,30]

Kedua Stack Sama
```

### Data Berbeda

```text
Stack 1 : [10,20,30]
Stack 2 : [10,20,40]

Kedua Stack Tidak Sama
method `pop()`. Ji seluruh elemen yang dibandingkan memiliki nilai yang sama, maka program menampilkan pesan **"Kedua Stack Sama"**, sedangkan jika terdapat perbedaan nilai maka program menampilkan pesan **"Kedua Stack Tidak Sama"**.
