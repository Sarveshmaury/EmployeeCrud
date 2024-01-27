fetch all employee
http://localhost:8080/employees
-----------------------------------------
add employee
http://localhost:8080/addEmployee
{
    "name":"Shivam",
    "mobileNo":"8594637483",
    "salary":45098
}

-------------------------------------------------------
update employee
http://localhost:8080/updateEmployee/5
{
    "name":"salman Khan",
    "mobileNo":"8004637483",
    "salary":95098
}


---------------
Delete employee with emp id
http://localhost:8080/deleteEmployee/6
