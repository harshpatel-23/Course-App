CREATE USER 'studentDbUser'@'localhost' IDENTIFIED BY 'studentpswd';

GRANT ALL PRIVILEGES ON cs532_jstl_zuniv.* TO 'studentDbUser'@'localhost' WITH GRANT OPTION;

SHOW GRANTS FOR 'studentDbUser'@'localhost';