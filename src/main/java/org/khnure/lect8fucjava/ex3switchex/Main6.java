package org.khnure.lect8fucjava.ex3switchex;

public class Main6 {
        public static void main(String[] args) {
            String input = "info";
            var response = switch (input) {
                case "error" -> new Result("Error occurred", 404);
                case "info" -> new Result("Request successful", 200);
                default -> new Result("Unknown request", 400);
            };
            System.out.println("Response: " + response);
        }

        static class Result {
            String message;
            int code;

            Result(String message, int code) {
                this.message = message;
                this.code = code;
            }

            public String toString() {
                return "Message: " + message + ", Code: " + code;
            }
        }
    }
// Використання switch виразу для повернення складних об'єктів.
