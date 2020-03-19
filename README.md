The backend is bootstrapped by Spring Boot and ORM is bootstrapped by MySQL database. Make sure your machine powers Java 8 or higher.
There is another Node.js version in the client repository. Make sure you have Node.js installed.

## Available Scripts

In the project directory, run the `main` method to boost the server. 

## Architecture

The backend follows typical MVC design pattern. Following layers are developed in order: Entity to define the model, JPA interface for CRUD manipulation, service layer and rest controller with injected service component. A schematic representation is shown in this figure. 

![architeture](backend_architecture.png)

## REST API List

We develop the following REST API for CRUD methods.

### For customer

In the Customer Rest Controller, we power

1. `GET   /api/customer` get a list of customers from database
2. `GET   /api/customer/{id}` get a specific customer by its id
3. `POST  /api/customer` post a new customer to database
4. `PUT   /api/customer/{id}` update a customer's information by its id

## For policy

In the Policy Rest Controller, we power

1. `GET   /api/customer/policy` get a list of all policies from database
2. `GET   /api/customer/{id}/policy` get a list of policies of a customer
3. `GET   /api/customer/{id}/policy/{policyNumber}` get policies of a customer by its id and policy number
4. `POST  /api/customer/{id}/policy` post a new policy to customer's list
5. `PUT   /api/customer/{id}/policy/{policyNumber}` update a policy info under a customer by policy number and id

## For Auto Insurances

We will have four rest controller for four entities: Auto Controller, Driver Controller, AutoInvoice Controller and AutoPayment Controller. They all follow the same structure, so we list provide a sample from Auto Controller. Also, the home insurance will also have the same structure as auto rest controller, so we will not provide a whole list. Please check the rest controller java file for detailed information. 

#### In the Auto Controller, we power

1. `GET   /api/customer/policy/{policyNumber}/auto` get a list of auto under a policy
2. `GET   /api/customer/policy/{policyNumber}/auto/{autoId}` get a specific automobile by auto id
3. `POST  /api/customer/policy/{policyNumber}/auto/` post a new auto to customer's policy list
4. `PUT   /api/customer/{id}/policy/{policyNumber}/auto/{autoId}` update a auto info under a customer by policy number, id and auto id


