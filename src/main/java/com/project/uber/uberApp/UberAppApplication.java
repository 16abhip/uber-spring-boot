package com.project.uber.uberApp;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
		info = @Info(
				title = "Uber Ride Booking Backend Application",
				version = "1.0",
				description = """
              
🚗 A robust and scalable backend service inspired by Uber, built using Spring Boot.

---

### 🧱 Tech Stack:
- **Java + Spring Boot** for REST APIs and core backend logic
- **Spring Security** with JWT authentication and refresh tokens
- **PostgreSQL with Spatial Extensions** for location-based querying
- **Hibernate + JPA** for ORM
- **Maven** for build automation
- **AWS RDS + Elastic Beanstalk** for cloud deployment
- **OSRM API** integration for efficient route and distance calculation
- **Swagger/OpenAPI** for API documentation

---

### 🚦 Key Features:
- **Authentication & Authorization** using JWT and refresh token strategy
- **Dynamic Pricing** using strategy pattern (e.g., surge pricing, top-rated drivers, nearest drivers)
- **Real-Time Driver & Rider Matching**
- **Wallet and Cash Payment Support** with transaction audit trail
- **Role-Based Access Control** and secure protected endpoints
- **CI/CD Pipelines** via AWS CodePipeline and deployment on Elastic Beanstalk

---

### 🧠 Service Layer Overview:
- **AuthService**, **RiderService**, **DriverService**, **RideService**, **RequestRideService**
- **WalletService**, **WalletTransactionService**, **EmailSenderService**, **DistanceService**, **PaymentService**, **RatingService**

---

### 🗂️ Entity Models:
Driver, Rider, Ride, RideRequest, Rating, User, Wallet, WalletTransaction, Payment

---

### 📊 High-Level Architecture:
- Controller → Service → Repository pattern
- DTOs for input/output, Entities for persistence
- Strategy and factory design patterns in pricing and notifications
- PostgreSQL + Spring Data JPA for robust data access
- Swagger for API testing and developer onboarding

---

### 🔐 Test Users (For Swagger or Postman Testing):

- 🧍‍♂️ Rider → **Email:** `david@rider.com` | **Password:** `DavidPassword`  
- 🚘 Driver → **Email:** `rahul@driver.com` | **Password:** `RahulPassoword`  
- 🛡️ Admin → **Email:** `abhi@admin.com` | **Password:** `pJJasassa`  

---

📍 Access is secured – only authenticated users with proper roles can access protected endpoints.

✨ Hosted via AWS (Elastic Beanstalk & RDS) with CI/CD powered by CodePipeline.

![Design Flow](https://i.postimg.cc/XJ8c3MXN/Screenshot-2025-05-24-at-12-28-41-PM.png)
"""
		)
)



@SpringBootApplication
public class UberAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(UberAppApplication.class, args);
	}

}
