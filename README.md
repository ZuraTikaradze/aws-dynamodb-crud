# aws-dynamodb-crud
aws-dynamodb-crud

This app is an example of how to use DynamoDB, write and read information.

Dependency :

        <dependency>
            <groupId>com.amazonaws</groupId>
            <artifactId>aws-java-sdk-dynamodb</artifactId>
            <version>1.11.815</version>
        </dependency>
        
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>


Request : 


http://localhost:8080/api/student-controller/add-student

{
	"fullName":"Zura Tikaradze",
	"age":27
}