package org.khnure.lect16clouds.ex1aws.ex1buckets;

import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.model.S3Exception;
import java.nio.file.Paths;

public class Ex3FileUploadExample {
    public static void main(String[] args) {
        // Initialize the S3 client with the dev-profile (or another specified profile)
        S3Client s3 = S3Client.builder()
                .region(Region.EU_CENTRAL_1) // Specify the non-default region (e.g., Asia Pacific (Mumbai))
                .credentialsProvider(ProfileCredentialsProvider.create("dev-profile")) // Specify the profile name
                .build();

        // Define the bucket name and the key for the object (file)
        String bucketName = "etetetawsbucket2";
        String keyName = "uploaded_file.txt";

        // Define the file path
        String filePath = "src/main/resources/lect16/s3/initial_file.txt";

        try {
            // Create the PutObjectRequest
            PutObjectRequest putObjectRequest = PutObjectRequest.builder()
                    .bucket(bucketName)
                    .key(keyName)
                    .build();

            // Upload the file
            s3.putObject(putObjectRequest, RequestBody.fromFile(Paths.get(filePath)));
            System.out.println("File uploaded successfully to bucket: " + bucketName + " at key: " + keyName);

        } catch (S3Exception e) {
            System.err.println(e.awsErrorDetails().errorMessage()); // Print any error messages
        } finally {
            // Ensure that the S3 client is closed
            s3.close();
        }
    }
}
