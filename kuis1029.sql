-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 13 Des 2017 pada 16.12
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis1029`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `identitas_1029`
--

CREATE TABLE `identitas_1029` (
  `nim` bigint(20) NOT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `jenis_kelamin` varchar(255) DEFAULT NULL,
  `name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `identitas_1029`
--

INSERT INTO `identitas_1029` (`nim`, `alamat`, `jenis_kelamin`, `name`) VALUES
(1, 'rumbai', 'laki', 'si zullll'),
(2, 'rumbai', 'perempuan', 'zulhijah'),
(5, 'rumbai', 'laki', 'haluman');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ipk_1029`
--

CREATE TABLE `ipk_1029` (
  `id` bigint(20) NOT NULL,
  `matkul` varchar(150) NOT NULL,
  `nilai` int(11) NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  `identitas_nim` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `ipk_1029`
--

INSERT INTO `ipk_1029` (`id`, `matkul`, `nilai`, `status`, `identitas_nim`) VALUES
(2, 'bdd', 100, 'a', 2),
(3, 'bdd', 100, 'a', 1),
(4, 'bdd', 100, 'a', 2),
(5, 'bdd', 90, 'a', 1),
(6, 'bdl', 100, 'a', 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `identitas_1029`
--
ALTER TABLE `identitas_1029`
  ADD PRIMARY KEY (`nim`),
  ADD UNIQUE KEY `UK_bh02aoiqxpmv0m1tv6u2l6x4f` (`name`);

--
-- Indexes for table `ipk_1029`
--
ALTER TABLE `ipk_1029`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKto563kau45efc3x2dd13ca91c` (`identitas_nim`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `identitas_1029`
--
ALTER TABLE `identitas_1029`
  MODIFY `nim` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `ipk_1029`
--
ALTER TABLE `ipk_1029`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `ipk_1029`
--
ALTER TABLE `ipk_1029`
  ADD CONSTRAINT `FKto563kau45efc3x2dd13ca91c` FOREIGN KEY (`identitas_nim`) REFERENCES `identitas_1029` (`nim`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
