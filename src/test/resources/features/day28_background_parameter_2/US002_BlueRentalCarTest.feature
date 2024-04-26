@US002
Feature: US002 BlueRentalCar sayfasinda login test

  Scenario: TC01 Verilen email ve password ile login olunur

    Given  kullanici BlueRentalCar sayfasina gider
    When login butonuna tiklar
    And kullanici email ve password ile login olur
    And sayfayi kapatir