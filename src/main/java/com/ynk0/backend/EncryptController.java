package com.ynk0.backend;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.lang.String;
import java.util.Base64;

@RestController
public class EncryptController {
    @PostMapping("/sha256")
    public ResponseEntity<Object> encryptTosha(@RequestBody Map<String, String> request) {
        String text = request.get("text");
        try {
            MessageDigest sha = MessageDigest.getInstance("SHA-256");
            byte[] inputBytes = text.getBytes();
            byte[] hashBytes = sha.digest(inputBytes);
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            String hash = hexString.toString();
            System.out.println("Hash: " + hash);

            Map<String, Object> object = new HashMap<>();
            object.put("hash", hash);
            return ResponseEntity.ok().body(object);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }

    @PostMapping("/sha512")
    public ResponseEntity<Object> encryptToSHA512(@RequestBody Map<String, String> request) {
        String text = request.get("text");
        try {
            MessageDigest sha = MessageDigest.getInstance("SHA-512");
            byte[] inputBytes = text.getBytes();
            byte[] hashBytes = sha.digest(inputBytes);
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            String hash = hexString.toString();
            System.out.println("Hash: " + hash);

            Map<String, Object> object = new HashMap<>();
            object.put("hash", hash);
            return ResponseEntity.ok().body(object);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }

    @PostMapping("/sha384")
    public ResponseEntity<Object> encryptToSHA384(@RequestBody Map<String, String> request) {
        String text = request.get("text");
        try {
            MessageDigest sha = MessageDigest.getInstance("SHA-384");
            byte[] inputBytes = text.getBytes();
            byte[] hashBytes = sha.digest(inputBytes);
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            String hash = hexString.toString();
            System.out.println("Hash: " + hash);

            Map<String, Object> object = new HashMap<>();
            object.put("hash", hash);
            return ResponseEntity.ok().body(object);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }

    @PostMapping("/sha224")
    public ResponseEntity<Object> encryptToSHA224(@RequestBody Map<String, String> request) {
        String text = request.get("text");
        try {
            MessageDigest sha = MessageDigest.getInstance("SHA-224");
            byte[] inputBytes = text.getBytes();
            byte[] hashBytes = sha.digest(inputBytes);
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            String hash = hexString.toString();
            System.out.println("Hash: " + hash);

            Map<String, Object> object = new HashMap<>();
            object.put("hash", hash);
            return ResponseEntity.ok().body(object);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }

    @PostMapping("/sha1")
    public ResponseEntity<Object> encryptToSHA1(@RequestBody Map<String, String> request) {
        String text = request.get("text");
        try {
            MessageDigest sha = MessageDigest.getInstance("SHA-1");
            byte[] inputBytes = text.getBytes();
            byte[] hashBytes = sha.digest(inputBytes);
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            String hash = hexString.toString();
            System.out.println("Hash: " + hash);

            Map<String, Object> object = new HashMap<>();
            object.put("hash", hash);
            return ResponseEntity.ok().body(object);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }

    @PostMapping("/base64")
	public ResponseEntity<Object> convertB64(@RequestBody Map<String, String> request) {
	    String string = request.get("string");
	    Map<String, Object> object = new HashMap<>();
	    String cadena64 = Base64.getEncoder().encodeToString(string.getBytes());
	    object.put("data", cadena64);
	    return ResponseEntity.ok(object);
	}

}
