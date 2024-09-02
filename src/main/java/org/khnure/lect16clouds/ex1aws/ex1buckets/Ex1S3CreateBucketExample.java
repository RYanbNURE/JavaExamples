package org.khnure.lect16clouds.ex1aws.ex1buckets;

import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.CreateBucketRequest;
import software.amazon.awssdk.services.s3.model.CreateBucketResponse;
import software.amazon.awssdk.services.s3.model.BucketAlreadyExistsException;
import software.amazon.awssdk.services.s3.model.BucketAlreadyOwnedByYouException;


public class Ex1S3CreateBucketExample {
    public static void main(String[] args) {
        // Initialize the S3 client with the dev-profile (or another specified profile)
        S3Client s3 = S3Client.builder()
                .region(Region.EU_CENTRAL_1) // Specify the non-default region (e.g., Asia Pacific (Mumbai))
                .credentialsProvider(ProfileCredentialsProvider.create("dev-profile")) // Specify the profile name
                .build();

        // Define the bucket name
        String bucketName = "etetetawsbucket2";

        try {
            // Create the bucket request with a location constraint
            CreateBucketRequest createBucketRequest = CreateBucketRequest.builder()
                    .bucket(bucketName)
                    .createBucketConfiguration(builder -> builder.locationConstraint("eu-central-1")) // Ensure the location constraint matches the region
                    .build();

            // Create the bucket
            CreateBucketResponse createBucketResponse = s3.createBucket(createBucketRequest);
            System.out.println("Bucket Created: " + createBucketResponse.location()); // Print bucket location

        } catch (BucketAlreadyExistsException | BucketAlreadyOwnedByYouException e) {
            System.err.println("Error: " + e.getMessage()); // Handle bucket already exists scenarios
        } catch (Exception e) {
//            System.err.println(e.awsErrorDetails().errorMessage()); // Print any other error messages
        } finally {
            // Ensure that the S3 client is closed
            s3.close();
        }
    }
}
