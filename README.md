# Backend Encryption API

This repository contains a backend API for encrypting and encoding data using various hashing and encoding algorithms. It provides endpoints to generate hash values using **SHA-256**, **SHA-512**, **SHA-384**, **SHA-224**, and **SHA-1** algorithms, as well as encoding data in **Base64** format.

## Endpoints

### SHA-256 Encryption

- Endpoint: `/sha256`
- Method: POST
- Request Body:

  {
  "text": "Text to encrypt"
  }

- Response Body:

  {
  "hash": "value"
  }

### SHA-512 Encryption

- Endpoint: `/sha512`
- Method: POST
- Request Body:

  {
  "text": "Text to encrypt"
  }

- Response Body:

  {
  "hash": "value"
  }

### SHA-384 Encryption

- Endpoint: `/sha384`
- Method: POST
- Request Body:

  {
  "text": "Text to encrypt"
  }

- Response Body:

  {
  "hash": "value"
  }

### SHA-224 Encryption

- Endpoint: `/sha224`
- Method: POST
- Request Body:

  {
  "text": "Text to encrypt"
  }

- Response Body:

  {
  "hash": "value"
  }

### SHA-1 Encryption

- Endpoint: `/sha1`
- Method: POST
- Request Body:

  {
  "text": "Text to encrypt"
  }

- Response Body:

  {
  "hash": "value"
  }

### Base64 Encoding

- Endpoint: `/base64`
- Method: POST
- Request Body:

  {
  "text": "Text to encode"
  }

- Response Body:

  {
  "encoded": "value"
  }

## How to Use

1. Clone this repository to your local machine.
2. Build and run the project using your preferred Java development environment or build tool.
3. Make requests to the provided endpoints using a tool like Postman or curl.
4. Replace `Text to encrypt` or `String to encode` in the request bodies with your own data.

Note: Ensure that you have Java and Spring dependencies properly installed and configured before running the project.

Feel free to explore and use this API for your encryption and encoding needs!
