https://docs.google.com/document/d/1CN6YYhGFguAyPdSZx_A6Jr2wEyF5Vhsfj7_OLQYA570/edit?usp=sharing

# Character Manager — TP3 (Java Visual SIH-6406)

## Deskripsi

Character Manager adalah program Java sederhana untuk mengelola data karakter menggunakan konsep Object-Oriented Programming (OOP). Program ini menerapkan class, object, constructor, enum, encapsulation, getter/setter, dan method untuk mengelola level, HP, attack, serta mana karakter.

Program juga memiliki fitur validasi mana agar tidak menerima nilai negatif dan method `isAlive()` untuk mengetahui apakah karakter masih hidup berdasarkan nilai hit points (HP).

## Fitur

- Membuat objek karakter menggunakan dua constructor.
- Menggunakan enum `CharacterType` untuk jenis karakter.
- Menggunakan atribut private dan getter/setter.
- Menaikkan level serta memperbarui HP dan attack.
- Menyimpan dan memvalidasi mana.
- Memeriksa kondisi karakter menggunakan `isAlive()`.
- Menampilkan data melalui method `toString()`.

## Teknologi

- Bahasa pemrograman: Java
- JDK: 17
- IDE: Visual Studio Code

## Struktur Folder

```text
javavisual-tp03-253303621258/
├── CharacterManager/
│   └── src/
│       └── com/
│           └── unpri/
│               └── charactermanager/
│                   └── model/
│                       ├── CharacterType.java
│                       ├── Character.java
│                       └── Main.java
├── screenshots/
│   └── output-terminal.png
└── README.md
```

## Screenshot Output

![Output Terminal Character Manager](screenshots/output-terminal.png)

Screenshot di atas menunjukkan hasil program, termasuk demo level up, nilai mana, hasil `isAlive()`, dan validasi mana negatif.

## Identitas Mahasiswa

- **Nama:** Mutiara Fitri Salbilla Harahap
- **NIM:** 253303621258
- **Kelas:** 3 Pagi B
- **Tanggal:** 17 Oktober 2026
- **Google Docs Analisis:** [Tempel link Google Docs di sini]

## Cara Menjalankan

Jalankan perintah berikut dari folder `CharacterManager`:

```bash
javac -d out src/com/unpri/charactermanager/model/*.java
java -cp out com.unpri.charactermanager.model.Main
```
