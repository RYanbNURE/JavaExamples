package org.khnure.lect16clouds.ex1aws.ex1buckets;

import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.ListBucketsRequest;
import software.amazon.awssdk.services.s3.model.ListBucketsResponse;
import software.amazon.awssdk.services.s3.model.S3Exception;
import software.amazon.awssdk.services.s3.model.Bucket;

public class Ex2ListS3Buckets {
    public static void main(String[] args) {
        // Initialize the S3 client
        S3Client s3 = S3Client.builder()
                .region(Region.US_EAST_1) // You can change the region as needed
                .credentialsProvider(ProfileCredentialsProvider.create("dev-profile")) // Specify the profile name
                .build();

        try {
            // Create a request object
            ListBucketsRequest listBucketsRequest = ListBucketsRequest.builder().build();

            // Send the request and get the response
            ListBucketsResponse listBucketsResponse = s3.listBuckets(listBucketsRequest);

            // Iterate through the list of buckets and print their names
            for (Bucket bucket : listBucketsResponse.buckets()) {
                System.out.println("Bucket Name: " + bucket.name()); // Print the bucket name
            }
        } catch (S3Exception e) {
            System.err.println(e.awsErrorDetails().errorMessage()); // Print the error message
        } finally {
            // Ensure that the S3 client is closed
            s3.close();
        }
    }
}
