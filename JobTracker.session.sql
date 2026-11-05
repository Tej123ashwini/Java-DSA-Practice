SELECT DATABASE();

SHOW DATABASES;
SHOW TABLES;

USE jobtracker;

SELECT COUNT(*) AS total_rows
FROM applications;

INSERT INTO applications
(company_name, job_role, location, salary, application_status, applied_date)
VALUES
('Infosys', 'Software Engineer', 'Mysuru', 80000, 'Offer', '2023-06-15');


DELETE FROM applications
WHERE company_name = 'Infosys'
AND job_role = 'Software Engineer'
AND location = 'Mysuru'
AND salary = 80000
AND application_status = 'Offer'
AND applied_date = '2023-06-15'
AND application_id <> (
    SELECT min_id
    FROM (
        SELECT MIN(application_id) AS min_id
        FROM applications
        WHERE company_name = 'Infosys'
        AND job_role = 'Software Engineer'
        AND location = 'Mysuru'
        AND salary = 80000
        AND application_status = 'Offer'
        AND applied_date = '2023-06-15'
    ) AS temp
);

INSERT INTO applications 
(company_name, job_role, location, salary, application_status, applied_date)
VALUES('Google', 'Software Developer', 'Bengaluru', 100000, 'Applied', '2023-01-23'),
('Microsoft', 'Data Analyst', 'Hyderabad', 90000, 'Interview', '2023-02-15'),
('Amazon', 'Cloud Engineer', 'Chennai', 95000, 'Offer', '2023-03-10'),
('Facebook', 'Frontend Developer', 'Pune', 85000, 'Rejected', '2023-04-05'),
('Apple', 'Backend Developer', 'Mumbai', 110000, 'Applied', '2023-05-20');


SELECT * FROM applications;

UPDATE applications
SET company_name = 'Amazon Web Services', job_role = 'Cloud Solutions Architect', location = 'Chennai', salary = 120000, application_status = 'Offer', applied_date = '2023-03-15'
WHERE application_id = 12;