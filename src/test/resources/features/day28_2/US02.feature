@US02
Feature: US002 BlueRentalCar sayfasina gider
  Scenario: TC01 Verilen Email ve Password ile login olur
    Given kullanici blueRentalCar sayfasina gider
    When login butonuna tiklar
    And email ve password bilgileri ile login olur
    And sayfayi kapatir
