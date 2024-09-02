package org.khnure.lect16clouds.ex1aws.ex1buckets;

import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.ListBucketsResponse;
import software.amazon.awssdk.services.s3.model.ListObjectsV2Request;
import software.amazon.awssdk.services.s3.model.ListObjectsV2Response;
import software.amazon.awssdk.services.s3.model.S3Object;
import software.amazon.awssdk.services.s3.model.DeleteObjectsRequest;
import software.amazon.awssdk.services.s3.model.Delete;
import software.amazon.awssdk.services.s3.model.DeleteBucketRequest;
import software.amazon.awssdk.services.s3.model.Bucket;
import software.amazon.awssdk.services.s3.model.S3Exception;

import java.util.List;
import java.util.stream.Collectors;

public class Ex5DeleteBucketExample {
    public static void main(String[] args) {
        // Initialize the S3 client with the dev-profile (or another specified profile)
//        S3Client s3 = S3Client.builder()
//                .region(Region.EU_CENTRAL_1) // Specify the non-default region (e.g., Asia Pacific (Mumbai))
//                .credentialsProvider(ProfileCredentialsProvider.create("dev-profile")) // Specify the profile name
//                .build();
//
//        try {
//            // List all buckets
//            ListBucketsResponse listBucketsResponse = s3.listBuckets();
//            for (Bucket bucket : listBucketsResponse.buckets()) {
//                String bucketName = bucket.name();
//                System.out.println("Processing Bucket: " + bucketName);
//
//                // List objects in the bucket
//                ListObjectsV2Request listObjectsV2Request = ListObjectsV2Request.builder()
//                        .bucket(bucketName)
//                        .build();
//                ListObjectsV2Response listObjectsV2Response = s3.listObjectsV2(listObjectsV2Request);
//
//                // If the bucket is not empty, delete all objects
//                if (!listObjectsV2Response.contents().isEmpty()) {
//                    System.out.println("Bucket is not empty, deleting all objects...");
//
//                    // Collect object keys
//                    List<DeleteObjectsRequest.Entry> objectsToDelete = listObjectsV2Response.contents().stream()
//                            .map(s3Object -> DeleteObjectsRequest.Entry.builder().key(s3Object.key()).build())
//                            .collect(Collectors.toList());
//
//                    // Create a batch delete request
//                    DeleteObjectsRequest deleteObjectsRequest = DeleteObjectsRequest.builder()
//                            .bucket(bucketName)
//                            .delete(Delete.builder().objects(objectsToDelete).build())
//                            .build();
//                    s3.deleteObjects(deleteObjectsRequest);
//                    System.out.println("All objects deleted from: " + bucketName);
//                }
//
//                // Delete the bucket
//                DeleteBucketRequest deleteBucketRequest = DeleteBucketRequest.builder()
//                        .bucket(bucketName)
//                        .build();
//                s3.deleteBucket(deleteBucketRequest);
//                System.out.println("Bucket deleted successfully: " + bucketName);
//            }
//
//        } catch (S3Exception e) {
//            System.err.println(e.awsErrorDetails().errorMessage()); // Print any error messages
//        } finally {
//            // Ensure that the S3 client is closed
//            s3.close();
//        }
    }
}
