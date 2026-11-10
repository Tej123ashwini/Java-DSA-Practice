Create database JobTracker;

    create table application (
        application_id INT PRIMARY KEY AUTO_INCREMENT,
        company_name VARCHAR(50) NOT NULL,
        job_role VARCHAR(50) NOT NULL,
        location VARCHAR(50),
        salary DECIMAL(10,2) CHECK(salary >= 0),
        application_status VARCHAR(30) NOT NULL,
        applied_date DATE NOT NULL,

        CHECK (
            application_status IN (
                'Applied',
                'Assessment',
                'Interview',
                'Offer',
                'Rejected'
            )
        )
    );

    SELECT * FROM application;