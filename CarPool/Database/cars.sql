-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 14, 2018 at 07:20 AM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `carpool`
--

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `uname` varchar(25) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phoneNo` varchar(15) DEFAULT NULL,
  `color` varchar(15) DEFAULT NULL,
  `city` varchar(15) DEFAULT NULL,
  `sport` varchar(15) DEFAULT NULL,
  `pass` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`uname`, `age`, `email`, `phoneNo`, `color`, `city`, `sport`, `pass`) VALUES
('sam', 21, 'ab@gmail.com', '1111122222', 'white', 'chd', 'cricket', 'sam@1'),
('vin', 19, 'cd@gmail.com', '3333344444', 'black', 'delhi', 'cricket', 'vin@1'),
('sia', 20, 'ef@gmail.com', '4444455555', 'red', 'shimla', 'tennis', 'sia@1'),
('tim', 23, 'gh@gmail.com', '5555566666', 'green', 'jaipur', 'football', 'tim@1'),
('joe', 21, 'joe@gmail.com', '7777788888', 'blue', 'pkl', 'hockey', 'joe@1');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
