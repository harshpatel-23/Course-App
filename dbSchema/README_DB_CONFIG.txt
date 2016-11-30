This project has Tomcat set up the Data Source we are using.

To do this:
1.   Add the context.xml file (under META-INF directory) 

2.   Add the resource-ref tag to the web.xml file

3.   You need the JDBC driver -- put that .jar file in the WEB-INF lib folder.
     Currently there is a MYSQL driver there, but if you want to use a different
     version of it or you want to use a different database driver, you know where
     it is.
     
4.   You also need the JSTL .jar files in the WEB-INF/lib folder since this project
     is using JSTL