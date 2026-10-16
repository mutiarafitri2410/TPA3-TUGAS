# Character Manager — TP3 (Java Visual SIH-6406)

## Deskripsi Project

Character Manager adalah aplikasi sederhana berbasis Java untuk mengelola karakter dalam permainan. Project ini menerapkan konsep Object-Oriented Programming (OOP), termasuk class, constructor, encapsulation, enum, getter, setter, dan validasi data.

Project ini juga memiliki fitur peningkatan level karakter (*level-up*), pengelolaan mana, serta pengecekan status hidup karakter menggunakan method `isAlive()`.

## Fitur Utama

- Membuat karakter dengan nama dan tipe karakter.
- Menggunakan enum `CharacterType` dengan empat tipe: `WARRIOR`, `MAGE`, `ARCHER`, dan `ASSASSIN`.
- Menggunakan dua constructor untuk inisialisasi karakter.
- Mengatur level, hit points, dan attack karakter.
- Mengelola mana dengan validasi agar nilainya tidak negatif.
- Memeriksa status hidup karakter menggunakan `isAlive()`.
- Menampilkan informasi karakter melalui `toString()`.
- Menerapkan enkapsulasi dengan atribut `private`.

## Teknologi yang Digunakan

- Java Development Kit (JDK) 17
- Visual Studio Code
- Extension Pack for Java
- Git dan GitHub

## Struktur Folder Project

```text
TPA3 TUGAS/
├── src/
│   └── com/
│       └── unpri/
│           └── charactermanager/
│               ├── Main.java
│               └── model/
│                   ├── Character.java
│                   └── CharacterType.java
├── screenshots/
│   └── output.png
├── README.md
└── .gitignore
```

## Cara Menjalankan Program

1. Pastikan JDK 17 sudah terinstal di komputer.
2. Buka folder project menggunakan Visual Studio Code.
3. Pastikan struktur package dan folder Java sudah sesuai.
4. Jalankan file `Main.java` melalui VS Code atau terminal.

Jika ingin menjalankan melalui terminal dari folder project, gunakan perintah berikut:

```bash
javac -d out src/com/unpri/charactermanager/model/CharacterType.java src/com/unpri/charactermanager/model/Character.java src/com/unpri/charactermanager/Main.java
```

Kemudian jalankan program dengan perintah:

```bash
java -cp out com.unpri.charactermanager.Main
```

## Contoh Output Program

Program menampilkan informasi beberapa karakter, proses peningkatan level, nilai mana, dan status hidup karakter.

Contoh hasil pengecekan status hidup:

```text
isAlive: true
```

Jika hit points karakter diubah menjadi 0, hasil pengecekan `isAlive()` seharusnya menjadi `false`.

**Catatan:** Output aktual mengikuti implementasi kode Java yang digunakan dalam project.

## Screenshot Program

Screenshot hasil eksekusi program dapat dilihat pada file berikut:

![Screenshot Output Program](screenshots/output.png)

Screenshot harus diambil dari hasil eksekusi program yang sebenarnya dan disimpan dengan nama `output.png` di dalam folder `screenshots`.

## Analisis Desain dan Ekosistem Java

Dokumen analisis membahas JVM, JRE, JDK, konsep bytecode, prinsip *Write Once, Run Anywhere*, enkapsulasi, constructor, enum, rancangan UML class `Character`, serta prinsip *Open/Closed Principle*.

**Link Google Docs:**

[Analisis Desain Character Manager - TP3 AP3](https://docs.google.com/document/d/1roq-jI90jAICnyWlTC6GHILFWYF7lRAbNnJyBGq2gfg/edit?usp=sharing)

## Identitas Mahasiswa

- **Nama:** Mutiara Fitri Salbilla Harahap
- **NIM:** 253303621258
- **Mata Kuliah:** AP3
- **Tugas:** Character Manager Sprint #1
- **Bahasa Pemrograman:** Java

## Penutup

Project Character Manager dibuat sebagai bagian dari tugas TP3 AP3 untuk menerapkan konsep dasar pemrograman Java dan Object-Oriented Programming. Pengembangan project ini diharapkan dapat meningkatkan pemahaman tentang desain class, pengelolaan objek, validasi data, serta struktur program yang mudah dipelihara.