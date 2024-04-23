Feature: US001 Amazon Home Page Test
  Scenario: TC01 Arama kutusunda iphone aratilir
    Given kullanici amazon sayfasina gider
    When arama kutusunda iphone aratir
    And sayfayi kapatir

    Scenario: TC02 Arama kutusunda samsung aratilir
      Given kullanici amazon sayfasina gider
      When arama kutusunda samsung aratir
      And sayfayi kapatir

Scenario: TC03 Arama kutusunda nutella aratilir
  Given kullanici amazon sayfasina gider
  When arama kutusunda "nutella" aratir
  And sayfayi kapatir