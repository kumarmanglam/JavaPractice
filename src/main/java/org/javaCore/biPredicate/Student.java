package org.javaCore.biPredicate;

public class Student {
        private int id;
        private String name;
        private String departmentName;
        private int score;

        // Constructor
        public Student(int id, String name, String departmentName, int score) {
            this.id = id;
            this.name = name;
            this.departmentName = departmentName;
            this.score = score;
        }

        // Getters
        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        public int getScore() {
            return score;
        }
}
