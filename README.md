<div id="top"></div>
<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Don't forget to give the project a star!
*** Thanks again! Now go create something AMAZING! :D
-->

<!-- PROJECT LOGO -->
<br />
<div>
  <h3 align="center">:notebook_with_decorative_cover: Number Difference Software Testing :notebook_with_decorative_cover:</h>

</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Daftar Isi</summary>
  <ol>
    <li>
      <a href="#about-the-author">Tentang Kami</a>
    </li>
    <li>
      <a href="#about-the-repository">Tentang Repositori</a>
      <ul>
        <li><a href="#thNumberDifference">Number Difference Program</a></li>
	<li><a href="#built-with">Alat dan Media</a></li>
	<li><a href="#getting-started">Tutorial</a></li>
</li>
      </ul>
    </li>
  </ol>
</details>


<!-- ABOUT THE AUTHOR -->
# :man_student: Tentang Kami
Halo! Repositori ini milik kelompok 4 yang beranggotakan:
1. 191524004 - Ali Nurdin
2. 191524008 - Farra Jessica
3. 191524024 - Muhamad Hasbi Islahi Azam

Kami dari kelas prodi D4 Teknik Informatika
Jurusan Teknik Komputer dan Informatika '19

<!-- ABOUT THE PROJECT -->
# :open_book: Tentang Repository
Repositori ini merupakan hasil dari pengujian program Number Difference yang dibuat untuk memenuhi tugas mata kuliah Software Testing

## :notebook: Number Difference Program
<div>
	<img width="100%" src="images/preview.png" />
</div>
Number Difference merupakan sebuah program yang menerima input sebanyak N buah bilangan bulat sehingga membentuk deret bilangan. Nilai deret bilangan tersebut dapat berupa bilangan positif, negatif atau nol. Kemudian program mencari selisih bilangan antara bilangan dengan nilai paling kecil (max) dan bilangan dengan nilai paling besar (min) pada deretan bilangan bulat tersebut. Nilai N haruslah berada pada range 1-10. Jika nilai N berada pada range valid, maka akan melakukan proses perhiungan selisih bilangan max dan bilangan min, lalu menampilkan hasilnya ke layar. Namun, jika nilai N berada di luar range, maka program akan menampilkan **`“Number difference can not be processed”.`**

Selanjutnya, program akan melakukan klasifikasi terhadap selisih nilai bilangan ke dalam 3 kelompok, yaitu kecil (kel. 1), sedang (kel. 2) dan besar (kel. 3). Proses pengelompokan di jelaskan di bawah ini:
1) Kelompok 1, selisih kecil, berada pada range 1-10 dengan menampilkan informasi **`“Small Difference”`**
2) Kelompok 2, selisih sedang, berada pada range 11-50 dengan menampilkan informasi **`“Medium Difference”`**
3) Kelompok 3, selisih besar berada pada range > 50 dengan menampilkan informasi **`“Large Difference”`**
Sementara jika memiliki selisih 0 yang tidak berada pada 3 kelompok tersebut menampilkan **`“There’s no difference”

<p align="right">(<a href="#top">back to top</a>)</p>

## :computer: Alat dan Media
* Java
* Junit
* Sonar Qube 8.9.8 LTS
* Apache Maven 3.8.1
* JDK 11

<p align="right">(<a href="#top">back to top</a>)</p>


<!-- GETTING STARTED -->
## :desktop_computer: Tutorial
Langkah-langkah dalam membuat test script menggunakan Junit:

1.  Menyelaraskan penggunaan JDK, yaitu JDK *versi 11*
![](https://lh3.googleusercontent.com/JfUnYWjqT7dw97FWwnOj8BAGHJsROCwamsqKuYSaIQN4Ln3f7JDoifA2_yEixEXvNQcpILrkNVyCQs8Swf_t-aJRYoyis3mmtCQuAucR-g4F52TFrpkLfUzV9qD96Mr7WShy_3jU)

2.  Menyelaraskan penggunaan Apache Maven, yaitu Maven *versi 3.8.1*
![](https://lh4.googleusercontent.com/19QjGl_NBJDGFGM1AfyKwHQTVIpEBMtjhBu4U1ATDM183QZrYArPFVQF4pXIqJRR7CAPJykKTgWlL0Tlqe4GO-ShFsBH0GyKouiKineTGNK29AGjVpWZSjiggJoFaB_iaIyJ2aTo)

4.  Menginstal Sonar Qube
Kami menyelaraskan penggunaan SonarQube, yaitu mengunduh Sonar Qube *versi 8.9.8 LTS*

![](https://lh3.googleusercontent.com/nrpwjRmpwqTjUEuM67u9pewjxmu08oWeMeha0QsiNFtKWYur0zQ0rLQEdi96HGy8Kr6B526e8Af8REC2q5UTZycgWEeS7z-mc69IYqSTmLStym68wG1ZVlYUYRfHkkPZlmpH7Aj3)

4.  Melakukan extract zip dari folder Sonar Qube
Masuk ke dalam folder :
`sonarqube-8.9.8.54436\sonarqube-8.9.8.54436\bin\windows-x86-64`

5.  Melakukan double click pada file `StartSonar.bat`

![](https://lh3.googleusercontent.com/k6o0TC77uPKl0IhAHZ1tN0YM5otRfSdJZVf8E_iqJru7MdFcBGvCFDLhAjzUqcZYoUvIRt3RdgANt2hKteeTEVLRRIWXcTGtpwPsbrMfpAzn4FnEFDHQ5WDCr-sDDGmuq5eJMNqG)

Ketika sudah berhasil start maka pada cmd akan menampilkan hasil seperti pada gambar di bawah ini:

![](https://lh5.googleusercontent.com/VVRHC6mUxp5PRmyAqPqYAm45e-vQgg1Q8cnrnHD3OSGTUR65rKivN0skjjMqn6aBDxPv7XkZGhZeojtuTlXmqCciNPLvFk2TaddFnV62JW7slP98K4KDG2c2bFWZCb1x6kqVjIzq)

6.  Mengakses `localhost:9000` pada browser, kemudian melakukan login dengan memasukkan:
- username: admin
- password: admin

![](https://lh3.googleusercontent.com/JDcTHJskDCaGFwKbCbJAyDb7eVlL68oEGjeNckz3uPiiTrbnvofn-XzCJlJ-Wv6ViGsDLnwM9sXK6ijruz8xVeNwQvZ3hwA6L5_vyYVeCo8ZgWyPR3rfgGNxKWg5NItC4wjF_HCA)

7.  Kemudian, setelah berhasil login akan diarahkan untuk mengganti password.
Langkah awal yang dilakukan adalah mengisi password yang sebelumnya terlebih dahulu pada field old password, kemudian mengganti dengan password baru dan mengisi nya pada field new password & confirm password.

8.  Setelah berhasil mengganti password, buatlah project baru dengan melakukan click pada button `“Manually”` >> `membuat nama project` >> `membuat token untuk dapat menghubungkan project local dengan project yang ada pada Sonar Qube` >> `menyalin token yang telah digenerate.`
    
9.  Pada folder SUT yang ada di directory local, jalankan command prompt

![](https://lh6.googleusercontent.com/jW8_2Svw-5x5lEPOmhlob3YhgXpyd_eqLOZ5Hx8YquZSrPezEGqYYLAYrvIfXOpFUFxk_5O6hEoPSoPvJhp-Sj7VF5C-gIBw6BoKyph_Rqq9RkDIPiOUtdTLiMUim23_SU9nEFvM)

Setelah command prompt dapat dibuka, jalankan perintah mvn clean install untuk melakukan instalasi maven pada project tersebut dan tunggu hingga menghasilkan informasi **BUILD SUCCESS.

![](https://lh5.googleusercontent.com/HGWgpnudy-dHSttDDwFovJqOSDxvEnXZ3M22kX9vhXWg9GWcWowkc_lmdHHnpeFBynujhvR2s8kYWOtASbraUat83d6DSQTrTL8scjwyONw_YwrH9JETk_N3Xn9ky3SwM1MMTt9z)

![](https://lh3.googleusercontent.com/P7bUnijC85gS1AWJmkrXv3U7GVh19unVpkklr19VCubCQ3Al4F7UezsUpTAK1KmUCG5NWpwAsDQ541m_UXHImLBc-hqP4uJ4EnKhtEQ-LG9YoVJc-UdVXqYJSdyXfzR7XKkTKcWx)

10.  Untuk memperbarui hasil pengujian pada project di Sonar Qube, maka tempel (paste) token yang sebelumnya telah disalin (catatan: token yang disalin harus dimodifikasi terlebih dahulu, yaitu menghapus simbol back slash ‘\’ dan menghapus spasi baris) seperti di bawah ini:

`mvn sonar:sonar -Dsonar.projectKey=NumberDifference -Dsonar.host.url=http://localhost:9000 -Dsonar.login=b6bae201dcbed33cf851c8f4037eeca6d8e98c31`

Kemudian tunggu hingga berhasil dan menghasilkan informasi **BUILD SUCCESS**

![](https://lh6.googleusercontent.com/gSIYV8mbC93rqhOc6tWPWVncESdCKGf31CmvpFsos6dUCzlMcOryF5n-lPFX57NKmgEIow1EXtcvg5ouu59DKesSqxlNhLPt82XBF8Ja4dX5GL3ERY-sJNH3nfDiBC53nztWuSlJ)

11.  Setelah itu, kita mengakses kembali `localhost:9000` pada browser dan akan tampil informasi pada project seperti ini:

![](https://lh5.googleusercontent.com/3HkgmKsX1moblqWM2AKbJ94TiLqMLiY0x-PRpz8EuVHjjBMOXsMRs7gFx2oEFhrTHlho5PIIBDwIwynZ_OlT0h3-cRu_Ej4Zh7xvuCBFveUv-2uzeOv0tEiieAMNvm2lDEWjSi3Z)

Ketika kita melakukan click pada detail project, maka akan tampil informasi dari file NumberDifferenceTest.java yang ada pada directory local, seperti dibawah ini:

![](https://lh6.googleusercontent.com/aTbdwcqoiM7AIfbqMH4l1AecpUQnLeBfSa82hb2mQlwhBCHm-ihMHz3lzUEeKC9u0N3ipYJjF3ROEfj8LME10VitlsN06QUwh4xdzVEvsf0PUXW_X72GUbOQrYPH0kRGAPKcaulI)

Catatan: Test unit telah ditambahkan pada kode di atas

Untuk membuat test script, kita dapat menambahkan nya pada file NumberDifferenceTest.java sesuai test suite yang ada dengan menggunakan Junit. Setelah test script selesai dibuat, agar dapat mengecek nya pada Sonar Qube. Kita perlu menjalankan perintah mvn clean install pada command prompt, tunggu hingga **BUILD SUCCESS**, menjalankan perintah akses token seperti pada langkah sebelumnya, tunggu hingga **BUILD SUCCESS**, dan kita dapat melihat pembaruan informasi nya pada Sonar Qube.


<p align="right">(<a href="#top">back to top</a>)</p>
