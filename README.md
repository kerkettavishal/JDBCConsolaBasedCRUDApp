# JDBCConsolaBasedCRUDApp
JDBC Consol based application


It is a JDBC CRUD operation consol based application

Requirement -

1.MySQL 

2. create a Database 
 
3. create a table having name and column names as given below-
       CREATE table StudentInfo (sid int not null auto_increment,sname varchar(30) not null,sage int not null,saddress varchar(20) not null,primary key(sid));

4. go to src>>url.Properties and edit the variables
 
   url=jdbc:mysql://localhost:3306/?   (name of your DB)
   userName=?                          (enter your userName)
   password=?                          (enter yourPassword)



save the changes 