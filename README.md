# Optimal Game Strategy Simulator using Dynamic Programming

## Project Overview

The Optimal Game Strategy Simulator is a full-stack web application developed using Java Spring Boot, HTML, CSS, and JavaScript.

The project simulates a two-player optimal strategy game where both players play intelligently. Using Dynamic Programming and Game Theory concepts, the system computes the maximum score that the first player can guarantee.

---

# Features

- Dynamic Programming based optimal strategy calculation
- Spring Boot REST API integration
- Interactive frontend
- Invalid input handling
- Execution time display
- Optimized O(n²) solution

---

# Technologies Used

| Technology | Purpose |
|------------|---------|
| Java | Backend Logic |
| Spring Boot | REST API Development |
| HTML | Frontend Structure |
| CSS | UI Design |
| JavaScript | Frontend Logic |
| Dynamic Programming | Optimization Technique |

---

# Project Structure

```text
optimal-game-strategy/
│
├── backend/
├── frontend/
├── screenshots/
├── README.md
```

---

# How to Run the Project

## Backend

Run:

```bash
mvn spring-boot:run
```

Backend runs at:

```text
http://localhost:8081
```

---

## Frontend

Open:

```text
frontend/index.html
```

using browser or Live Server.

---

# API Endpoint

```http
POST /game/solve
```

Request:

```json
{
  "coins": [8,15,3,7]
}
```

Response:

```json
{
  "optimalScore": 22,
  "message": "Optimal strategy calculated successfully"
}
```

---

# Sample Test Cases

| Input | Expected Output |
|-------|-----------------|
| [8,15,3,7] | 22 |
| [5,3,7,10] | 15 |
| [2,2,2,2] | 4 |
| [1,2] | 2 |

---

# Application Screenshots

Screenshots are available inside the `screenshots/` folder.

---

# Author

Preeti Rajakumar Kotabagi

Computer Science and Engineering
