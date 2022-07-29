# CRUD Operations using SpringBoot + Thymeleaf + MySQL

Used :
- Layered architecture (Controller <--> Service <--> Repository)
- Mysql Workbench
- HTML5 (Bootstrap 4)
- CRUD Functionality
- Single Page Application

## Screenshots of demo
Home Page
![HomePage](https://user-images.githubusercontent.com/67866166/147592782-2ad7ed5e-2a3b-46a2-a4f4-1a5612112486.png)
Add Item - Added item 10
![Screenshot_20211228_231649](https://user-images.githubusercontent.com/67866166/147593439-f5874db7-f01c-4d99-9b8d-f18673d0d7f9.png)
![Screenshot_20211228_231732](https://user-images.githubusercontent.com/67866166/147593442-4b62b2eb-3153-4d45-b57f-c5b80a3f179d.png)
Update Item - Updated item 10
![Screenshot_20211228_231831](https://user-images.githubusercontent.com/67866166/147593443-a1dbfecf-3c02-4974-b30c-359dd67af6e6.png)
![Screenshot_20211228_231901](https://user-images.githubusercontent.com/67866166/147593444-7c11bd6a-4953-44cf-b979-39613887e5da.png)
Delete Item - Deleted item 10
![Screenshot_20211228_231936](https://user-images.githubusercontent.com/67866166/147593445-5035d5c1-4e65-4fb7-bdeb-0c256e7dbf94.png)
Search - searches for any matching keyword in the entire row
![Screenshot_20211228_232028](https://user-images.githubusercontent.com/67866166/147593446-e7093bf7-e0d6-49fe-8fef-75b38119ea0b.png)
Database - in MySQL Workbench
![MySQL Workbench database](https://user-images.githubusercontent.com/67866166/147592349-141ff2cf-4787-46c0-bffd-f92e3b09cb13.png)

## ECLIPSE (for Enterprise Java & Web Developers)
- Spring Tool Suite 4 (Plugin)(Eclipse Marketplace)
### Spring Starter Project
![Screenshot_Eclipse_20220130161542](https://user-images.githubusercontent.com/67866166/151717243-18c14c7f-d302-451e-a105-71562be0770c.png)
### Project Dependencies (reflects in pom.xml file)
![Screenshot_Eclipse_20220130202748](https://user-images.githubusercontent.com/67866166/151717253-743e826b-e51b-4a0e-aab5-8ce61e278637.png)
### Project Folder Structure
![Screenshot_select-area_20220131021250](https://user-images.githubusercontent.com/67866166/151717190-280f37a2-ab0d-42c7-822b-4b861a627c7a.png)

## VSCode
Extensions installed :
- Spring Boot Extension Pack

Steps through command pallete (Ctrl+Shift+p) :
- Spring Initializr: Create a Maven Project
- Specific Spring Boot version - 2.6.6
- Specific project  language - Java
- Input Group Id - cart
- Artifact ID - cart_management
- Specific packaging type - Jar
- Specific Java version - 18
- Search for dependencies (reflects in pom.xml file):
  - Spring Boot DevTools
  - Spring Data JPA
  - MySQL Driver
  - Thymeleaf
  - Spring Web
