-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: trainingprogram_db
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `assessment`
--

DROP TABLE IF EXISTS `assessment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `assessment` (
  `assessment_id` int NOT NULL AUTO_INCREMENT,
  `enrollment_id` int NOT NULL,
  `assessment_date` date NOT NULL,
  `assessment_score` int NOT NULL,
  `created_by` int NOT NULL,
  `updated_by` int NOT NULL,
  `created_date` date NOT NULL,
  `updated_date` date NOT NULL,
  PRIMARY KEY (`assessment_id`),
  KEY `enrollment_id` (`enrollment_id`),
  KEY `created_by` (`created_by`),
  KEY `updated_by` (`updated_by`),
  CONSTRAINT `assessment_ibfk_1` FOREIGN KEY (`enrollment_id`) REFERENCES `enrollment` (`enrollment_id`),
  CONSTRAINT `assessment_ibfk_2` FOREIGN KEY (`created_by`) REFERENCES `employee` (`employee_id`),
  CONSTRAINT `assessment_ibfk_3` FOREIGN KEY (`updated_by`) REFERENCES `employee` (`employee_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assessment`
--

LOCK TABLES `assessment` WRITE;
/*!40000 ALTER TABLE `assessment` DISABLE KEYS */;
INSERT INTO `assessment` VALUES (1,1,'2024-04-03',85,1,1,'2024-04-11','2024-04-12'),(2,2,'2024-04-06',70,2,2,'2024-04-12','2024-04-13'),(3,3,'2024-04-10',90,3,3,'2024-04-13','2024-04-14'),(4,4,'2024-04-03',90,1,2,'2024-04-11','2024-04-12'),(5,5,'2024-04-06',80,2,1,'2024-04-12','2024-04-14'),(6,6,'2024-04-10',95,3,3,'2024-04-13','2024-04-15'),(7,7,'2024-04-03',85,1,2,'2024-04-11','2024-04-13'),(8,8,'2024-04-06',85,2,3,'2024-04-12','2024-04-14');
/*!40000 ALTER TABLE `assessment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `employee_id` int NOT NULL AUTO_INCREMENT,
  `employee_firstname` varchar(20) NOT NULL,
  `employee_lastname` varchar(20) NOT NULL,
  `employee_email` varchar(50) NOT NULL,
  `employee_phno` bigint NOT NULL,
  `created_by` int DEFAULT NULL,
  `updated_by` int DEFAULT NULL,
  `created_date` date NOT NULL,
  `updated_date` date NOT NULL,
  PRIMARY KEY (`employee_id`),
  KEY `created_by` (`created_by`),
  KEY `updated_by` (`updated_by`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`created_by`) REFERENCES `employee` (`employee_id`),
  CONSTRAINT `employee_ibfk_2` FOREIGN KEY (`updated_by`) REFERENCES `employee` (`employee_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'John','Mark','johnmark@gmail.com',9074567890,NULL,NULL,'2024-03-01','2024-03-02'),(2,'Jane','Doe','janedoe123@gmail.com',9876543210,1,1,'2024-03-02','2024-03-03'),(3,'Alice','Johnson','alicejohnson@gmail.com',9761234567,1,2,'2024-03-02','2024-03-03'),(4,'Kevin','Williams','kevinwilliams@gmail.com',9998887777,2,1,'2024-03-03','2024-03-04'),(5,'Emily','Mark','emilymark@gmail.com',9445556666,2,2,'2024-03-04','2024-03-05'),(6,'Michael','Jones','michaeljones@gmail.com',9023334444,1,1,'2024-03-04','2024-03-05'),(7,'Sarah','Davis','sarahdavis@gmail.com',9667778888,2,2,'2024-03-06','2024-03-07'),(8,'David','Martinez','davidmartinez@gmail.com',9110223333,1,3,'2024-03-07','2024-03-08'),(9,'Jessin','Martin','jessinmartin@gmail.com',9087665678,1,3,'2024-03-07','2024-03-08'),(10,'Matthew','Garcia','matthewgarcia@gmail.com',9786123454,2,3,'2024-03-08','2024-03-09'),(11,'Andrea','Wilson','andreawilson@gmail.com',9876567898,1,2,'2024-03-09','2024-05-10'),(17,'Merin','John','merinjohn@gmail.com',9087678790,1,2,'2024-03-04','2024-03-05');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enrollment`
--

DROP TABLE IF EXISTS `enrollment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `enrollment` (
  `enrollment_id` int NOT NULL AUTO_INCREMENT,
  `program_id` int NOT NULL,
  `employee_id` int NOT NULL,
  `enrollment_date` date NOT NULL,
  PRIMARY KEY (`enrollment_id`),
  KEY `program_id` (`program_id`),
  KEY `employee_id` (`employee_id`),
  CONSTRAINT `enrollment_ibfk_1` FOREIGN KEY (`program_id`) REFERENCES `training_programs` (`program_id`),
  CONSTRAINT `enrollment_ibfk_2` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`employee_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enrollment`
--

LOCK TABLES `enrollment` WRITE;
/*!40000 ALTER TABLE `enrollment` DISABLE KEYS */;
INSERT INTO `enrollment` VALUES (1,1,4,'2024-03-20'),(2,2,5,'2024-03-21'),(3,3,6,'2024-03-20'),(4,1,7,'2024-03-21'),(5,2,8,'2024-03-22'),(6,3,9,'2024-03-22'),(7,1,10,'2024-03-23'),(8,2,11,'2024-03-24');
/*!40000 ALTER TABLE `enrollment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feedback` (
  `feedback_id` int NOT NULL AUTO_INCREMENT,
  `enrollment_id` int NOT NULL,
  `attendance_status` varchar(20) NOT NULL,
  `feedback_text` varchar(200) NOT NULL,
  `created_by` int NOT NULL,
  `updated_by` int NOT NULL,
  `created_date` date NOT NULL,
  `updated_date` date NOT NULL,
  PRIMARY KEY (`feedback_id`),
  KEY `enrollment_id` (`enrollment_id`),
  KEY `created_by` (`created_by`),
  KEY `updated_by` (`updated_by`),
  CONSTRAINT `feedback_ibfk_1` FOREIGN KEY (`enrollment_id`) REFERENCES `enrollment` (`enrollment_id`),
  CONSTRAINT `feedback_ibfk_2` FOREIGN KEY (`created_by`) REFERENCES `employee` (`employee_id`),
  CONSTRAINT `feedback_ibfk_3` FOREIGN KEY (`updated_by`) REFERENCES `employee` (`employee_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
INSERT INTO `feedback` VALUES (1,1,'Present','Good progress',1,1,'2024-04-10','2024-04-11'),(2,2,'Partially Present','Needs improvement ',2,2,'2024-04-11','2024-04-12'),(3,3,'Present','Good progress',3,3,'2024-04-11','2024-04-12'),(4,4,'Present','Excellent work',1,2,'2024-04-12','2024-04-13'),(5,5,'Present','Very engaged',2,3,'2024-04-12','2024-04-14'),(6,6,'Present','Excellent Work',1,3,'2024-04-14','2024-04-15'),(7,7,'Present','Active participation',2,3,'2024-04-14','2024-04-15'),(8,8,'Present','Attentive and responsive',3,3,'2024-04-15','2024-04-16');
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `training_programs`
--

DROP TABLE IF EXISTS `training_programs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `training_programs` (
  `program_id` int NOT NULL AUTO_INCREMENT,
  `program_name` varchar(50) NOT NULL,
  `program_description` text NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `trainer_id` int NOT NULL,
  `created_by` int NOT NULL,
  `updated_by` int NOT NULL,
  `created_date` date NOT NULL,
  `updated_date` date NOT NULL,
  PRIMARY KEY (`program_id`),
  KEY `trainer_id` (`trainer_id`),
  KEY `created_by` (`created_by`),
  KEY `updated_by` (`updated_by`),
  CONSTRAINT `training_programs_ibfk_1` FOREIGN KEY (`trainer_id`) REFERENCES `employee` (`employee_id`),
  CONSTRAINT `training_programs_ibfk_2` FOREIGN KEY (`created_by`) REFERENCES `employee` (`employee_id`),
  CONSTRAINT `training_programs_ibfk_3` FOREIGN KEY (`updated_by`) REFERENCES `employee` (`employee_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `training_programs`
--

LOCK TABLES `training_programs` WRITE;
/*!40000 ALTER TABLE `training_programs` DISABLE KEYS */;
INSERT INTO `training_programs` VALUES (1,'Leadership Training','Developing leadership skills','2024-04-01','2024-04-03',1,1,2,'2024-03-20','2024-03-21'),(2,'Project Management Workshop','Mastering project management techniques','2024-04-04','2024-04-06',2,2,1,'2024-03-21','2024-03-22'),(3,'Communication Skills Seminar','Improving verbal and written communication','2024-04-08','2024-04-10',3,2,3,'2024-03-21','2024-03-22');
/*!40000 ALTER TABLE `training_programs` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-07 15:11:09
