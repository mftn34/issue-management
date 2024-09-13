# Issue-Management

## Açıklama 
* Proje FullStack olarak uçtan uca Frontend (TypeScript - Angular 7.2) ve Backend (JAVA - SpringBoot - PostgreSQL) geliştirmeleri yapılmaktadır.

## Gereksinimler
* Java Development Kit 8 (JDK8)
* IntelliJ
* IntelliJ Lombok Plugini
* PostgreSQL Server
* NodeJS
* Angular CLI


## Çalıştırma
* Projeyi intelllij ile açmak için - edit configuration ayarları yapılmalıdır. alt+shift+f10 ile pencere açılır.
* Bu proje maven&spring projesi olduğundan dolayı maven menüsü seçilip working direcktory alanına project path verilir. Command line alanına ise "spring-boot:run" yazılır.Run butonu ile proje build edilir.

* bilgisayara nodejs ve angular cli 7.3.0 yuklenmelidir.npm install -g @angular/cli@7.3.0
* Bilgisayarda postgresql kurulu olmalıdır.
* application.properties dosyasından backend yayın yapılacak port değeri atanmalı.(default:8000)
* Aynı dosyada postgresql ayarları set edilmelidir.
  spring.datasource.url=jdbc:postgresql://localhost:5432/issuemanagement
  spring.datasource.username=postgres
  spring.datasource.password=12345
 * Backend run edilir.
 * Frontend run edilmesi için terminal açılıp webui/ klasörü içine gidilmelidir.
 * webui klasörü içinde npm install diyerek frontend localhost:4200 portundan ayağa kaldırılmış olur.

## Uygulama Görselleri:
* Register
![register](https://user-images.githubusercontent.com/33198774/109420115-d995ae80-79e1-11eb-854f-d3f6fd8392d6.png)

* Welcome
 ![welcome-page](https://user-images.githubusercontent.com/33198774/109420123-e7e3ca80-79e1-11eb-9212-fdfbeede3361.png)

* Project-List
![project-list](https://user-images.githubusercontent.com/33198774/109420143-faf69a80-79e1-11eb-9ea1-a34b014a9f53.png)

* Project Detail
![project-detail](https://user-images.githubusercontent.com/33198774/109420158-09dd4d00-79e2-11eb-8439-624d7e15c878.png)

* Issue-List
![issue-list](https://user-images.githubusercontent.com/33198774/109420186-25485800-79e2-11eb-8197-dd60a76c9d3d.png)

* Issue-Edit
![issue-edit](https://user-images.githubusercontent.com/33198774/109420204-38f3be80-79e2-11eb-9f2f-fd05ca932ec5.png)









