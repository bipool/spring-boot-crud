# spring-boot-crud

<p>
This is an spring boot application which is creating REST api and doing CRUD operation with mysql db.
This project will just create, read, update and delete from account table. We are using JPA hibernate for database communication 
</p

<b>To get all accounts</b><br>
GET http://localhost:8080/account/findAll

<b>To retrieve particular account</b><br>
<pre>GET http://localhost:8080/account/find/{accountId}</pre>

<b>To create an account </b><br>
<pre>POST http://localhost:8080/account/create</pre>
<pre>
{
"name": "TEST Account",
"type": 1,
"contact": "account address"
}
</pre>

<b>To update an account </b><br>
POST http://localhost:8080/account/update
<pre>
{
"name": "TEST Account",
"type": 1,
"contact": "account address"
}
</pre>


<b>To delete an account </b><br>
<pre>DELETE http://localhost:8080/account/delete/{accountId}</pre>

