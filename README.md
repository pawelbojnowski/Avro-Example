# AVRO Showcase Project

Welcome to the AVRO Showcase Project! This repository demonstrates the capabilities of Apache Avro, a data serialization system, by exploring its core functionalities: **AVDL**, **AVPR**, and **AVSC**.

## Table of Contents

- [About Apache Avro](#about-apache-avro)
- [Features](#features)
- [Getting Started](#getting-started)
- [Examples](#examples)
    - [AVDL Example](#avdl-example)
    - [AVPR Example](#avpr-example)
    - [AVSC Example](#avsc-example)
- [How to Contribute](#how-to-contribute)
- [License](#license)

---

## About Apache Avro

Apache Avro is a compact, fast, and schema-based serialization system that is ideal for big data use cases. It supports:

- Rich data structures.
- Dynamic typing with Avro schemas.
- Binary and JSON encoding.
- Interoperability between programming languages.

## Features

This project explores:

- **AVDL (Avro Interface Definition Language):** Writing schemas in a human-readable format.
- **AVPR (Avro Protocol):** Using Avro to define and exchange protocols.
- **AVSC (Avro Schema):** Using raw JSON schemas to define data types.

## Getting Started

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/pawelbojnowski/Avro-Example
   cd avro-showcase
   ```

2. **Install Dependencies**:
   Ensure you have Java and Maven installed. Then, run:
   ```bash
   mvn install
   ```

3. **Run the Examples**:
   Use the following commands to run the included examples:
   ```bash
   mvn exec:java -Dexec.mainClass=pl.pb.avroexample.Main
   ```

## Examples

### AVDL Example

```avdl
@namespace("com.example.avro")
protocol UserProtocol {
  record User {
    string name;
    int age;
    boolean isActive;
  }
}
```
 

### AVPR Example

```json
{
  "protocol": "UserProtocol",
  "namespace": "com.example.avro",
  "types": [
    {
      "type": "record",
      "name": "User",
      "fields": [
        {"name": "name", "type": "string"},
        {"name": "age", "type": "int"},
        {"name": "isActive", "type": "boolean"}
      ]
    }
  ],
  "messages": {
    "getUser": {
      "request": [{"name": "userId", "type": "string"}],
      "response": "User"
    }
  }
}
```

### AVSC Example

```json
{
  "type": "record",
  "name": "User",
  "namespace": "com.example.avro",
  "fields": [
    {"name": "name", "type": "string"},
    {"name": "age", "type": "int"},
    {"name": "isActive", "type": "boolean"}
  ]
}
```

## How to Contribute

We welcome contributions! Please submit issues and pull requests to improve this project.

1. Fork the repository.
2. Create a feature branch.
3. Commit your changes and push to your fork.
4. Submit a pull request.

## License

Apache License 2.0

---

Learn and have fun :) 