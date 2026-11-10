SELECT DATABASE();

SHOW DATABASES;
SHOW TABLES;

USE jobtracker;

SELECT COUNT(*) AS total_rows
FROM applications;


ALTER TABLE applications AUTO_INCREMENT = 1;

INSERT INTO applications 
(company_name, job_role, location, salary, application_status, applied_date)
VALUES('Infosys', 'Software Engineer', 'Mysuru', 80000, 'Offer', '2023-06-15'),
('Google', 'Software Developer', 'Bengaluru', 100000, 'Applied', '2023-01-23'),
('Microsoft', 'Data Analyst', 'Hyderabad', 90000, 'Interview', '2023-02-15'),
('Amazon', 'Cloud Engineer', 'Chennai', 95000, 'Offer', '2023-03-10'),
('Facebook', 'Frontend Developer', 'Pune', 85000, 'Rejected', '2023-04-05'),
('Apple', 'Backend Developer', 'Mumbai', 110000, 'Applied', '2023-05-20');

SELECT  AVG(salary)
FROM applications;

SELECT * FROM applications
ORDER BY SALARY ASC;

SELECT * FROM applications
WHERE job_role = 'Software Developer';

SELECT * FROM applications;

