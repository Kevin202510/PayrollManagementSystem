-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 24, 2021 at 12:32 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `payrolls`
--

-- --------------------------------------------------------

--
-- Table structure for table `deductions`
--

CREATE TABLE `deductions` (
  `ID` int(11) NOT NULL,
  `DEDUCTION_DESCRIPTION` varchar(100) NOT NULL,
  `DEDUCTION_RATE` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `deductions`
--

INSERT INTO `deductions` (`ID`, `DEDUCTION_DESCRIPTION`, `DEDUCTION_RATE`) VALUES
(7, 'SSS', 0.5),
(8, 'PHILHEALTH', 0.8);

-- --------------------------------------------------------

--
-- Table structure for table `emplogs`
--

CREATE TABLE `emplogs` (
  `EMPLOG_ID` int(11) NOT NULL,
  `EMP_ID` int(100) NOT NULL,
  `DATEIN` date NOT NULL,
  `TIMEIN` varchar(100) NOT NULL,
  `TIMEOUT` varchar(100) DEFAULT NULL,
  `status` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `emplogs`
--

INSERT INTO `emplogs` (`EMPLOG_ID`, `EMP_ID`, `DATEIN`, `TIMEIN`, `TIMEOUT`, `status`) VALUES
(64, 29, '2021-05-24', '03:15:00 pm', '06:16:00 pm', 0),
(65, 30, '2021-05-24', '03:15:00 pm', '06:15:00 pm', 0),
(66, 29, '2021-05-25', '06:21:00 pm', '06:25:00 pm', 0),
(67, 23, '2021-05-24', '03:27:00 pm', NULL, 1),
(68, 25, '2021-05-24', '03:27:00 pm', NULL, 1),
(69, 17, '2021-05-24', '03:27:00 pm', NULL, 1),
(70, 18, '2021-05-24', '03:27:00 pm', NULL, 1),
(71, 19, '2021-05-24', '03:27:00 pm', '06:29:00 pm', 0);

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `ID` int(11) NOT NULL,
  `EMP_BARCODE` varchar(100) NOT NULL,
  `FIRST_NAME` varchar(100) NOT NULL,
  `MIDDLE_NAME` varchar(100) NOT NULL,
  `LAST_NAME` varchar(100) NOT NULL,
  `ADDRESS` varchar(100) NOT NULL,
  `DOB` date NOT NULL,
  `POSITION_ID` int(11) NOT NULL,
  `DAYS_OF_WORK` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`ID`, `EMP_BARCODE`, `FIRST_NAME`, `MIDDLE_NAME`, `LAST_NAME`, `ADDRESS`, `DOB`, `POSITION_ID`, `DAYS_OF_WORK`) VALUES
(1, '2147483647s', 'Kevin', 'Felix', 'Caluag', 'Caluag', '2001-01-13', 2, 0),
(17, '2956605108', 'gherome', 'dasdasd', 'asdas', 'dasdasd', '2021-05-06', 2, 2),
(18, '5171125480', 'kim', 'asdas', 'dasdas', 'dasda', '2021-05-05', 2, 5),
(19, '7968472877', 'andrea', 'adsdas', 'dasd', 'asdasd', '2021-05-12', 2, 3),
(20, '7968472877', 'andrea', 'adsdas', 'dasd', 'asdasd', '2021-05-12', 2, 2),
(21, '4644673928', 'kase', 'sdsdsf', 'sfsfsff', 'dsfdsfdsfdsfgds', '2021-05-03', 2, 2),
(22, '6443681061', 'third', 'sed', 'car', 'west', '2021-05-10', 2, 2),
(23, '4462476827', 'kurt', 'rerere', 'tata', 'fdfdgrhg', '2021-05-05', 2, 2),
(25, '2747778740', 'heiden', 'tiyan', 'paa', 'sitio sinto', '2021-05-10', 2, 2),
(26, '6324543751', 'tender', 'juicy', 'hotdog', 'cheese', '2021-05-02', 2, 2),
(27, '5563344659', 'toccino', 'kamatis', 'toyo', 'jahhaha', '2021-05-14', 2, 5),
(28, '5404334250', 'suka', 'patis', 'bagong', 'halohalo', '2021-05-12', 2, 2),
(29, '9689501514', 'kape', 'asukal', 'gatas', 'matabang alang lasa', '2021-05-11', 2, 6),
(30, '0268641722', 'libag', 'katas', 'pawis', 'sinampalukan', '2021-09-09', 2, 4),
(31, '6495006810', 'sam', 'pal', 'lok', 'sampalok', '2021-05-19', 2, 3),
(32, '4576069680', 'heart', 'liver', 'kidney', 'la,manloob', '2021-05-26', 2, 4),
(33, '3626377605', 'tinumis', 'sinigang', 'adobo', 'deputa', '2021-05-27', 2, 7),
(34, '8868999397', 'burger', 'siomai', 'lumpia', 'chibugan na', '2021-05-11', 2, 2),
(35, '0042911693', 'wendell', 'aso', 'mabaho', 'usong maligo', '2021-05-10', 2, 8),
(36, '5906180780', 'kim', 'thin', 'ripiti', 'uso kumain ng madami', '2021-05-20', 2, 4),
(37, '6013393769', 'hazel', 'marie', 'oreo', 'dsdsfdsgds', '2021-02-23', 2, 7),
(39, '4750048421', 'sisi', 'sasas', 'seeee', 'fsfdsfdf', '2021-04-04', 2, 6),
(40, '0382009087', 'werwrwe', 'rdgfdg', 'hggfgfg', 'dfsfsdfdgf', '2021-05-18', 2, 5),
(41, '6200560545', 'wewrwre', 'reefg', 'gfhgfgfg', 'fgfgfgf', '2021-05-27', 2, 56),
(42, '4525670434', 'fdgff', 'ggfgd', 'dhgjhgh', 'fgfdgdfgt', '2021-02-22', 2, 5),
(43, '2958956684', 'hghgngn', 'hghthh', 'hghgfhghg', 'hghghghghg', '2021-05-27', 2, 9),
(44, '6427742015', 'ytytyt', 'kiiiiki', 'looooool', 'lololoolol', '2021-05-29', 2, 6),
(45, '3343157674', 'kkilo', 'plkol', 'ikikiuj', 'jyyhtgh', '2021-05-18', 2, 9),
(46, '9619293145', 'hjyjyj', 'jjyjyj', 'yuyuii', 'uikilkl', '2021-05-29', 2, 9),
(47, '0388797349', 'mjmj', 'jhghjg', 'ghghghyuy', 'yuyujyhjyh', '2021-04-26', 2, 9),
(48, '2517338470', 'hlgjk;hj;l', 'jgjhgjh', 'fhgdfh', 'utuyut', '2021-05-29', 2, 7),
(49, '2028042577', 'jkjkjk', 'ghghgh', 'ffgftr', 'gnbbvbv', '2021-12-30', 2, 6),
(50, '7499636426', 'rkghfjgj', 'hkghjkghjgghgkhngh', 'gjfhgjfh', 'gjujfhgh', '2021-11-22', 2, 5);

-- --------------------------------------------------------

--
-- Table structure for table `positions`
--

CREATE TABLE `positions` (
  `ID` int(11) NOT NULL,
  `POS_DESCRIPTION` varchar(100) NOT NULL,
  `RATE_PRICE` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `positions`
--

INSERT INTO `positions` (`ID`, `POS_DESCRIPTION`, `RATE_PRICE`) VALUES
(1, 'ASDA', 4234),
(2, 'Sales Lady', 500),
(6, 'sss', 3452),
(8, 'dasd', 324),
(9, 'sadess', 324),
(10, 'owner', 7);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `deductions`
--
ALTER TABLE `deductions`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `emplogs`
--
ALTER TABLE `emplogs`
  ADD PRIMARY KEY (`EMPLOG_ID`),
  ADD KEY `emplog_empid_foreign` (`EMP_ID`);

--
-- Indexes for table `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `emp_positionid_foreign` (`POSITION_ID`);

--
-- Indexes for table `positions`
--
ALTER TABLE `positions`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `deductions`
--
ALTER TABLE `deductions`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `emplogs`
--
ALTER TABLE `emplogs`
  MODIFY `EMPLOG_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=72;

--
-- AUTO_INCREMENT for table `employees`
--
ALTER TABLE `employees`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT for table `positions`
--
ALTER TABLE `positions`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `emplogs`
--
ALTER TABLE `emplogs`
  ADD CONSTRAINT `emplog_empid_foreign` FOREIGN KEY (`EMP_ID`) REFERENCES `employees` (`ID`);

--
-- Constraints for table `employees`
--
ALTER TABLE `employees`
  ADD CONSTRAINT `emp_positionid_foreign` FOREIGN KEY (`POSITION_ID`) REFERENCES `positions` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
