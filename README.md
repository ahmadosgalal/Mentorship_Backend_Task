# 1- Technical Problems #
Running the Absolute.java & StringOperations.java files will run the first and second problems respectively.
I used IntelliJ.
# 2- Technical Project #
I used Spring boot with MySQL and Postman for mocking. 
Creating a schema named "task" and modifying the password in the following file
"Mentorship\Technical project\State Machine\src\main\resources\application.properties"

    ## a. To add task ##
    POST => "localhost:8080/api/v1/task" with following body 
    "{
    "name": "Task",
    "state": "initial state"
    }"

    ## b. To delete a task ##
    DELETE => "localhost:8080/api/v1/task/id" => no body is needed

    ## c. To get a task ##
    GET => "localhost:8080/api/v1/task/id"=> no body is needed

    ## d. To update a task ##
    PUT => "localhost:8080/api/v1/task" with following body 
    "{
    "state": "new state"
    }"