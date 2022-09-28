# CUS1166
Introduction: Our group will be creating software that is able to provide a system for managing and organizing computation resources and jobs in the vehicular cloud. We will discuss the design, system, user requirements, and the approach that we will take. 

Purpose: Vehicular Cloud Real Time System (VCRTS) is a  system designed for managing and organizing computation resources and jobs in the vehicle cloud. Our group will be implementing a system that will allow owners to rent out their vehicles in the Vehicular Cloud(VC) and enable clients to submit jobs and keep track of the progress and completion time of the jobs, thanks to real-time reports. 

User Requirements:
-  Owners will have the option to register their vehicles.

-  Owners will have the option to submit job openings for the vehicles in the VC to complete. 

- Owners should have access to the status of their jobs and whether the vehicle is completing 
the job within the VC.

- Vehicle cloud owner should have access to the real time report.

System Requirements 

Functional Requirements 

- If a user decides to register his vehicle into the VC, the user will be prompted to provide their ID, first name, last name, car model, car year, if it has enough computational power, and how long it is available to be rented to participate in the VC. If the ID is not a duplicate, they will be prompted with a successful registration screen and their car will be ready for future jobs. If the Id is already in the system they will be prompted with a message displaying “Car already in cloud” This information will be stored within the VCs database.  

- In order for the VC to work, it will require user input on the job that needs to be completed. If the user has a job that needs to be completed, he will click on the "submit a job" button and will be prompted to enter the job description, job id, owner id, job date, and job time. Upon creating the job, it will be cross-checked with the database to see that the job id is unique and if so, will prompt the user with a "job created" message. If the job already exists in the system, a "job already exists' message will be displayed.

- The job owner will be required to enter his/her information. The system requires the  job Owner ID and then the Job ID. After this information is entered, there will be a message that reads “Searching”. The system will then search for this information on the database. If the job is still in the Job List the message returned is “waiting”. If the job is in the Job in Progress List then the message will return “in-progress”. If the job is in the Job Completed List, the message will return “completed”. 

-The real time report will display when a new vehicle arrives on the lot where there will be a node created and added to the resource pool. It will also display when the job has started. We can also include how many vehicles are awaiting a task, in progress of a task, and finished the task. 


Non-Functional Requirements 
- The performance of a system is extremely important, as we need to understand how fast we can get our results back and how the performance will change with different workloads. The ideal wait time for each job to be completed should be under 5 seconds. 

- The system must be reliable to its users and be able to be trusted in fixing issues when they arise. How will the system react to and deal with critical failures? If there is an issue within the software the software developers would have to go back and review the issue, update the code, and fix the problem. 

- The system must be able to maintain data integrity, by updating and backing up the database constantly for every job completed and vehicle registered, thus nothing will be lost.

- The capacity of this project will be no more than 5000 vehicles and no less than 100. 

- The language for this project will mostly be in Java and SQL. We will use Java’s J frame feature to create our GUI, java to code the algorithms for jobs, and SQL for databases. 

















