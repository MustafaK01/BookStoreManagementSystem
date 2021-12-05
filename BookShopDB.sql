-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Veritabanı: `BookShopDB`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `Bill`
--

CREATE TABLE `Bill` (
  `bill_number` int(11) NOT NULL,
  `user_name` varchar(35) NOT NULL,
  `client_name` varchar(30) NOT NULL,
  `amount` int(11) NOT NULL,
  `seller_name` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `Book`
--

CREATE TABLE `Book` (
  `book_id` int(11) NOT NULL,
  `title` varchar(35) NOT NULL,
  `author` varchar(35) NOT NULL,
  `category` varchar(35) NOT NULL,
  `stock` int(11) NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `User`
--

CREATE TABLE `User` (
  `user_id` int(11) NOT NULL,
  `user_name` varchar(20) NOT NULL,
  `user_phone` varchar(15) NOT NULL,
  `user_address` varchar(30) NOT NULL,
  `user_password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `Bill`
--
ALTER TABLE `Bill`
  ADD PRIMARY KEY (`bill_number`);

--
-- Tablo için indeksler `Book`
--
ALTER TABLE `Book`
  ADD PRIMARY KEY (`book_id`);

--
-- Tablo için indeksler `User`
--
ALTER TABLE `User`
  ADD PRIMARY KEY (`user_id`);
COMMIT;


