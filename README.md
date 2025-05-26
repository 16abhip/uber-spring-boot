# 🚗 Uber Ride Booking Backend

A robust, scalable, and production-ready backend inspired by Uber. Built using **Java Spring Boot**, integrated with **PostgreSQL**, secured with **JWT**, and deployed on **AWS Elastic Beanstalk**. It provides key ride-booking functionalities including real-time matching, dynamic pricing, wallet/payment systems, and more.

---

## 🔧 Tech Stack

- **Java 17 + Spring Boot** – Backend development and RESTful APIs
- **Spring Security + JWT** – Authentication & Authorization (with refresh tokens)
- **PostgreSQL** – Primary data storage with spatial support for geo-queries
- **Hibernate & JPA** – ORM for managing persistence
- **OSRM API** – Route and distance optimization
- **AWS Elastic Beanstalk & RDS** – Deployment and database hosting
- **Swagger/OpenAPI** – API documentation and testing
- **Maven** – Project build tool

---

## 🎯 Key Features

- 🔐 **JWT-based Authentication & Role-based Authorization**
- 📍 **Rider-Driver Matching** with real-time availability
- 💸 **Wallet & Payment Services** (cash/digital support, audit tracking)
- 📈 **Dynamic Pricing Strategies** using Strategy Pattern
- 📬 **Email Notifications** for events and confirmations
- 🌍 **Geospatial Queries** with spatial indexing
- ⚙️ **CI/CD Pipeline** using AWS CodePipeline
- 📜 **Well-documented APIs** using Swagger

---

## 🔐 Test Users

Use these credentials to test different roles in Swagger or Postman:

| Role   | Email               | Password        |
|--------|---------------------|-----------------|
| Rider  | `david@rider.com`   | `DavidPassword` |
| Driver | `rahul@driver.com`  | `RahulPassoword`|
| Admin  | `abhi@admin.com`    | `pJJasassa`     |

---

## 🧱 Modules & Services

- `AuthService` – Login, signup, token refresh
- `RiderService` – Request rides, view history
- `DriverService` – Accept rides, manage profile
- `RideService` – Manage ride lifecycle
- `RequestRideService` – Core ride request logic
- `WalletService` – Wallet and transactions
- `PaymentService` – Payments and refunds
- `RatingService` – Rider/driver feedback
- `EmailSenderService` – Email notifications
- `DistanceService` – OSRM route calculations
- `UserService` – Core user operations

---

## 🧩 Entity Overview

- `User`, `Driver`, `Rider`
- `Ride`, `RideRequest`, `Rating`
- `Wallet`, `WalletTransaction`
- `Payment`

---

## 🧪 Running Locally

```bash
# Clone the repo
git clone https://github.com/your-username/uber-backend.git
cd uber-backend

# Configure DB in application.yml or use env variables

# Run the app
./mvnw spring-boot:run
