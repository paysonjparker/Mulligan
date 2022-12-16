# Mulligan
### “Connecting golfers around the world!”
##### Mulligan is a social media application centered around golf. This social media platform gives golfers the opportunity to connect with other golfers where they share with each other all things golf. They will have the ability to check-in to their favorite golf courses, compare handicaps with friends, and share highlights from their last round of golf. 
##### Mulligan fills a gap in the golf industry and is designed to bring the golf community together to one place, a space for just golf. This application will have similar features that many other social media applications are fitted with, but will also contain some features that are unique to golf. Some of these features include the ability to make posts to your timeline, see other users’ posts, comment on posts, and view other user’s profile pages. By giving users the ability to connect on a personal level with golfers around them, Mulligan aims to bring those people together within the golf community.
##### Mulligan also provides golf clubs and golf leagues a way to communicate with their members. For example, a golf league could create its own page on this site and post all the news/events of that league to this site as way to communicate with members. Mulligan’s goal is to reach all corners of the social aspect in the golf community to provide golfers with those connections.

## Technologies
<img width="400" alt="image" src="https://user-images.githubusercontent.com/90354190/208188752-06f86598-74a3-415b-a754-7c91fd46268c.png">

## Logical System Architecture
This diagram shows the design of the logical solution of this project. A primary focus of this project is to design it in N-tier architecture, so each tier of the project, and the details of that layer, are displayed in this diagram. To summarize, the project will consist of a client layer, presentation layer, business layer, data access layer, and a data persistence layer. Each of these layers can access ONLY the layer directly above and below itself. Within each container of this diagram are the logical operations of its respective layer.

<img width="400" alt="image" src="https://user-images.githubusercontent.com/90354190/208188601-e4251718-34f3-4998-8903-ccb20de9b20f.png">

## Detailed Technical Design
### General Technical Approach
Mulligan is a Spring Boot web application developed in the Spring framework using N-layer and Model, View, Controller architecture. The back-end portion of the application will be written with the Java programming language, whereas the front-end of Mulligan will be designed with Adobe XD and implemented using Thymeleaf, HTML, and CSS. The application’s data will persist in a MySQL database. All code will be managed in a GitHub repository so that code changes can be easily documented and tracked throughout the project’s timeline. All project documentation, user stories, and tasks will be managed using project management tools such as Jira, Confluence, and Microsoft Office (Excel/Word).

### Key Technical Design Decisions
This application will be created in using the Spring framework. It will be designed in N-layer architecture and use a Model, View, Controller structure. This design structure was chosen because the app is mainly a create, read, update, delete (CRUD) application so the N-layer/MVC structure is an optimal solution. 
The presentation layer will consist of all the viewable aspects of the application such as where users can view posts and account information. The business layer will hold all the logical actions for features such as logging in, registering, and making posts. The data access layer is responsible for reading data from the database to the business layer so that actions can be executed. This would include validating login credentials and editing posts. The data persistence layer is the database itself. All data for posts and user information will persist in the database/database persistence layer. The data will exist in a relational database using MySQL so that data can be organized in a structured format. This will make CRUD operations much simpler across the application.
Along with N-layer architecture, this application will also utilize Model, View, Controller (MVC) architecture. The models will be the container for all logic that relates to the application’s data. In this case, the user and post models. The controllers are responsible for handling all user requests and business logic of the application. This would include processing logins, registers, and making posts. Lastly, views will oversee all UI logic, including page navigation, text boxes, and buttons across the application.

## Database Design
The MySQL database, titled MulliganDB, will consist of two tables. Each table corresponds to its associated model in the application. For this instance, the user table corresponds with the User Model and the post table corresponds with the Post Model. Each table contains the variables from the models (including data size/type requirements) so all data from the models can persist in the database.

<img width="271" alt="image" src="https://user-images.githubusercontent.com/90354190/208189707-f8067ebe-6185-433d-917b-425d5257e480.png"> 
<img width="500" alt="image" src="https://user-images.githubusercontent.com/90354190/208189744-14a04f1b-f2e2-483e-bd08-cb371c9d098b.png"> 
<img width="500" alt="image" src="https://user-images.githubusercontent.com/90354190/208189823-ce67c5e7-e578-4710-8b69-b0cec6da10d4.png">

## Non-Functional Requirement
The non-functional requirement (NFR) of Mulligan is data integrity. This means that Mulligan will ensure that 100% of the data will be accurate, secure, persistent across the entire system. Data being displayed in the web application will be the same as the data in the database in all cases and situations. Along with being accurate, password data will need to be encrypted so that account data and accessibility is secure. 
<u>How to accomplish this requirement:<u>
