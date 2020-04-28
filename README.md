# E-Commerce-Shop

Todays world is moving towards digital era and everything is coming up online. There are many E-commerce websites on internet.This is my try to develop an application. I am learning Microservices and trying to implement the knowledge gained for improving it further. There may be mistakes feel free to point them out and suggest any changes. I'm new to this community and trying to give my best.

In this project, used Microservices and springboot. There are three core microservices along with zuul api Gateway and Eureka Naming Server. Each Service performs certain task like adding, updating, retrieving and deleting products. 

Softwares used for this Project are:
  1. MySQL: for Database implementation.
  2. Spring tool suite: To create springboot application.
  3. Postman: To run the api's created without any UI.
  
There are three services :
  1. Product Service:
      - In this service, there are seven api.
      - first is Add product. It uses Post Mapping and the data is passed to Database in JSON format.
      - URL: /productservice/addproduct
      - Second is Update Product. It uses Put Mapping.
      - URL: /productservice/addproduct
      - Third is Delete Product. It uses delete mapping.
      - URL: /productservice/deleteproduct/{productid}
      - Fourth is Get Product by id. It uses Get mapping.
      - URL: /productservice/getbyid/{productid}
      - Fifth is Get Product by category. It uses Get mapping.
      - URL: /productservice/getbycategory/{productCategory}
      - Sixth is Get Product by gender. It uses Get mapping.
      - URL: /productservice/getbygender/{gender}
      - Seventh is Get all Product. It uses Get mapping.
      - URL: /productservice/getAll
  
  2. Order Service:
      - In this service ther is one api place order.
      - Place order: It passes the data from cart table to order table.
      - It uses feignclient to pass data.
      - It uses Get Mapping
      - URL: /orderservice/placeorder/{cartid}
      
  3. Cart Service:
      - In this service there are three api
      - Add to Cart: Data from Product table is added to Cart.
      - It uses Get Mapping
      - URL: /cartservice/addtocart/{id}
      - Get by Id. 
      - It uses Get Mapping
      - URL: /cartservice/getbyid/{id}
      - Delete from Cart:
      - It uses Delete Mapping
      - URL: /cartservice/delete/{id}
    
Each service after running registers itself with naming server which is running on port 8761.
Each service request passes through Api Gateway which runs on port 8765.
